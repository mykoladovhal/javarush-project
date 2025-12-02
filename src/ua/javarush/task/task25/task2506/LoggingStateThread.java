package ua.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    Thread loggingThread;

    public LoggingStateThread(Thread task) {
        this.loggingThread = task;
    }

    @Override
    public void run() {
        Thread.State prevState = null;
        while (true) {
            Thread.State currentState = loggingThread.getState();
            if (currentState != prevState) {
                System.out.println(currentState.name());
                prevState = currentState;
            }
            if (currentState == Thread.State.TERMINATED) break;
        }
    }
}
