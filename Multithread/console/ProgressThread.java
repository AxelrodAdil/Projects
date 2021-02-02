package Multithread.console;

import Multithread.console.ConsoleProgressBar.ProgressValue;

public class ProgressThread implements Runnable {

    private static final int width = 25;
    private volatile boolean terminated;
    private ProgressValue progressRef;
    private long timeMS;

    public ProgressThread(ProgressValue ref, long refreshDelay) {
        progressRef = ref;
        timeMS = refreshDelay;
        terminated = false;
    }

    void sleep(int n) {
        try {
            Thread.sleep(n);
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void refreshProgressBar() {
        StringBuilder sb = new StringBuilder("\rTest  [");
        int percent = (int) Math.floor(100.0 * progressRef.current / progressRef.total);

        for (int i = 0; i < width; i++) {
            if (i < (percent / 4)){
                sb.append("=");
            } else if (i == (percent / 4)) {
                sb.append(">");
            } else {
                sb.append(" ");
            }
        }

        sb.append("] %s  ");

        if (percent >= 100) sb.append("%n");
        System.out.printf(sb.toString(), percent + "%");
    }

    void terminate() {
        terminated = true;
    }

    public void run() {
        while(terminated) { }
    }
}