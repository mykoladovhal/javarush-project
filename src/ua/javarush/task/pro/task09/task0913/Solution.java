package ua.javarush.task.pro.task09.task0913;

/* 
Пошук в рядку
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Щоб стати програмістом, потрібно писати код. Щоб писати код, потрібно вчитися. Для навчання потрібне бажання.";
        String word = "код";
        int indexFromFirstWord = getIndexFromFirstWord(string, word);
        int indexFromLastWord = getIndexFromLastWord(string, word);
        System.out.println("Індекс першого символу першого слова \"" + word + "\" дорівнює " + indexFromFirstWord);
        System.out.println("Індекс першого символу останнього слова \"" + word + "\" дорівнює " + indexFromLastWord);
    }

    public static int getIndexFromFirstWord(String string, String word) {
        //напишіть тут ваш код
      return   string.indexOf(word);
    }

    public static int getIndexFromLastWord(String string, String word) {
        //напишіть тут ваш код
       return string.lastIndexOf(word);

    }
}
