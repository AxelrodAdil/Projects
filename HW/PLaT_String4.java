package PLaT;

import java.util.Scanner;

public class PLaT_String4 {
    static Scanner sc = new Scanner(System.in);

    public static String[] removeTheElement(String[] arr, int index) {
        if (arr == null
                || index < 0
                || index >= arr.length) {
            return arr;
        }

        String[] anotherArray = new String[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

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
        System.out.print("Word: " + strArray[ID] + "\n");
        strArray = removeTheElement(strArray, ID);
        for (String strIt : strArray){
            System.out.print(strIt + " ");
        }
    }
}