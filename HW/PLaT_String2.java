package PLaT;

import java.util.Scanner;

public class PLaT_String2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        int minLength = Integer.MAX_VALUE;
        int ID = 0;
        for (int i = 0; i < strArray.length; i++){
            if (minLength > strArray[i].length()){
                minLength = strArray[i].length();
                ID = i;
            }
        }
        System.out.print("Length: " + minLength + "\nWord: " + strArray[ID]);
    }
}