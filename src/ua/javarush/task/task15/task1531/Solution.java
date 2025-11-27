package ua.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факторіал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //напишіть тут ваш код
        if (n < 0) return "0"; // или можно выбросить исключение, если n отрицательное
        if (n == 0) return "1";
        // Рекурсивно вычисляем факториал: преобразуем результат рекурсии из String в BigInteger
        BigInteger result = BigInteger.valueOf(n).multiply(new BigInteger(factorial(n - 1)));
        return result.toString();

    }
}
