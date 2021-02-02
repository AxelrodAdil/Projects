package Solutions;

import java.util.Scanner;

public class ACMP47 {
    static Scanner sc = new Scanner(System.in);
    int digitsSum(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }

    void solveMethod() {
        int x = sc.nextInt();
        int maxSum = 1;
        int bestD = 1;
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                int sum = digitsSum(i);
                if (sum > maxSum) {
                    maxSum = sum;
                    bestD = i;
                }
            }
        }
        System.out.println(bestD);
    }

    public static void main(String[] args) {
        new ACMP47().solveMethod();
    }
}