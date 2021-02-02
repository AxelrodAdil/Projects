package Adil_Sept.AdilCheatsJava;

public class PLaT_3W_12 {

    public static void main(String[] args) {
        double k, n, s = 0, fact = 1, sum = 0;

        for(k = 1; k <= 10; ++k){
            for(n = 1; n <= k; ++n){
                s += Math.sin(k*n);
                System.out.println(Math.sin(k*n));
            }
            //System.out.println("here----");
            fact *= k;
            sum += s/fact;
        }

        System.out.println("END");
        System.out.println(sum);
    }
}
