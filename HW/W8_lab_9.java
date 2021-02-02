package PLaT;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class W8_lab_9 {
    public static final Scanner sc = new Scanner(System.in);

    /**
     * Created by Adil Myktybek
     * on 09.11.2020, 19:34.
     */

    static void append_new_number3 (String text){
        String filePath = "C://Users//ASUS//IdeaProjects//Adil_November//W8_lab_9_number3";
        try {
            Files.write(Paths.get(filePath), text.getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    static void create_newFile_number2 (String str) {
        try {
            File file = new File("C://Users//ASUS//IdeaProjects//Adil_November//W8_lab_9_number2");
            DataOutputStream outstream = new DataOutputStream(new FileOutputStream(file,false));
            outstream.write(str.getBytes());
            outstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void solve (String str, int count){
        String[] arrStr = str.split(" ");
        int[] arr = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        for (int i = 0; i < arrStr.length; i++){    // check: 16 89 121 73 52 73 45 37 48 37  ---  37 73
            System.out.print(arr[i] + " ");
        }

        StringBuilder sb = new StringBuilder();
        int summa = 0;
        for (int i = 0; i < arrStr.length; i++){
            summa += arr[i];
        }

        sb.append(count);
        sb.append(": --- ");
        sb.append(summa);
        sb.append("\n");

        String text = sb.toString();
        System.out.println(text + "\n");
        append_new_number3(text);
    }

    public static void main(String[] args) {
        String strFile = "W8_lab_9_number1";
        String str;
        int count = 0;
        try {
            FileInputStream myFile = new FileInputStream(strFile);
            BufferedReader reader = new BufferedReader(new InputStreamReader(myFile));

            File file = new File("C://Users//ASUS//IdeaProjects//Adil_November//W8_lab_9_number3");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            }
            System.out.println("-------------");

            while((str = reader.readLine()) != null){
                count++;
                solve(str, count);
            }

            System.out.println("!!! HERE !!!");
            String temp_count = String.valueOf(count);
            String temp = "Result: " + temp_count;
            System.out.println(temp);
            // create_newFile_number2(temp);
            myFile.close();
        } catch (IOException e) {
            System.out.println(-1);
            e.printStackTrace();
        }
    }
}