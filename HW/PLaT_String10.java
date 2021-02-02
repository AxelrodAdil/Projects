package PLaT;

import java.util.Scanner;

public class PLaT_String10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        String str2 = str.replace(',', ' ');
        String[] strArray = str2.split("\\s+");

        int LengthUpper = sc.nextInt();
        int count = 0;
        for (int i = 0; i < strArray.length; i++){
            if (LengthUpper > strArray[i].length()){
                count++;
            }
        }
        System.out.println(count);
    }
}