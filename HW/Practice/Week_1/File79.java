package Practice.Week_1;

import java.nio.file.*;
import java.util.*;
import java.io.*;
/*
Даны два файла вещественных чисел с именами Sa и Sb,
содержащие элементы прямоугольных матриц А и В (по строкам),
причем первый элемент каждого файла содержит количество столбцов соответствующей
матрицы. Создать файл той же структуры с именем Sc, содержащий элементы
произведения А*В. Если матрицы А и В нельзя перемножать,
то оставить файл Sc пустым.
*/
public class File79 {

    void create_newFile (String str) {
        try {
            File file = new File("C://Users//ASUS//IdeaProjects//Adil//Adil_File79_Sc");
            DataOutputStream outstream= new DataOutputStream(new FileOutputStream(file,false));
            outstream.write(str.getBytes());
            outstream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void fill(int[][] matrix, String str, int row) {
        String[] str1 = str.split("\\s+");
        for (int i = 0; i < str1.length; i++) {
            matrix[row][i] = Integer.valueOf(str1[i]);
        }
    }

    void solve(Scanner sc) throws IOException {
        String strFile1 = "C:\\Users\\ASUS\\IdeaProjects\\Adil\\Adil_File79_Sa";
        String strFile2 = "C:\\Users\\ASUS\\IdeaProjects\\Adil\\Adil_File79_Sb";
        System.out.println();
        int[][] arr1 = fillMatrix(strFile1);
        int[][] arr2 = fillMatrix(strFile2);

        System.out.println(">>>");
        for (int[] ints : arr1) {
            for (int num : ints) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("<<<");
        for (int[] ints : arr2) {
            for (int num : ints) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        int m = arr1.length;
        int n = arr2[0].length;
        int o = arr2.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        System.out.println("Otvet:");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                sb.append(res[i][j]);
                sb.append("  ");
                System.out.format("%6d ", res[i][j]);
            }
            sb.append('\n');
            System.out.println();
        }

        //create_newFile(sb.toString());
    }

    int[][] fillMatrix(String fileName) throws IOException {
        String str1 = null;
        FileInputStream myFile1 = new FileInputStream(fileName);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(myFile1));
        str1 = reader1.readLine();
        String[] arrRazmer = str1.replaceAll("\\s", "").split("");
        int m = Integer.valueOf(arrRazmer[0]);
        int n = Integer.valueOf(arrRazmer[1]);
        int[][] array = new int[m][n];
        int row = 0;
        while ((str1 = reader1.readLine()) != null) {
            //System.out.println(str1);
            fill(array, str1, row++);
        }
        myFile1.close();
        return array;
    }

    void run() {
        try (Scanner sc = new Scanner(System.in)) {
            solve(sc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new File79().run();
    }
}