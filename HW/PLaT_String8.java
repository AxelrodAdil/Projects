package PLaT;

import java.util.Scanner;

public class PLaT_String8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        String[] strArray = str.split("\\s+");

        int maxLength = 0;
        int ID_max = 0;
        int minLength = Integer.MAX_VALUE;
        int ID_min = 0;
        for (int i = 0; i < strArray.length; i++){
            if (maxLength < strArray[i].length()){
                maxLength = strArray[i].length();
                ID_max = i;
            } else if (minLength > strArray[i].length()){
                minLength = strArray[i].length();
                ID_min = i;
            }
        }
        //swap
        String temp = strArray[ID_min];
        strArray[ID_min] = strArray[ID_max];
        strArray[ID_max] = temp;

        for (int i = 0; i < strArray.length; i++){
            System.out.println(strArray[i]);
        }
    }
}