package ua.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ввести з консолі кілька ключів (рядків), пункт 7

        /*
8 Створити змінну movie класу Movie і для кожного введеного рядка (ключа):
8.1 отримати об'єкт використовуючи MovieFactory.getMovie і присвоїти його змінній movie
8.2 вивести на екран movie.getClass().getSimpleName()
        */
      //  Set<String> key = Set.of("soapOpera", "cartoon", "thriller");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {

            Movie movie = MovieFactory.getMovie(line);
            if (movie == null) {
                return;
            }
            System.out.println(movie.getClass().getSimpleName());
        }
        reader.close();
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            // створення об'єкта SoapOpera (мильна опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            //напишіть тут ваш код, пункти 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }
    // Напишіть тут ваші класи, пункт 3
}
