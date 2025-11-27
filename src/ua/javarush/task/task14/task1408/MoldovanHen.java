package ua.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 110;
    }
    @Override
    String getDescription() {
        return String.format("%s Моя країна - %s. Я несу %d яєць на місяць.", super.getDescription(), Country.MOLDOVA, getCountOfEggsPerMonth());

    }
}
