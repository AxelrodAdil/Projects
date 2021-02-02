package Multithread.console;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleProgressBar {
    private ProgressValue progress;
    private ProgressThread target;
    private Thread thread1;

    protected static class ProgressValue {
        protected long total = 0;
        protected long current = 0;

        protected ProgressValue(long n) {
            total = n;
        }

        protected synchronized void setMaxTotal(long n) {
            total = n;
        }

        protected synchronized void stepBy(long n) {
            current = current + n;
            if (current > total) total = current;
        }

        protected synchronized void stepTo(long n) {
            current = n;
            if (current > total) total = current;
        }

        protected synchronized long getCurrent() {
            return current;
        }

        protected synchronized long getTotal() {
            return total;
        }
    }

    public void stepBy(long n) {
        progress.stepBy(n);
    }
    public void stepTo(long n) {
        progress.stepTo(n);
    }
    public void setMaxTotal(long n) {
        progress.setMaxTotal(n);
    }
    public long getTotal() {
        return progress.getTotal();
    }

    public ConsoleProgressBar(long totalItem, long refreshDelay) {
        progress = new ProgressValue(totalItem);
        target = new ProgressThread(progress, refreshDelay);
    }

    public void start() {
        thread1 = new Thread(target);
        thread1.start();
    }

    public void step() {
        progress.stepBy(1);
    }

    public void stop() {
        target.terminate();
        try {
            thread1.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public long getCurrent() {
        return progress.getCurrent();
    }
    private void sleep(int n) {
        target.sleep(n);
    }
    private void refreshProgressBar() {
        target.refreshProgressBar();
    }



    public static void main(String[] args) {
        ConsoleProgressBar bar = new ConsoleProgressBar(10_000, 60);

        /*Timer_seconds tm_main = new Timer_seconds();
        Thread thread2 = new Thread("th2");*/

        PrintDemo PD = new PrintDemo();
        ThreadDemo T1 = new ThreadDemo( "Thread - 2 ", PD );

        long startTime = System.currentTimeMillis();

        // thread2.start();
        T1.start();
        bar.start();
        for (int i = 0; i <= 10_000; i++) {
            bar.refreshProgressBar();
            System.out.printf("%s" + "/10_000 ", bar.getCurrent());

            // need Thread.sleep(1000)
            bar.step();
            bar.sleep(2);  // 60
        }
        // tm_main.terminate();
        bar.stop();

        /*try {
            T1.join();
        } catch ( Exception e) {
            System.out.println("Interrupted");
        }*/

        long endTime = System.currentTimeMillis();
        System.out.println("\nThat took " + (endTime - startTime) + " milliseconds");
        System.exit(1);
    }
}

class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    PrintDemo  PD;

    ThreadDemo(String name, PrintDemo pd) {
        threadName = name;
        PD = pd;
    }

    public void run() {
        // System.out.println("HERE");
        PD.printIt();
    }

    public void start () {
        // System.out.println("\nStarting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

class PrintDemo {
    private long time_timer2 = 20_737;
    private long time_timer1 = 0;
    public void printIt() {
        // System.out.println("Here2");
        try {

            while (true){
                Thread.sleep(2);
                // System.out.println("Here3");
                DateFormat format = new SimpleDateFormat("00:mm:ss");  // 'cause 06:00:00

                // long time_timer1 = TimeUnit.SECONDS.toSeconds(System.currentTimeMillis());  // 00:00:01 ...
                //long second = TimeUnit.SECONDS.toSeconds(time_timer1) - (TimeUnit.SECONDS.toMinutes(time_timer1)*60);
                long millis_1 = time_timer1;
                Date need1 = new Date(millis_1);
                String first = format.format(need1);


                Date need2 = new Date(time_timer2);  // 00:10:15
                String nd_2 = format.format(need2);
                System.out.print("(" + first + " / " + nd_2 + " )");
                time_timer2 = time_timer2 - 2;
                time_timer1 = time_timer1 + 2;
            }

        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
    }
}