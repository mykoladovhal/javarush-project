package ua.javarush.task.task20.task2002;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

/* 
Читаємо та пишемо до файлу: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        try {
            //напишіть тут ваш код
            User user1 = new User(), user2 = new User();
            user1.setFirstName("Marina");
            user1.setLastName("Dovgal");
            user1.setMale(false);
            user1.setBirthDate(new Date(76, Calendar.MARCH, 14));
            user1.setCountry(User.Country.UKRAINE);

            user2.setFirstName("Dima");
            user2.setLastName("Dovgal");
            user2.setMale(true);
            user2.setBirthDate(new Date(103, Calendar.DECEMBER, 18));
            user2.setCountry(User.Country.UKRAINE);

            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //напишіть тут ваш код
            javaRush.users = Arrays.asList(user1, user2);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //напишіть тут ваш код
            System.out.println(loadedObject.equals(javaRush));
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //напишіть тут ваш код
            PrintWriter writer = new PrintWriter(outputStream);
            users.forEach(user -> {
                writer.println(user.getFirstName());
                writer.println(user.getLastName());
                writer.println(user.isMale() ? "yes" : "no");
                writer.println(user.getBirthDate().getTime());
                writer.println(user.getCountry().name());
            });
            writer.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            //напишіть тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()) {
                User user = new User();
                user.setFirstName(reader.readLine());
                user.setLastName(reader.readLine());
                user.setMale(reader.readLine().equals("yes"));
                user.setBirthDate(new Date(Long.parseLong(reader.readLine())));
                user.setCountry(User.Country.valueOf(reader.readLine()));
                this.users.add(user);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
