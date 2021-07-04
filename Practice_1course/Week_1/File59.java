package Practice.Week_1;

import java.io.*;
import java.util.Scanner;
/*
Дан символьный файл, содержащий по крайней мере один символ пробела.
Удалить все его элементы,
расположенные после последнего символа пробела, включая и этот пробел.
*/

public class File59 {
/*     --- helloWorld! Adil ---
input: Adil_File59
output: helloWorld!
*/
    void reWrite (String mainStr, String strFile) {
        System.out.println("here-reWrite");
        try {
            File file=new File("C://Users//ASUS//IdeaProjects//Adil//" + strFile);
            DataOutputStream outstream= new DataOutputStream(new FileOutputStream(file,false));
            outstream.write(mainStr.getBytes());
            outstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void delete_elements (String str, String strFile) {
        char[] c = new char[str.length()];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
        }

        for (int i = 0; i < str.length(); i++) {
            if (c[i] == ' ') {
                index = i;
            }
        }


        //File-ды озгертуды талап етсе:

        String strMain = str.substring(0, index);
        reWrite(strMain, strFile);

        //System.out.println(str.substring(0, index));
    }

    void solve (Scanner sc, PrintWriter out) {
        String strFile = sc.nextLine();  // Adil_File59
        String str;
        try {
            FileInputStream myFile = new FileInputStream(strFile);
            BufferedReader reader = new BufferedReader(new InputStreamReader(myFile));
            while((str = reader.readLine()) != null){
                //System.out.println(str);
                delete_elements(str, strFile);
            }
            myFile.close();
        } catch (IOException e) {
            out.println(-1);
            e.printStackTrace();
        }
    }

    void run() {
        try(Scanner sc = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)){
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new File59().run();
    }
}