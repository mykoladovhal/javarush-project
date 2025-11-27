package ua.javarush.task.task36.task3608.bean;

// === User - Сущность, представляющая пользователя ===
public class User implements Cloneable {
    private String name;              // Имя пользователя
    private final long id;            // ID пользователя (уникальный, неизменяемый)
    private int level;                // Уровень пользователя

    public static final User NULL_USER = new User(); // Пустой объект для ошибок

    // Конструктор с параметрами
    public User(String name, long id, int level) {
        this.name = name;
        this.id = id;
        this.level = level;
    }

    // Конструктор по умолчанию - создает "нулевого" пользователя
    public User() {
        this("", 0, 0);
    }

    // === Методы бизнес-логики ===
    
    // Проверка: новый ли пользователь (id == 0 означает еще не сохранен в БД)
    public boolean isNew() {
        return id == 0;
    }

    // Копировать пользователя с тем же ID
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException ignored) {
            return NULL_USER;
        }
    }

    // Копировать пользователя с новым ID
    public User clone(long newId) {
        if (this == NULL_USER) return NULL_USER;
        return new User(name, newId, level);
    }

    /////  getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", level=" + level +
                '}';
    }
}