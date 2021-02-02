package Problems_leetcode_acmp;

import java.util.Scanner;

public class acmp_47 {
    /**
     * Будем говорить, что число a лучше числа b, если сумма цифр a больше суммы цифр числа b, а в случае равенства сумм их цифр,
     * если число a меньше числа b. Например, число 124 лучше числа 123, так как у первого из них сумма цифр равна семи, а у второго – шести.
     * Также, число 3 лучше числа 111, так как у них равны суммы цифр, но первое из них меньше.
     * Дано число n. Найдите такой его делитель (само число n и единица считаются делителями числа n), который лучше любого другого делителя числа n.
     * целое число n (1 ≤ n ≤ 105).
     */

    public static final Scanner sc = new Scanner(System.in);

    static int digitsSum(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }

    void solve(){
        int n = sc.nextInt();
        int best = 1;
        int index = 1;
        for(int i=2; i<=n; i++) {
            if (n%i==0) {
                int temp = digitsSum(i);
                if (best < temp){
                    best = temp;
                    index = i;
                }
            }
        }
        System.out.println(index);
    }

    public static void main(String[] args) {
        new acmp_47().solve();
    }
}