package Practice.Week_2;

import java.util.Scanner;
/*
Описать рекурсивную функцию Fib1(N) целого типа,
вычисляющую N-й элемент последовательности чисел Фибоначчи (N — целое число):
F1 = F2 = 1,        FK = FK−2 + FK−1,    K = 3, 4, … .
С помощью этой функции найти пять чисел Фибоначчи с данными номерами,
и вывести эти числа вместе с количеством рекурсивных вызовов функции Fib1,
потребовавшихся для их нахождения.
*/
public class Recur4 {
/*
input:
20
2
5
8
1
output:
6765
1
5
21
1
*/
    /*static long Fib1(int n) { //Binet's formula
        // f(x) = ((1+./5)/2)^n - (1-(1+./5)/2)^n
        double root5 = Math.sqrt(5);
        double f1 = (1 + root5) / 2;
        double f2 = 1 - f1;
        double value = (Math.pow(f1, n) - Math.pow(f2, n)) / root5;
        return ((long) (value + 0.5));
    }*/

    static long Fib1(long n){
        if(n<=1) return 1;
        return Fib1(n-1) + Fib1(n-2);
    }

    /*static  long Fib1(long n, ){
        if(n<=1) return 1;
        return Fib1(n-1) * res;
    }*/
    void solve (Scanner sc){
        for (int i = 0; i < 5; i++){
            int n = sc.nextInt();
            System.out.println(Fib1(n-1));
            System.out.println(" --------- ");
        }
    }

    void run() {
        try (Scanner sc = new Scanner(System.in)) {
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new Recur4().run();
    }
}