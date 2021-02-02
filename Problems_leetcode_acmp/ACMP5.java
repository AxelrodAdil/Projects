package Solutions;

import java.util.Scanner;

public class ACMP5 {

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int countD2 = 0;
        int countD5 = 0;

        String chetnye = "";
        String neChetnye = "";
        for(int i = 0; i< n; i++){
            if(arr[i]%2==0){
                chetnye = chetnye+" "+arr[i];
                countD2++;
            } else {
                neChetnye = neChetnye+" "+arr[i];
                countD5++;
            }
        }
        System.out.println(neChetnye);
        System.out.println(chetnye);
        if(countD2<countD5){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    void run() {
        try (Scanner sc = new Scanner(System.in)) {
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new ACMP5().run();
    }
}