package ua.javarush.task.task22.task2201;

public class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        final String string = "%s : %s : %s";
        if (Solution.FIRST_THREAD_NAME.equals(t.getName())) {
            System.out.println(getFormattedStringForFirstThread(t, e, string));
        } else if (Solution.SECOND_THREAD_NAME.equals(t.getName())) {
            System.out.println(getFormattedStringForSecondThread(t, e, string));
        } else {
            System.out.println(getFormattedStringForOtherThread(t, e, string));
        }
    }

    protected String getFormattedStringForOtherThread(Thread t, Throwable e, String format) {
        return String.format(format,
                e.getClass().getSimpleName(),
                e.getCause().toString(),
                t.getName());
    }

    protected String getFormattedStringForSecondThread(Thread t, Throwable e, String format) {
        return String.format(format,
                e.getCause().toString(),
                e.getClass().getSimpleName(),
                t.getName());
    }

    protected String getFormattedStringForFirstThread(Thread t, Throwable e, String format) {
        return String.format(format,
                t.getName(),                            // 1#
                e.getClass().getSimpleName(),           // StringForFirstThreadTooShortException
                e.getCause().toString());               // java.lang.StringIndexOutOfBoundsException: String index out of range: -1
    }
}

