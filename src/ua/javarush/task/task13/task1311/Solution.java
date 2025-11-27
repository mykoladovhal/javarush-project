package ua.javarush.task.task13.task1311;

/* 
Наймаємо перекладача
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "Я перекладач з " + getLanguage();
        }
    }
  public static class EnglishTranslator extends Translator {

      @Override
      public String getLanguage() {
          return "англійської";
      }
  }
}