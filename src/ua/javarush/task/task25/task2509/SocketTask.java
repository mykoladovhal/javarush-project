package ua.javarush.task.task25.task2509;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

/**
 * Абстрактный класс для задач, которые работают с сетевыми сокетами.
 * Обеспечивает безопасную отмену задачи с правильным закрытием ресурсов (сокета).
 */
public abstract class SocketTask<T> implements CancellableTask<T> {
    // Сокет для сетевого соединения - критический ресурс, требующий закрытия при отмене
    private Socket socket;

    /**
     * Устанавливает сокет для данной задачи.
     * Синхронизирован для безопасного доступа из разных потоков.
     */
    protected synchronized void setSocket(Socket socket) {
        this.socket = socket;
    }

    /**
     * Отменяет задачу и закрывает все связанные ресурсы (сокет).
     * Синхронизирован для безопасного доступа из разных потоков.
     */
    public synchronized void cancel() {
        try {
            // Закрываем сокет если он существует
            // Socket.close() безопасна - повторное закрытие не вызывает ошибку
            if (socket != null) socket.close();
        } catch (IOException ignore) {
            // Игнорируем ошибки при закрытии сокета
            // Сокет уже может быть закрыт или порван
        }
    }

    /**
     * Создает управляемую версию задачи (FutureTask) с поддержкой отмены.
     * Переопределяет метод cancel() для правильного закрытия ресурсов.
     */
    public RunnableFuture<T> newTask() {
        return new FutureTask<T>(this) {
            /**
             * Переопределенный метод отмены.
             * Гарантирует, что ресурсы (сокет) будут закрыты перед отменой задачи.
             * 
             * @param mayInterruptIfRunning если true - поток может быть прерван
             * @return true если задача успешно отменена, false если она уже завершена
             */
            public boolean cancel(boolean mayInterruptIfRunning) {
                try {
                    // Сначала закрываем все ресурсы через метод cancel() SocketTask
                    SocketTask.this.cancel();
                } finally {
                    // finally гарантирует, что super.cancel() будет вызван даже если было исключение
                    // Это необходимо для правильной отмены задачи в FutureTask
                    return super.cancel(mayInterruptIfRunning);
                }
            }
        };
    }
}