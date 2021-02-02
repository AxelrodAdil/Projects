package Adil_Sept;
import java.util.Scanner;
import java.util.stream.IntStream;

public class YATPNum1 {
    /**
     * xy..z = x^n + y^n+.....+ z^n: n - number of digits in the number
     *
     * There are only 88 Armstrong numbers in the decimal system.
     * In the interval 1 <= N <= 10 there are the following 32 N-digit Armstrong numbers
     *
     * 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54 748, 92 727, 93 084, 548 834,
     * 1 741 725, 4 210 818, 9 800 817, 9 926 315, 24 678 050, 24 678 051, 88 593 477,
     * 146 511 208, 472 335 975, 534 494 836, 912 985 153, 4 679 307 774.
     */

    static long arrNumArmstrong (int num, int n){
        long ans = 1;
        for (int i = 0; i < n; i++){
            ans *= num;
        }
        return ans;
    }

    static void ArmstrongNumber (int[] arr, int n, long xMain){
        long ans = 0;
        for (int i = 0; i < n; i++){
            ans += arrNumArmstrong(arr[i], n);
        }

        if (ans == xMain){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

    void solve(Scanner sc){
        long number = sc.nextLong();
        if (number == 0){ System.out.println("NO"); return; }

        String temp = Long.toString(number);
        int [] arrNum = new int [temp.length()];
        for (int i = 0; i < temp.length(); i++){
            arrNum[i] = temp.charAt(i) - '0';
        }
        ArmstrongNumber(arrNum, temp.length(), number);

        System.out.println("------------");

       /**
        * The following property is used here: the power sum does not change from the change of numbers in places in the number.
        * Those. for example, there is no need to consider all numbers from the class: 135, 153, 315, 351, 531 and 513; it is enough to consider one of them,
        * for example, the number 135; calculate its exponential sum: (135) st = 153, and then just make sure that the number 153 is the Armstrong number.
        * This method reduces the number of enumerated numbers by almost N! time.
        */

        IntStream.range(1, 1_000_000).map(i -> {
                    int pattern = i;
                    int powSum = 0;
                    int pow = (int) Math.log10(i) + 1;
                    while (i != 0) {
                        powSum += (int) Math.pow(i % 10, pow);
                        i /= 10;
                    }
                    if (powSum == pattern) return pattern;
                    return -1;
                })
                .filter(x -> x != -1)
                .forEach(System.out::println);

        System.out.println("DONE");
    }

    void run (){
        try (Scanner sc = new Scanner(System.in);){
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new YATPNum1().run();
    }
}