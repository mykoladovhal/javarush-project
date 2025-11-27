package ua.javarush.task.task36.task3608.view;

import ua.javarush.task.task36.task3608.bean.User;
import ua.javarush.task.task36.task3608.controller.Controller;
import ua.javarush.task.task36.task3608.model.ModelData;

// === EditUserView - Форма редактирования пользователя ===
// Задача: 1) Показывать форму редактирования одного пользователя
//         2) Генерировать события: удаление, сохранение изменений
public class EditUserView implements View {
    private Controller controller; // Ссылка для отправки событий

    // === Обновить представление ===
    // Вызывается Controller'ом с данными из Model
    @Override
    public void refresh(ModelData modelData) {
        System.out.println("User to be edited:");
        System.out.printf("\t%s\n", modelData.getActiveUser()); // Выводим активного пользователя
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller; // Сохраняем ссылку на Controller для отправки событий
    }

    // === СОБЫТИЕ: Пользователь нажал "Удалить пользователя" ===
    public void fireEventUserDeleted(long id) {
        this.controller.onUserDelete(id); // Отправляем событие удаления
    }

    // === СОБЫТИЕ: Пользователь нажал "Сохранить изменения" ===
    public void fireEventUserChanged(String name, long id, int level) {
        this.controller.onUserChange(name, id, level); // Отправляем событие с новыми данными
    }
}
