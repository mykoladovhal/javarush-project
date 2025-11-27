package ua.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Додавання файлу до архіву
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Path zipPath = Paths.get(args[1]);
        Path tempZip = Files.createTempFile("temp_archive", ".zip");
        File fileToAdd = new File(args[0]);

        try (ZipInputStream zin = new ZipInputStream(Files.newInputStream(zipPath));
             ZipOutputStream zout = new ZipOutputStream(Files.newOutputStream(tempZip))) {
            ZipEntry entry;
            byte[] buffer = new byte[1024];
            int len;

            while ((entry = zin.getNextEntry()) != null) {
                if (entry.getName().equals("new/" + fileToAdd.getName())) continue;
                zout.putNextEntry(new ZipEntry(entry.getName()));
                while ((len = zin.read(buffer)) > 0) zout.write(buffer, 0, len);
                zout.closeEntry();
                zin.closeEntry();
            }
            zout.putNextEntry(new ZipEntry("new/" + fileToAdd.getName()));
            Files.copy(fileToAdd.toPath(), zout);
            zout.closeEntry();
            Files.move(tempZip, zipPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
