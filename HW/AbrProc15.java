package Solutions;

import java.util.Scanner;
import static java.lang.System.out;

class IntRef <T> {
    private T mValue;

    public IntRef (T value){
        setValue(value);
    }

    public T getValue (){
        return mValue;
    }

    public void setValue (T value){
        mValue = value;
    }

    @Override
    public  String toString(){
        return mValue.toString();
    }
}

public class AbrProc15 {
    static Scanner sc = new Scanner(System.in);

    static <T> void Swap (IntRef<T> x, IntRef<T> y){
        T temp = x.getValue();
        x.setValue(y.getValue());
        y.setValue(temp);
    }

    static void shiftLeft3(IntRef a, IntRef b, IntRef c){
        Swap(a, b);
        Swap(c, b);
    }

    public static void main(String[] args) {
        for (int i = 0; i<2; i++){
            IntRef <Integer> a = new IntRef<>(sc.nextInt());
            IntRef <Integer> b = new IntRef<>(sc.nextInt());
            IntRef <Integer> c = new IntRef<>(sc.nextInt());

            shiftLeft3(a, b, c);
            out.println(a + " " + b + " " + c);
        }
    }
}