package ua.javarush.task.task36.task3608.model;


import ua.javarush.task.task36.task3608.model.service.UserService;
import ua.javarush.task.task36.task3608.model.service.UserServiceImpl;
import ua.javarush.task.task36.task3608.bean.User;

import java.util.List;

// === MODEL - Хранит данные и бизнес-логику ===
// Задача: 1) Загружает/изменяет данные через UserService
//         2) Сохраняет состояние в ModelData
//         3) Предоставляет данные View через getModelData()
public class MainModel implements Model {
    private ModelData modelData = new ModelData();        // Контейнер для всех данных
    private UserService userService = new UserServiceImpl(); // Сервис для работы с пользователями

    @Override
    public ModelData getModelData() {
        return modelData; // Возвращаем текущее состояние данных
    }

    // === Загрузить активных пользователей (уровни 1-100) ===
    @Override
    public void loadUsers() {
        modelData.setUsers(getAllUsers());              // Получаем активных пользователей
        modelData.setDisplayDeletedUserList(false);     // Флаг: показываем активных, не удаленных
    }

    // === Вспомогательный метод: получить всех активных пользователей ===
    private List<User> getAllUsers() {
        // Загружаем пользователей уровней 1-100, затем фильтруем только активных
        return userService.filterOnlyActiveUsers(userService.getUsersBetweenLevels(1, 100));
    }

    // === Загрузить удаленных пользователей ===
    public void loadDeletedUsers() {
        modelData.setUsers(userService.getAllDeletedUsers()); // Только удаленные
        modelData.setDisplayDeletedUserList(true);            // Флаг: показываем удаленных
    }

    // === Загрузить одного пользователя по ID ===
    public void loadUserById(long userId) {
        User user = userService.getUsersById(userId); // Поиск по ID
        modelData.setActiveUser(user);                 // Сохраняем как активного для редактирования
    }

    // === Удалить пользователя по ID ===
    public void deleteUserById(long id) {
        userService.deleteUser(id);     // UserService помечает пользователя как удаленный
        modelData.setUsers(getAllUsers()); // Перезагружаем список активных (удаленный исчезнет)
    }

    // === Изменить данные пользователя ===
    public void changeUserData(String name, long id, int level) {
        userService.createOrUpdateUser(name, id, level); // Сохраняем/обновляем пользователя в БД
        modelData.setUsers(getAllUsers());               // Перезагружаем список с обновленными данными
    }
}
