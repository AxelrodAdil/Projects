/*package Multithread.console;

public class calc_time extends Thread {
    private int time;
    private volatile boolean asleep;

    public int getTime(){
        return time;
    }

    public String myTimerToString() {

        StringBuilder timerStr = new StringBuilder();
        timerStr.append(" | Seconds: ");
        timerStr.append(getTime());

        return timerStr.toString();
    }


    public void run() {
        while(! this.interrupted()) {
            try {
                synchronized (this) {
                    if (asleep) {
                        wait();
                    }
                }
                this.sleep(1000);
                this.time++;
            } catch (InterruptedException e) {
                this.interrupt();
                System.out.println(getName() + " was interrupted");
            }
        }
    }
}*/