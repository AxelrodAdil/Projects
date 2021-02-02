package OOP_Java.Lab_13.L3;

public class chetyreU extends Tochka{

    public chetyreU (int x1_m, int y1_m, int x2_m, int y2_m, int x3_m, int y3_m, int x4_m, int y4_m){
        super(x1_m, y1_m, x2_m, y2_m, x3_m, y3_m, x4_m, y4_m);
    }

    public void Ocruzh(){
        int a = path_(getX1(),getY1(), getX2(), getY2());
        int b = path_(getX2(), getY2(), getX3(), getY3());
        int c = path_(getX3(), getY3(), getX4(), getY4());
        int d = path_(getX4(), getY4(), getX1(), getY1());
        if (a+d == c+b){
            System.out.println("chetyreU_Ocruzh DA!");
        } else {
            System.out.println("chetyreU_Ocruzh NO!");
        }
    }
}
