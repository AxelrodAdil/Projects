package Multithread;

public class Parallelism {

    interface ICB {
        void call() throws InterruptedException;
    }

    // Cannot be placed in main, lambda cannot write to regional variables
    static int count = 0;

    public static void main(String[] args) {
        var threads = 5;
        var lobj = new Object();
        ICB listener = () -> {
            synchronized (lobj) {
                System.out.println("---15_Line---");
                ++count;
                Thread.sleep(1000);
                System.out.println(count);
            }
        };

        for (var i = 0; i < threads; ++i) {
            var t = new Thread(() -> {
                try {
                    System.out.println("Here");
                    do_it(listener);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            t.start();
        }
    }

    static void do_it(ICB cb) throws InterruptedException {
        /* check cpu parallelism
        while (true){}
        */
        System.out.println("---39_Line---");
        Thread.sleep(1000);
        System.out.println("Multithread.Parallelism");
        cb.call();
    }
}
