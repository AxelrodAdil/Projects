package Multithread.console;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Timer_seconds implements Runnable {
    private boolean terminated = true;
    private long time_timer2 = 615688;
    private Thread thread2_notMain;

    /* public Timer_seconds(Thread t){
        this.thread2_notMain = t;
    }*/

    public void timer_stopWatch() {
        DateFormat format = new SimpleDateFormat("00:mm:ss");  // 'cause 06:00:00

        long time_timer1 = TimeUnit.SECONDS.toSeconds(System.currentTimeMillis());  // 00:00:01 ...
        long second = TimeUnit.SECONDS.toSeconds(time_timer1) - (TimeUnit.SECONDS.toMinutes(time_timer1) *60);
        long millis_1 = second*1000;
        Date need1 = new Date(millis_1);
        String first = format.format(need1);

        // need timer!
        Date need2 = new Date(time_timer2);  // 00:10:15
        String nd_2 = format.format(need2);
        System.out.print("(" + first + " / " + nd_2 + " )");
        time_timer2 = time_timer2 - 1_000;
    }

    public void sleep_thread2 (Thread thread2) {
        System.out.println("HERE" + thread2.getName());
        try {
            thread2.join();
            thread2.sleep(1000);
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    void terminate() {
        terminated = false;
    }

    public void run() {
        while(terminated) { }
    }
}
