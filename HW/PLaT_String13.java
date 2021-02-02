package PLaT;

import java.util.Scanner;

public class PLaT_String13 {
    static Scanner sc = new Scanner(System.in);
/*
AstanA Almaty, , astA mem
 */
    public static void main(String[] args) {
        String str = sc.nextLine();
        String str2 = str.replace(',', ' ');
        String[] strArray = str2.split("\\s+");
        int count = 0;
        for (int i = 0; i < strArray.length; i++){
            if (strArray[i].charAt(0) == strArray[i].charAt(strArray[i].length()-1)){
                System.out.println(strArray[i]);
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}