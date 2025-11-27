package ua.javarush.task.task14.task1408;

public class PolishHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 12;
    }

    @Override
    String getDescription() {
        return String.format("%s Моя країна - %s. Я несу %d яєць на місяць.", super.getDescription(), Country.POLAND, getCountOfEggsPerMonth());

    }
}
