package Solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class CalculatorV1 {

    public static int calc (int a, int b, char operationCalc){
        int result;
        switch (operationCalc){
            case '+':
                result = a+b;
                break;
            case'-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
            default:
                System.out.println("Operation ERROR. Retry...");
                result = calc(a, b, getOperation());
        }
        return result;
    }

    public static char getOperation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Operation?");
        char operaionCalc;
        if(sc.hasNext()){
            operaionCalc = sc.next().charAt(0);
        } else {
            System.err.println("ERROR");
            sc.next();
            operaionCalc = getOperation();
        }
        return operaionCalc;
    }

    void solve(Scanner sc, PrintWriter out){
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operationCalc = getOperation();
        int result = calc (a, b, operationCalc);
        out.println("Result: " + result);
    }

    void run (){
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new CalculatorV1().run();
    }
}