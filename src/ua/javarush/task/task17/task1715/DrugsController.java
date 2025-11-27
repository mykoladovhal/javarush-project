package ua.javarush.task.task17.task1715;

import java.util.HashMap;
import java.util.Map;

public class DrugsController {
    public static Map<Drug, Integer> allDrugs = new HashMap<Drug, Integer>();   // <Ліки, Кількість>

    static {
        Drug panadol = new Drug();
        panadol.setName("Панадол");
        allDrugs.put(panadol, 5);

        Drug analgin = new Drug();
        analgin.setName("Анальгін");
        allDrugs.put(analgin, 18);

        Drug placebo = new Drug();
        placebo.setName("Плацебо");
        allDrugs.put(placebo, 1);
    }

    public synchronized void buy(Drug drug, int count) {
        String name = Thread.currentThread().getName();
        if (!allDrugs.containsKey(drug)) {
            System.out.println("Нема в наявності");
        }
        Integer currentCount = allDrugs.get(drug);
        if (currentCount < count) {
            System.out.println(String.format("%s хоче %s %d шт. В наявності - %d", name, drug.getName(), count, currentCount));
        } else {
            allDrugs.put(drug, (currentCount - count));
            System.out.println(String.format("%s купив(ла) %s %d шт. Залишилось - %d", name, drug.getName(), count, (currentCount - count)));
        }
    }

    public synchronized void sell(Drug drug, int count) {
        System.out.println(Thread.currentThread().getName() + " Закупка " + drug.getName() + " " + count);
        if (!allDrugs.containsKey(drug)) {
            allDrugs.put(drug, 0);
        }
        Integer currentCount = allDrugs.get(drug);
        allDrugs.put(drug, (currentCount + count));
    }
}
