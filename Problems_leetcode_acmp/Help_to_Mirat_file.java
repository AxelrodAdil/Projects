package Problems_leetcode_acmp;

import java.io.*;
import java.util.Scanner;


public class Help_to_Mirat_file {

    /**
     *
     * Created by Adil Myktybek
     * on 27.11.2020, 23:10
     *
     */

    public static final Scanner sc = new Scanner(System.in);
    public static final StringBuilder main_sb = new StringBuilder();  // the text that we will write to a new file

/*
[Mirat_Tanbayev_file]:
Linked List is a part of the Collection framework present in java.util package.
Java is WORA. Java is a class-based, object-oriented programming language. check_it(write?)

ENU was founded on 23 May 1996.


[Console]:
Send: Linked List is a part of the Collection framework present in java.util package.
------------------------------------
Send: Java is WORA. Java is a class-based, object-oriented programming language. check_it(write?)
------------------------------------
Send:
Send: ENU was founded on 23 May 1996.
------------------------------------


[newFile_Mirat]:
Linked List is a part of the Collection framework present in java.util package.
Java is WORA.
Java is a class-based, object-oriented programming language.
ENU was founded on 23 May 1996.

*/

    static void create_write (StringBuilder sb_main) throws IOException {
        // System.out.println("\nHere --- create_write");
        File file = new File("C://Users//ASUS//IdeaProjects//Adil_December//newFile_Mirat");  // write StringBuilder
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(sb_main.toString());
        } finally {
            if (writer != null){ writer.close(); }
        }

        /*try {  // write String
            File file = new File("C://Users//ASUS//IdeaProjects//Adil_December//newFile_Mirat");
            DataOutputStream outstream= new DataOutputStream(new FileOutputStream(file,false));
            outstream.write(mainStr.getBytes());
            outstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }


    static void remove_space(String str) throws IOException {
        System.out.println("------------------------------------");
        String string_main = str.replaceAll("\\s", " ");  // white space
        String[] String_array = string_main.split(" ");  // "\\s+"

        StringBuilder sb = new StringBuilder();
        String temp = "";
        for (int i = 0; i < String_array.length; i++){
            //System.out.println(String_array[i]);
            int length = String_array[i].length()-1;   // word's length
            temp = temp + String_array[i] + " ";  // save sentence
            if (String_array[i].charAt(length) == '.'){
                temp = temp.substring(0,temp.length()-1);  // remove last character (space)
                sb.append(temp);
                sb.append("\n");
                main_sb.append(sb);
                temp = ""; // clear String
            }
            sb.setLength(0);  // clear StringBuilder
        }
        create_write(main_sb);
    }


    void solve (PrintWriter out) {
        /*try {
            File myObj = new File("Mirat_Tanbayev_file");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }*/

        // String strFile = sc.nextLine();
        // "C://Users//ASUS//IdeaProjects//Adil_December//Mirat_Tanbayev"
        String strFile = "Mirat_Tanbayev_file";  // File name
        String str;
        try {
            FileInputStream myFile = new FileInputStream(strFile);  // open file
            BufferedReader reader = new BufferedReader(new InputStreamReader(myFile));  // reader
            while((str = reader.readLine()) != null){ // reading...
                System.out.println("Send: " + str);
                if (str.trim().isEmpty()) {  // empty line  --- The java lang.string.trim()is a built-in function that eliminates leading and trailing spaces.
                    continue;
                }
                remove_space(str);  // method
            }
            myFile.close(); // close file
        } catch (IOException e) {  // error
            out.println(-1);
            e.printStackTrace();
        }
    }


    void run() {
        try(PrintWriter out = new PrintWriter(System.out)){
            solve(out);
        }
    }


    public static void main(String[] args) {
        new Help_to_Mirat_file().run();
    }
}