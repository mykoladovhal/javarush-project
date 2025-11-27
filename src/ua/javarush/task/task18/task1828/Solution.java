package ua.javarush.task.task18.task1828;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Прайси 2
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fr = new BufferedReader(new FileReader(fileName));
        List<Product> productList = new ArrayList<>();
        String line;
        while ((line = fr.readLine()) != null) {
            productList.add(Product.parse(line));
        }
        fr.close(); switch (args[0]) {
            case "-u":
                for (Product product : productList) {
                    if (product.id.trim().equals(args[1])) {
                        product.setName(args[2]);
                        product.setPrice(args[3]);
                        product.setQuantity(args[4]);
                    }
                }
                break;
            case "-d":
                productList.removeIf(product -> product.id.trim().equals(args[1]));
                break;
        }
try (FileWriter fileWriter = new FileWriter(fileName)){
    for (Product product : productList) {
        fileWriter.write(product.toString());
        fileWriter.write("\n");
    }

}

    }

    static class Product {
        private  String id;
        private  String name;
        private  String price;
        private  String quantity;

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

        public void setName(String name) {
            this.name = String.format("%-30.30s", name);
        }

        public void setPrice(String price) {
            this.price = String.format("%-8.8s", price);
        }

        public void setQuantity(String quantity) {
            this.quantity = String.format("%-4.4s", quantity);
        }

        /** Собирает строку ровно 8+30+8+4 = 50 символов */
        @Override
        public String toString() {
            return id + name + price + quantity;
        }
    }
}

