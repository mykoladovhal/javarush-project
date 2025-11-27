package ua.javarush.task.task36.task3608.view;

import ua.javarush.task.task36.task3608.controller.Controller;
import ua.javarush.task.task36.task3608.model.ModelData;

// === UsersView - Представление списка пользователей ===
// Задача: 1) Отображать список активных или удаленных пользователей
//         2) Генерировать события при действиях пользователя (клики и т.д.)
public class UsersView implements View {
    private Controller controller; // Ссылка для отправки событий

    // === Обновить представление ===
    // Вызывается Controller'ом с новыми данными из Model
    @Override
    public void refresh(ModelData modelData) {
        // Проверяем флаг: что показывать - активных или удаленных?
        if (modelData.isDisplayDeletedUserList()) {
            System.out.println("All deleted users:");  // Заголовок для удаленных
            modelData.getUsers().forEach(user -> System.out.printf("\t%s\n", user));
            System.out.println("===================================================");
        } else {
            System.out.println("All users:");          // Заголовок для активных
            modelData.getUsers().forEach(user -> System.out.printf("\t%s\n", user));
            System.out.println("===================================================");
        }
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller; // Сохраняем ссылку на Controller для отправки событий
    }

    // === СОБЫТИЕ: Пользователь нажал "Показать всех пользователей" ===
    public void fireEventShowAllUsers() {
        controller.onShowAllUsers(); // Отправляем событие в Controller
    }

    // === СОБЫТИЕ: Пользователь нажал "Показать удаленных" ===
    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers(); // Отправляем событие в Controller
    }

    // === СОБЫТИЕ: Пользователь выбрал пользователя для редактирования ===
    public void fireEventOpenUserEditForm(long id) {
        controller.onOpenUserEditForm(id); // Отправляем событие с ID пользователя
    }
}
