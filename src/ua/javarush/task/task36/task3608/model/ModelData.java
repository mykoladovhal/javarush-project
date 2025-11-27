package ua.javarush.task.task36.task3608.model;

import ua.javarush.task.task36.task3608.bean.User;

import java.util.List;

// === ModelData - Контейнер состояния приложения ===
// Хранит все данные, которые нужны для отображения в View
public class ModelData {
   private List<User> users;                    // Список пользователей для отображения в UsersView
   private User activeUser;                     // Текущий пользователь для редактирования в EditUserView
   private boolean displayDeletedUserList;      // Флаг: показываем ли удаленных пользователей

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public boolean isDisplayDeletedUserList() {
        return displayDeletedUserList;
    }

    public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
        this.displayDeletedUserList = displayDeletedUserList;
    }

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }
}
