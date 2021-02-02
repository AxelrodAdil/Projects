package Adil_Sept.AdilCheatsJava;

//import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.Set;

public class PLaT_3W_13 {
    //public static Set<Integer> result;

    /*private static boolean isPrime(int number) {
        //code....
    }*/

    public static int segmented_sieve_of_Eratosthenes (int N){
        int CACHE = 30000; // размер кэша
        int M = (int)Math.sqrt(N)+1;

        int ans = 0;

        /*int primes = new int[P]; // массив простых чисел до корня из N
        boolean segment = new boolean[CACHE]; // вторичное решето
        for (int I=M-1; I < N; I+=CACHE) {
            Arrays.fill(segment, true);
            for (int i= 0; i < P; i++) {
                int h = I % primes[i];
                int j = h >  0 ? primes[i] - h :  0;
                for (; j < CACHE; j+=primes[i])
                    segment[j] = false;
            }
            for (int i= 0; i<CACHE; i++) {
                if (segment[i] && (i + I < N)) {
                    ans = i+I;
                    System.out.println("-------------" + i+I +"-------------"); // выводим простое число на экран
                }
            }
        }*/
        return ans;
    }

    public static void run(int n) {
        for (int i = 2; i <= n; ++i) {
            if (n % i == 0 && i == segmented_sieve_of_Eratosthenes(n)) {   //&& isPrime(i))
                //result.add(i);
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        run(n);
    }
}
