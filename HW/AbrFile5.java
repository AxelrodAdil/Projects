package HW;

import java.io.*;
import java.util.Scanner;

public class AbrFile5 {

    /*
    Дано имя файла целых чисел.
    Найти количество элементов, содержащихся в данном файле.
    Если файла с таким именем не существует, то вывести –1.
     */

    void solve (Scanner sc, PrintWriter out) {
        String strFile = sc.nextLine(); //Example1_1
        String str;
        int count;
        try {
            FileInputStream myFile = new FileInputStream(strFile);
            BufferedReader reader = new BufferedReader(new InputStreamReader(myFile));
            while((str = reader.readLine()) != null){
                System.out.println(str);
                count = str.split(" +").length; // howManyWordsInAFile
                /* howManyCharactersOrElementsInTheFile
                for(char e : str.toCharArray()){
                    count++;
                }
                 */
                out.println(count);
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
        new AbrFile5().run();
    }
}