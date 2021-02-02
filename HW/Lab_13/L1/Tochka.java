package OOP_Java.Lab_13.L1;

public class Tochka {
    private int x1, y1;
    private int x2, y2;
    private int x3, y3;
    private int x4, y4;

    public Tochka(int x1_m, int y1_m, int x2_m, int y2_m, int x3_m, int y3_m, int x4_m, int y4_m){
        this.x1 = x1_m;
        this.y1 = y1_m;
        this.x2 = x2_m;
        this.y2 = y2_m;
        this.x3 = x3_m;
        this.y3 = y3_m;
        this.x4 = x4_m;
        this.y4 = y4_m;
    }

    public String getArea(){
        String ans = "Cub's area is: ";
        double ansd = Math.sqrt( (getX1()-getX2())*(getX1()-getX2()) + (getY1()-getY2())*(getY1()-getY2()) );
        double answer = ansd*ansd;
        ans = ans + answer;
        return ans;
    }

    public String getVolume(){
        return "Netu";
    }



    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getX3() {
        return x3;
    }

    public int getX4() {
        return x4;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public int getY3() {
        return y3;
    }

    public int getY4() {
        return y4;
    }
}