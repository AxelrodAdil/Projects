package PLaT;

import java.util.Scanner;

public class PLaT_String1 {
    //PLaT_String1

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        int maxLength = 0;
        int ID = 0;
        for (int i = 0; i < strArray.length; i++){
            if (maxLength < strArray[i].length()){
                maxLength = strArray[i].length();
                ID = i;
            }
        }
        System.out.print("Length: " + maxLength + "\nWord: " + strArray[ID]);
    }
}