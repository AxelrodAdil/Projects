package PLaT;

import java.util.Scanner;

public class PLaT_String7 {
    static Scanner sc = new Scanner(System.in);

    public static void replace_word(String[] strArray, String str2, String str3){
        for (int i = 0; i < strArray.length; i++){
            if (strArray[i].equals(str2)){
                strArray[i] = str3;
            }
        }

        for (String strIt : strArray){
            System.out.print(strIt + " ");
        }
    }
/*
Remove an Element   an   it
an
IT
 */
    public static void main(String[] args) {
        String str = sc.nextLine();
        String[] strArray = str.split("\\s+");
        String str2 = sc.nextLine();    // second word
        String str3 = sc.nextLine();    // first word
        replace_word(strArray, str2, str3);
    }
}