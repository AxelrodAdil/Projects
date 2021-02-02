package PLaT;

import java.io.*;
import java.util.Scanner;

public class W8_lab_7 {
    public static final Scanner sc = new Scanner(System.in);
// W8_lab_7_number1
// 16 89 121 73 52 73 45 37 48 37
    /**
     * Created by Adil Myktybek
     * on 09.11.2020, 19:25.
     */

    static void create_newFile_number3 (String str) {
        try {
            File file = new File("C://Users//ASUS//IdeaProjects//Adil_November//W8_lab_7_number3");
            DataOutputStream outstream = new DataOutputStream(new FileOutputStream(file,false));
            outstream.write(str.getBytes());
            outstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void create_newFile_number2 (String str) {   // W8_lab_7_number2
        try {
            File file = new File("C://Users//ASUS//IdeaProjects//Adil_November//W8_lab_7_number2");
            DataOutputStream outstream = new DataOutputStream(new FileOutputStream(file,false));
            outstream.write(str.getBytes());
            outstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void printElements (int[] array, int index){
        String str_to_number3 = "";
        for(int i = 0; i <= index; i++) {
            //System.out.print(array[i] + " ");
            String temp = String.valueOf(array[i]);
            str_to_number3 = str_to_number3 + " " + temp;
        }
        System.out.println(str_to_number3 + "\n");
        //create_newFile_number3(str_to_number3);
    }

    static void solve (String str){
        String[] arrStr = str.split(" ");
        int[] arr = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        for (int i = 0; i < arrStr.length; i++){    // check: 16 89 121 73 52 73 45 37 48 37
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        int maxElement = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxElement){
                // System.out.println("here");
                maxElement = arr[i];
                index = i;
            }
        }
        System.out.println(index-1);

        printElements(arr, index-1);

        String temp = String.valueOf(maxElement);
        String str_to_number2 = "Result: " + temp;
        System.out.println(str_to_number2);

        //create_newFile_number2(str_to_number2);
    }

    public static void main(String[] args) {
        // String strFile = sc.nextLine();  // W8_lab_7_number1
        String strFile = "W8_lab_7_number1";
        String str;
        try {
            FileInputStream myFile = new FileInputStream(strFile);
            BufferedReader reader = new BufferedReader(new InputStreamReader(myFile));
            while((str = reader.readLine()) != null){
                solve(str);
            }
            myFile.close();
        } catch (IOException e) {
            System.out.println(-1);
            e.printStackTrace();
        }
    }
}