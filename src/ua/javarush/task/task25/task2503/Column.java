package ua.javarush.task.task25.task2503;

import java.util.*;
import java.util.stream.Collectors;

public enum Column implements Columnable{
    Customer("Customer"),
    BankName("Bank Name"),
    AccountNumber("Account Number"),
    Amount("Available Amount");

    private String columnName;

    private static int[] realOrder;

    private Column(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Задає новий порядок відображення колонок, що зберігається в масиві реальноїOrder.
     * realOrder[індекс в энуме] = порядок відображення; -1, якщо колонка не відображається.
     *
     * @param newOrder нова послідовність колонок, в якій вони відображатимуться в таблиці
     * @throws IllegalArgumentException при дублікаті колонки
     */
    public static void configureColumns(Column... newOrder) {
        realOrder = new int[values().length];
        for (Column column : values()) {
            realOrder[column.ordinal()] = -1;
            boolean isFound = false;

            for (int i = 0; i < newOrder.length; i++) {
                if (column == newOrder[i]) {
                    if (isFound) {
                        throw new IllegalArgumentException("Column '" + column.columnName + "' is already configured.");
                    }
                    realOrder[column.ordinal()] = i;
                    isFound = true;
                }
            }
        }
    }

    /**
     * Обчислює та повертає список відображених колонок у налаштованому порядку (див. метод configureColumns)
     * Використовується поле realOrder.
     *
     * @return список колонок
     */
    public static List<Column> getVisibleColumns() {
        List<Column> result = new LinkedList<>();
       return Arrays.stream(values()).filter(column -> realOrder[column.ordinal()] != -1)
                .sorted(Comparator.comparingInt(c -> realOrder[c.ordinal()]))
                .collect(Collectors.toList());
       // return result;
    }

    @Override
    public String getColumnName() {
        return columnName;
    }

    @Override
    public boolean isShown() {
        return realOrder[ordinal()] != -1;
    }

    @Override
    public void hide() {
        realOrder[ordinal()] = -1;
    }
}
