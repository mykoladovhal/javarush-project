package ua.javarush.task.task19.task1918;

import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/*
Знайомство з тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader readerFile = new BufferedReader(new FileReader(fileName));
        String html = readerFile.lines().collect(Collectors.joining());
        readerFile.close();
        String targetTag = args[0];
        Document doc = Jsoup.parseBodyFragment(html);
        for (Element el : doc.body().getElementsByTag(targetTag)) System.out.println(el.outerHtml());
    }
}

