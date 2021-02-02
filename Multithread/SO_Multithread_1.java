package Multithread;

import java.lang.*;

public class SO_Multithread_1 implements Runnable {

    Thread t;

    public void run() {
        for (int i = 10; i < 13; i++) {
            System.out.println("here");
            System.out.println(Thread.currentThread().getName() + "  " + i);
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(4000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new SO_Multithread_1());
        // this will call run() function
        t.start();
    }
} 