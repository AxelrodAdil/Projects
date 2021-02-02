package OOP_Java.Lab_13.L3;


public class main {
    public static void main(String[] args) {
        Tochka tochka = new chetyreU(0, 0, 2, 0, 0, 2, 2, 2);
        System.out.println(tochka.path_(0, 0, 2, 0));
        System.out.println("-------------------");
        chetyreU chetyreU = new chetyreU(0, 0, 2, 0, 0, 2, 2, 2);
        chetyreU.Ocruzh();
        System.out.println(chetyreU.path_(0, 0, 2, 0));
        System.out.println("-------------------");
        ParallD parallD = new ParallD(0, 0, 2, 0, 0, 2, 2, 2);
        parallD.gdeMy();
        parallD.Ocruzh();
        System.out.println(parallD.path_(0, 0, 2, 0));
    }
}