package PLaT;

import java.io.*;
import java.util.Scanner;

public class W9_specialForMe {
    public static final Scanner sc = new Scanner(System.in);   // W8_lab_8_text1  swap  W8_lab_10_text1
// Linked ASTANA алгебра List is a part of the Collection framework present in java.util package.
// Linked List is a part of the Collection framework present in java.util package.

    /**
     * Created by Adil Myktybek
     * on 10.11.2020, 12:23.
     */

    static void reWrite_newFile_W8_lab_8_text1 (String str) {
        try {
            File file = new File("C://Users//ASUS//IdeaProjects//Adil_November//W8_lab_8_text1");
            DataOutputStream outstream = new DataOutputStream(new FileOutputStream(file,false));
            outstream.write(str.getBytes());
            outstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void reWrite_newFile_W8_lab_10_text1 (String str) {
        try {
            File file = new File("C://Users//ASUS//IdeaProjects//Adil_November//W8_lab_10_text1");
            DataOutputStream outstream = new DataOutputStream(new FileOutputStream(file,false));
            outstream.write(str.getBytes());
            outstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String strFile1 = "W8_lab_10_text1";
        String strFile2 = "W8_lab_8_text1";
        String str1;
        String str2;
        try {
            FileInputStream myFile1 = new FileInputStream(strFile1);
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(myFile1));
            StringBuilder sb1 = new StringBuilder();
            while ((str1 = reader1.readLine()) != null) {
                sb1.append(str1);
            }
            System.out.println("------------------------------------");
            myFile1.close();

            FileInputStream myFile2 = new FileInputStream(strFile2);
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(myFile2));
            StringBuilder sb2 = new StringBuilder();
            while ((str2 = reader2.readLine()) != null) {
                sb2.append(str2);
            }
            System.out.println("------------------------------------");
            myFile2.close();

            reWrite_newFile_W8_lab_8_text1(sb1.toString());
            reWrite_newFile_W8_lab_10_text1(sb2.toString());
        } catch (IOException e) {
            System.out.println(-1);
            e.printStackTrace();
        }
    }
}