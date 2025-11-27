package ua.javarush.task.task25.task2503;

public interface Columnable {

    /**
     * @return повне им'я колонки
     */
    String getColumnName();

    /**
     * Повертає true, якщо колонка видима, інакше false
     */
    boolean isShown();

    /**
     * Приховує колонку - маркує колонку -1 у масиві realOrder.
     * Зсуває індекси відображуваних колонок, які йдуть після прихованої
     */
    void hide();

    /**
     * Повертає порядок константи в енумі.
     *
     * @return порядок константи в енумі
     */
    int ordinal();
}
