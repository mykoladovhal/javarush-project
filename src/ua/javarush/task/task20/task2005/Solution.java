package ua.javarush.task.task20.task2005;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* 
Дуже дивні справи
*/

public class Solution {
    public static void main(String[] args) {
        try {
            //напишіть тут ваш код
            File your_file_name = File.createTempFile("your_file_name", null, new File("/Users/mikoladovgal/javarush/3533672/javarush-project"));
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home"), new Asset("car"));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            //напишіть тут ваш код
            System.out.println(ivanov.equals(somePerson));
            //inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Human human = (Human) o;
            return Objects.equals(name, human.name) && Objects.equals(assets, human.assets);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, assets);
        }

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) throws Exception {
            //напишіть тут ваш код
            PrintWriter printWriter = new PrintWriter(outputStream);
            String isHumanPresent = this.name != null ? "yes" : "no";
            printWriter.println(isHumanPresent);
            printWriter.println(this.name);
            if (!this.assets.isEmpty()) {
                for (Asset current : this.assets)
                    printWriter.println(current.getName());
            }
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //напишіть тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String isHumanPresent = reader.readLine();
            if (isHumanPresent.equals("yes")) {
                this.name = reader.readLine();
                String assetName;
                while ((assetName = reader.readLine()) != null)
                    this.assets.add(new Asset(assetName));
                reader.close();
            }
        }
    }
}
