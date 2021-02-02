package OOP_Java.Lab_13.L1;

public class Cub extends Tochka{

    public Cub (int x1_m, int y1_m, int x2_m, int y2_m, int x3_m, int y3_m, int x4_m, int y4_m){
        super(x1_m, y1_m, x2_m, y2_m, x3_m, y3_m, x4_m, y4_m);
    }


    public String getVolume(){
        String str = "Here Cub_vol ";
        double ans = Math.sqrt( (getX1()-getX2())*(getX1()-getX2()) + (getY1()-getY2())*(getY1()-getY2()) );
        double answer = ans*ans*ans;
        str = str + answer;
        return str;
    }

    @Override
    public String getArea() {
        return super.getArea();
    }
}