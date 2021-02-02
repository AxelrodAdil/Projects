package HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class String35 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        String s0 = scanner.nextLine();
        String [] arrOfS = s.split(" ", 100);
        String [] arrOfS0 = s0.split(" ", 100);

        for (int i = 0; i < arrOfS.length; i++){
            for (int j = 0; j < arrOfS0.length; j++){
                if (arrOfS[i].equals(arrOfS0[j])){
                    List<String> list = new ArrayList<String>(Arrays.asList(arrOfS));
                    list.remove(arrOfS0[j]);
                    arrOfS = list.toArray(new String[0]);
                }
            }
        }

        for (int i = 0; i < arrOfS.length; i++){
            System.out.print(arrOfS[i] + " ");
        }
    }
}