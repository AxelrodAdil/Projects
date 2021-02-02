import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

    public class ACMP579 {
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            // sequence
            // subsequence
            int n = sc.nextInt();
            int pos = 0;
            int neg = 0;
            int sumPos = 0;
            int sumNeg = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x > 0) {
                    pos++;
                    sumPos += x;
                } else if (x < 0) {
                    neg++;
                    sumNeg += x;
                }
            }

            sc.close();
            try {
                sc = new Scanner(new FileReader("input.txt"));
            } catch (IOException e) {
                throw new Error(e);
            }
            sc.nextInt();
            if (sumPos > -sumNeg) {
                System.out.println(pos);
                for (int i = 1; i <= n; i++) {
                    int x = sc.nextInt();
                    if (x > 0) {
                        System.out.println(i + " ");
                    }
                }
            } else {
                System.out.println(neg);
                for (int i = 1; i <= n; i++) {
                    int x = sc.nextInt();
                    if (x < 0) {
                        System.out.println(i + " ");
                    }
                }
            }
            System.out.println();
        }
    }