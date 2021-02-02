package Practice.Week_1;


import java.io.*;
import java.util.Scanner;

/*
Дан файл вещественных чисел. Найти его последний локальный максимум
(локальным максимумом называется элемент, который больше своих соседей).
*/
public class File19 {
/*
input: Adil_Practice
48 54 12 0 -25 7 2
output: 7
*/
    void localMax (String str){
        String[] arrStr = str.split(" ");
        int[] arr = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++){
            arr[i] = Integer.parseInt(arrStr[i]);
        }

        for (int i = arr.length - 2; i > 0; i--){
            if (arr[i + 1] < arr[i] && arr[i] > arr[i-1]){
                System.out.println(arr[i]);
                return;
            }
        }
    }

    void solve (Scanner sc, PrintWriter out) {
        String strFile = sc.nextLine();  // Adil_Practice
        String str;
        try {
            FileInputStream myFile = new FileInputStream(strFile);
            BufferedReader reader = new BufferedReader(new InputStreamReader(myFile));
            while((str = reader.readLine()) != null){
                localMax(str);
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
        new File19().run();
    }
}