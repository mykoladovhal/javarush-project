package ua.javarush.task.task20.task2022;

import java.io.*;
import java.util.Objects;

/* 
Перевизначення серіалізації у потоці
*/

public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(fileName, true);

    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) {
        try (Solution solution = new Solution("test.sob")) {

            solution.writeObject("Testing");
            File tempFile = File.createTempFile("person_", ".ser");
            tempFile.deleteOnExit();
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(tempFile))) {
                oos.writeObject(solution);
            }
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(tempFile))) {
                Solution deserialized = (Solution) ois.readObject();
                System.out.println(solution.equals(deserialized));
            }
        } catch (Exception ignore) {
        }
    }
}
