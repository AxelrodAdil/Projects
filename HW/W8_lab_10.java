package PLaT;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class W8_lab_10 {
    public static final Scanner sc = new Scanner(System.in);
// Linked ASTANA алгебра List is a part of the Collection framework present in java.util package.

    /**
     * Created by Adil Myktybek
     * on 09.11.2020, 19:42.
     */

    static void append_newFile_W8_text2_lab2(String text) {
        String filePath = "C://Users//ASUS//IdeaProjects//Adil_November//W8_lab_10_text2";
        try {
            Files.write(Paths.get(filePath), text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static void solve(String str) {
        String[] arrStr = str.split(" ");
        String strMain = "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrStr.length; i++) {
            Character checkIt = arrStr[i].charAt(0);
            int temp = arrStr[i].length() - 1;
            System.out.println(arrStr[i] + " " + temp);
            Character checkThis = arrStr[i].charAt(temp);
            if (checkIt.equals(checkThis)) {
                sb.append(arrStr[i]);
                sb.append(" ");
            }
        }
        strMain = sb.toString();
        System.out.println(strMain);
        append_newFile_W8_text2_lab2(strMain);
    }

    public static void main(String[] args) {
        String strFile = "W8_lab_10_text1";
        String str;
        try {
            FileInputStream myFile = new FileInputStream(strFile);
            BufferedReader reader = new BufferedReader(new InputStreamReader(myFile));

            File file = new File("C://Users//ASUS//IdeaProjects//Adil_November//W8_lab_10_text2");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            System.out.println("-------------");

            while ((str = reader.readLine()) != null) {
                solve(str);
            }
            myFile.close();
        } catch (IOException e) {
            System.out.println(-1);
            e.printStackTrace();
        }
    }
}