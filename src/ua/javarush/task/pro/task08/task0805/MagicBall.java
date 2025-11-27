package ua.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Безперечно";
    private static final String DEFINITELY = "Безумовно, так";
    private static final String MOST_LIKELY = "Найймовірніше";
    private static final String OUTLOOK_GOOD = "Хороші перспективи";
    private static final String ASK_AGAIN_LATER = "Запитай пізніше";
    private static final String TRY_AGAIN = "Спробуй ще";
    private static final String NO = "Моя відповідь — ні";
    private static final String VERY_DOUBTFUL = "Вельми сумнівно";

    public static String getPrediction() {
        //напишіть тут ваш код
        return switch (new Random().nextInt(8)) {
            case 0 -> CERTAIN;
            case 1 -> DEFINITELY;
            case 2 -> MOST_LIKELY;
            case 3 -> OUTLOOK_GOOD;
            case 4 -> ASK_AGAIN_LATER;
            case 5 -> TRY_AGAIN;
            case 6 -> NO;
            case 7 -> VERY_DOUBTFUL;
            default -> null;
        };

    }

}
