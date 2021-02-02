package PLaT;

import java.io.*;
import java.util.Scanner;
// W8_lab_8_text1
public class W8_lab_8 {
    public static final Scanner sc = new Scanner(System.in);

// Linked List is a part of the Collection framework present in java.util package.

    /**
     * Created by Adil Myktybek
     * on 09.11.2020, 19:30.
     */

    static void create_newFile_W8_text2_lab2 (String str) {
        try {
            File file = new File("C://Users//ASUS//IdeaProjects//Adil_November//W8_lab_8_text2");
            DataOutputStream outstream = new DataOutputStream(new FileOutputStream(file,false));
            outstream.write(str.getBytes());
            outstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void solve (String str){
        String[] arrStr = str.split(" ");
        String strMain = "";
        char[] array_Character = new char[]
                {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N',
        'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < array_Character.length; j++) {
                Character checkIt = arrStr[i].charAt(0);
                if (checkIt.equals(array_Character[j])){
                    sb.append(arrStr[i]);
                    sb.append(" ");
                }
            }
        }
        strMain = sb.toString();
        System.out.println(strMain);
        // create_newFile_W8_text2_lab2(strMain);
    }

    public static void main(String[] args) {
        String strFile = "W8_lab_8_text1";  // W8_lab_8_text1
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