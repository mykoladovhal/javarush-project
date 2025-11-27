package ua.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Розширюємо AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    AmigoOutputStream original;

    public QuestionFileOutputStream(AmigoOutputStream original) {
        this.original = original;
    }

    @Override
    public void flush() throws IOException {
        original.flush();
    }

    @Override
    public void write(int b) throws IOException {
        original.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        original.write(b);

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        original.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Ви дійсно хочете закрити потік? Т/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (reader.readLine().equals("Т")) original.close();
    }
}

