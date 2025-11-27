package ua.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {

    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;
    private List<Path> foundFiles = new ArrayList<>();


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file);
        int sizeFile = content.length;
        String contentStr = new String(content, StandardCharsets.UTF_8);
        String fileName = file.getFileName().toString();

        boolean matches = true;
        if (partOfName != null) matches &= fileName.contains(partOfName);
        if (partOfContent != null) matches &= contentStr.contains(partOfContent);
        if (minSize != 0) matches &= sizeFile >= minSize;
        if (maxSize != 0) matches &= sizeFile <= maxSize;
        if (matches) foundFiles.add(file);

        return FileVisitResult.CONTINUE;
    }

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Path> getFoundFiles() {
        return foundFiles;
    }
}
