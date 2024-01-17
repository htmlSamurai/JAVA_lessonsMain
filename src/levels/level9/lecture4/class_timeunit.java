package levels.level9.lecture4;

import java.util.concurrent.TimeUnit;

public class class_timeunit {

    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        //напишите тут ваш код
        TimeUnit.DAYS.sleep(1);
        TimeUnit.HOURS.sleep(1);
        TimeUnit.SECONDS.sleep(30);
        TimeUnit.MICROSECONDS.sleep(30);
        TimeUnit.NANOSECONDS.sleep(13);
        TimeUnit.MINUTES.sleep(31);
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}


