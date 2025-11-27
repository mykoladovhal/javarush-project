package ua.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(reader.readLine()), b = new BigInteger(reader.readLine());
        reader.close();
        System.out.println(a.gcd(b));
    }
}
