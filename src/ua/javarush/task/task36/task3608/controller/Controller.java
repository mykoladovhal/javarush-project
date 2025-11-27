package ua.javarush.task.task36.task3608.controller;

import ua.javarush.task.task36.task3608.model.Model;
import ua.javarush.task.task36.task3608.view.EditUserView;
import ua.javarush.task.task36.task3608.view.UsersView;

// === CONTROLLER - Связующее звено между View и Model ===
// Задача: 1) Получает события от View
//         2) Обрабатывает их, вызывая методы Model
//         3) Обновляет View с новыми данными из Model
public class Controller {
    private Model model;              // Ссылка на модель
    private UsersView usersView;      // Ссылка на представление списка
    private EditUserView editUserView; // Ссылка на форму редактирования

    public void setModel(Model model) {
        this.model = model;
    }

    // === СОБЫТИЕ: Показать всех активных пользователей ===
    // Поток: View → Controller → Model → View.refresh()
    public void onShowAllUsers() {
        model.loadUsers();                           // 1. Model загружает активных пользователей
        usersView.refresh(model.getModelData());    // 2. View обновляется (выводит список)
    }

    // === СОБЫТИЕ: Показать всех удаленных пользователей ===
    public void onShowAllDeletedUsers() {
        model.loadDeletedUsers();                   // 1. Model загружает удаленных пользователей
        usersView.refresh(model.getModelData());    // 2. View обновляется (выводит список удаленных)
    }

    // === СОБЫТИЕ: Открыть форму редактирования пользователя ===
    public void onOpenUserEditForm(long userId) {
        model.loadUserById(userId);                 // 1. Model загружает пользователя по ID
        editUserView.refresh(model.getModelData()); // 2. EditUserView обновляется (выводит форму)
    }

    // === СОБЫТИЕ: Удалить пользователя ===
    public void onUserDelete(long id) {
        model.deleteUserById(id);                   // 1. Model удаляет пользователя
        usersView.refresh(model.getModelData());    // 2. UsersView обновляется (показывает обновленный список)
    }

    // === СОБЫТИЕ: Изменить данные пользователя ===
    public void onUserChange(String name, long id, int level) {
        model.changeUserData(name, id, level);      // 1. Model сохраняет изменения
        usersView.refresh(model.getModelData());    // 2. UsersView обновляется (показывает измененные данные)
    }

    public void setUsersView(UsersView usersView) {
        this.usersView = usersView;
    }

    public void setEditUserView(EditUserView editUserView) {
        this.editUserView = editUserView;
    }
}
