package PLaT;

import java.util.Scanner;

public class PLaT_String11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        String str2 = str.replace(',', ' ');
        String[] strArray = str2.split("\\s+");

        int LengthUpper = sc.nextInt();

        for (int i = 0; i < strArray.length; i++){
            if (LengthUpper < strArray[i].length()){
                System.out.println(strArray[i]);
            }
        }
    }
}