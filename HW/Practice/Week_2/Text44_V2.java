package Practice.Week_2;

import java.nio.file.*;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
/*
Дан текстовый файл, каждая строка которого изображает целое число,
дополненное слева и справа несколькими пробелами.
Вывести количество этих чисел и их сумму.
*/
public class Text44_V2 {
/*
 1 2 3 4 5
 12 15 75 100
 73 37 73 37
 5
input: Adil_text_44
output: Количество: 14 --- Сумма: 442
*/
    void sum (String[] arrayString){
        int summa = 0;
        int[] arrNum = new int[arrayString.length];
        for (int i = 0; i < arrayString.length; i++){
            arrNum[i] = Integer.valueOf(arrayString[i]);
        }

        for (int i = 0; i < arrNum.length; i++){
            summa = summa + arrNum[i];
        }
        System.out.println("Количество: " + arrNum.length + " --- Сумма: " + summa);
    }

    void solve(Scanner sc) {
        String File = sc.nextLine();
        List<String> list = new ArrayList<>();
        String strFile = "C:\\Users\\ASUS\\IdeaProjects\\Adil\\" + File;  //Adil_text_44

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(strFile))) {
            list = reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //list.forEach(System.out::println);
        String listToString = list.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining("-", "{", "}"));

        String a1 = listToString.substring(2, listToString.length()-1);
        String a2 = a1.replace("-", "");
        String[] arrayString = a2.split("\\s+");
        sum(arrayString);
    }

    void run() {
        try (Scanner sc = new Scanner(System.in)) {
            solve(sc);
        }
    }

    public static void main(String[] args) {
        new Text44_V2().run();
    }
}