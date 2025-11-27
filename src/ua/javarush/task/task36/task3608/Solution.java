package ua.javarush.task.task36.task3608;

import ua.javarush.task.task36.task3608.controller.Controller;
import ua.javarush.task.task36.task3608.model.FakeModel;
import ua.javarush.task.task36.task3608.model.MainModel;
import ua.javarush.task.task36.task3608.model.Model;
import ua.javarush.task.task36.task3608.view.EditUserView;
import ua.javarush.task.task36.task3608.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        // === ИНИЦИАЛИЗАЦИЯ MVC ===
        // Создаем компоненты архитектуры
        Model model = new MainModel();                    // Модель - хранит данные и бизнес-логику
        UsersView usersView = new UsersView();            // View 1 - показывает список пользователей
        Controller controller = new Controller();          // Controller - связующее звено
        EditUserView editUserView = new EditUserView();   // View 2 - показывает форму редактирования
        
        // Связываем View с Controller (View знает, как отправлять события в Controller)
        editUserView.setController(controller);
        usersView.setController(controller);
        
        // Связываем Controller с Model и View (Controller координирует взаимодействие)
        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        // === ГЕНЕРИРОВАНИЕ СОБЫТИЙ ===
        // 1. Загружаем и показываем всех активных пользователей
        usersView.fireEventShowAllUsers();
        
        // 2. Открываем форму редактирования для пользователя с ID 126
        usersView.fireEventOpenUserEditForm(126L);
        
        // 3. Удаляем пользователя с ID 124
        editUserView.fireEventUserDeleted(124L);
        
        // 4. Изменяем данные пользователя 123 (новое имя "Test", уровень 2)
        editUserView.fireEventUserChanged("Test", 123L, 2);
        
        // 5. Загружаем и показываем удаленных пользователей
        usersView.fireEventShowDeletedUsers();
    }
}
