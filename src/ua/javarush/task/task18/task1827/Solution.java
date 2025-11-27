package ua.javarush.task.task18.task1827;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.List;

/* 
Прайси
*/

/*public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        List<Product> productList = new BufferedReader(new FileReader(fileName)).lines().map(Product::parse).toList();
        int maxId = productList.stream().mapToInt(Product::getId).max().orElse(0);
        Product newProduct = new Product(String.valueOf(++maxId), args[1], args[2], args[3]);
        try (FileWriter fileWriter = new FileWriter(fileName, true)){
            fileWriter.write("\n");
            fileWriter.write(newProduct.toString());
        }

    }

    private record Product(String id, String productName, String price, String quantity) {
            private Product(String id, String productName, String price, String quantity) {
                this.id = String.format("%-8.8s", id);
                this.productName = String.format("%-30.30s", productName);
                this.price = String.format("%-8.8s", price);
                this.quantity = String.format("%-4.4s", quantity);
            }

            private static Product parse(String line) {
                String lineProduct = String.format("%-50s", line);

                String lineId = lineProduct.substring(0, 8).trim();
                String name = lineProduct.substring(8, 38).trim();
                String price = lineProduct.substring(38, 46).trim();
                String quantity = lineProduct.substring(46, 50).trim();
                return new Product(lineId, name, price, quantity);
            }

            private int getId() {
                return Integer.parseInt(id.trim());
            }

            @Override
            public String toString() {
                return id + productName + price + quantity;
            }
        }
}*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Ожидаем: args[1]=productName, args[2]=price, args[3]=quantity
        if (args.length < 4) {
            return;
        }

        // 1. Читаем имя файла из консоли
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine().trim();

        // 2. Считываем все существующие записи в список
        List<Product> productList = new ArrayList<Product>();
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = fileReader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    productList.add(Product.parse(line));
                }
            }
        } finally {
            if (fileReader != null) fileReader.close();
        }

        // 3. Находим максимальный ID
        int maxId = 0;
        for (Product p : productList) {
            if (p.getId() > maxId) {
                maxId = p.getId();
            }
        }
        maxId++;  // новый ID

        // 4. Создаём новый продукт
        Product newProduct = new Product(
                String.valueOf(maxId),
                args[1],
                args[2],
                args[3]
        );

        // 5. Дописываем его в конец файла
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName, true);
            // гарантия новой строки перед записью
            fileWriter.write(System.lineSeparator());
            fileWriter.write(newProduct.toString());
        } finally {
            if (fileWriter != null) fileWriter.close();
        }
    }

    /**
     * Класс-«подражатель» Java Record для старых версий Java.
     * Хранит уже отформатированные поля:
     *   id:      8 позиций, левое- или правое-выравнивание сделано в формате
     *   name:   30 позиций
     *   price:   8 позиций
     *   qty:      4 позиций
     */
    static class Product {
        private final String id;
        private final String name;
        private final String price;
        private final String quantity;

        public Product(String id, String name, String price, String quantity) {
            // %-8.8s  — левое выравнивание в поле 8, максимум 8 символов
            // %-30.30s— левое выравнивание в поле 30, максимум 30 символов
            // %-8.8s  — левое выравнивание в поле 8, максимум 8 символов
            // %-4.4s  — левое выравнивание в поле 4, максимум 4 символа
            this.id       = String.format("%-8.8s", id);
            this.name     = String.format("%-30.30s", name);
            this.price    = String.format("%-8.8s", price);
            this.quantity = String.format("%-4.4s", quantity);
        }

        /** Из фиксированной-width-строки возвращает новый объект */
        public static Product parse(String line) {
            // Подстраховка: если строка короче 50 символов, добиваем пробелами
            String s = line;
            if (s.length() < 50) {
                StringBuilder sb = new StringBuilder(s);
                while (sb.length() < 50) {
                    sb.append(' ');
                }
                s = sb.toString();
            }

            String idPart       = s.substring(0,  8).trim();
            String namePart     = s.substring(8,  38).trim();
            String pricePart    = s.substring(38, 46).trim();
            String quantityPart = s.substring(46, 50).trim();

            return new Product(idPart, namePart, pricePart, quantityPart);
        }

        /** Нужен для вычисления maxId */
        public int getId() {
            try {
                return Integer.parseInt(id.trim());
            } catch (NumberFormatException e) {
                return 0;
            }
        }

        /** Собирает строку ровно 8+30+8+4 = 50 символов */
        @Override
        public String toString() {
            return id + name + price + quantity;
        }
    }
}