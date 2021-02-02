package Practice.Week_2;

import java.io.PrintWriter;
import java.util.*;

/*
Описать функцию DecompressStr(S) строкового типа,
восстанавливающую строку, сжатую функцией CompressStr
(см. задание Param42). Параметр S содержит сжатую строку;
восстановленная строка является возвращаемым значением функции.
С помощью функции DecompressStr восстановить пять данных сжатых строк.
*/

public class Param43 {
/*
input1: Astana{12}
output1: Astanaaaaaaaaaaaa

input2: P{5}ractice
output2: PPPPPractice

input3: Jav{15}a C+{5}
output3: Javvvvvvvvvvvvvvva C+++++

input4: Po{5}inter
output4: Pooooointer

input5: F{5}
output5: FFFFF
*/

    static String DeCompressStr (String string){
        int abc = 0;
        char[] substring = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            substring[i] = string.charAt(i);
            abc++;
            if (substring[i] =='{'){
                break;
            }
        }
        String new_String = string.substring(abc);
        String nums_String = new_String.replaceAll("[^\\d]", " ");
        String[] nums_str_array = nums_String.split("\\s+");
        int[] array_int_nums = new int[nums_str_array.length];        //numbers
        int[] array_int_length = new int[nums_str_array.length];      //length
        for (int i = 0; i < nums_str_array.length; i++){
            array_int_nums[i] = Integer.valueOf(nums_str_array[i]);
            array_int_length[i] = nums_str_array[i].length();
        }

        char[] char_array = new char[string.length()];
        for (int i = 0; i < string.length(); i++){
            char_array[i] = string.charAt(i);
        }

        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i = 0; i < string.length(); i++){
            if (char_array[i] == '{'){
                String copyT = Character.toString(char_array[i-1]);
                String n_dubl = String.join("", Collections.nCopies(array_int_nums[j]-1, copyT));
                sb.append(n_dubl);
                i = i + array_int_length[j] + 1;
                j++;
            } else {
                sb.append(char_array[i]);
            }
        }
        String result = sb.toString();

        return result;
    }

    void solve (Scanner sc, PrintWriter out){
        for (int i = 0; i < 5; i++){
            String string = sc.nextLine();
            System.out.println(DeCompressStr(string));
            System.out.println(" -------- ");
        }
    }

    void run() {
        try (Scanner sc = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new Param43().run();
    }
}