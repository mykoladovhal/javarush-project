package ua.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кросворд
*/

public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        List<Word> words =   detectAllWords(crossword, "home", "same", "kerpo");
        for (Word w : words) {
            System.out.println(w);
        }
        /*
Результат, що очікується
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {

        List<Word> foundWords = new ArrayList<>();

        int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};   // направления X
        int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};  // направления Y

        int rows = crossword.length;
        int cols = crossword[0].length;

        for (String word : words) {
            char[] wChars = word.toCharArray();

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (crossword[i][j] == wChars[0]) {
                        for (int dir = 0; dir < 8; dir++) {
                            int x = i, y = j;
                            int k;

                            for (k = 1; k < wChars.length; k++) {
                                x += dx[dir];
                                y += dy[dir];
                                if (x < 0 || x >= rows || y < 0 || y >= cols || crossword[x][y] != wChars[k]) {
                                    break;
                                }
                            }

                            if (k == wChars.length) {
                                Word wordNew = new Word(word);
                                wordNew.setStartPoint(j, i);
                                wordNew.setEndPoint(y,x);
                                foundWords.add(wordNew);
                            }
                        }
                    }
                }
            }
        }

        return foundWords;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
