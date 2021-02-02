package PLaT;

import java.util.Scanner;

public class PLaT_String3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        int averageLength = 0;
        for (int i = 0; i < strArray.length; i++){
            averageLength += strArray[i].length();
        }
        System.out.print("Average Length: " + averageLength/strArray.length);
    }
}