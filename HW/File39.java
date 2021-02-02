package Text_File;

import java.io.*;
import java.util.Scanner;

/*
Дан файл целых чисел.
Продублировать в нем все числа, принадлежащие диапазону 5–10.
*/
public class File39 {
/*
   --- 45 84 12 6 3 8 7 ---
input: Adil_File39
output:
45 84 12 6 3 8 7
6 8 7

input2: Adil_File39
output2: 45 84 12 6 3 8 7 6 8 7
*/
    void reWrite (String mainStr, String strFile){
        System.out.println("reWrite");
        try {
            File file=new File("C://Users//ASUS//IdeaProjects//Adil//" + strFile);
            DataOutputStream outstream= new DataOutputStream(new FileOutputStream(file,false));
            outstream.write(mainStr.getBytes());
            outstream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    void DuplicateRange (String str, String strFile){
        String[] arrStr = str.split("\\s+");
        int[] arr = new int[arrStr.length];
        int[] arrDuplicate = new int[arrStr.length];
        /*for (int i = 0; i < arrStr.length; i++){
            System.out.print(" " + arrStr[i] + " ");
        }
        System.out.println("wqe");*/

        for (int i = 0; i < arrStr.length; i++){
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        //File-га жазылмайды
        int[] writeFile = new int[arr.length*2];
        int pr = 0;

        int temp = 0;
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            writeFile[pr] = arr[i];
            pr++;
            if (5 <= arr[i] && arr[i] <= 10){
                arrDuplicate[temp] = arr[i];
                temp++;
            }
        }
        //System.out.println();      // касына жазу керек болмаса...
        for (int i = 0; i < temp; i++){
            writeFile[pr] = arrDuplicate[i];
            pr++;
            System.out.print(arrDuplicate[i] + " ");
        }
        //System.out.println("here");

        //File-га жазылады
        String[] arrStrD = new String[pr];
        for (int i = 0; i < pr; i++){
            arrStrD[i] = Integer.toString(writeFile[i]);
            //System.out.print(arrStrD[i] + " ");
        }
        String mainStr = "";
        for (int i = 0; i < pr; i++){
            mainStr = mainStr + arrStrD[i];
            mainStr = mainStr + " ";
        }
        reWrite(mainStr, strFile);
    }

    void solve (Scanner sc, PrintWriter out) {
        String strFile = sc.nextLine();  // Adil_File39
        String str;
        try {
            FileInputStream myFile = new FileInputStream(strFile);
            BufferedReader reader = new BufferedReader(new InputStreamReader(myFile));
            while((str = reader.readLine()) != null){
                //System.out.println(str);
                DuplicateRange(str, strFile);
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
        new File39().run();
    }
}