package Solutions;

import java.io.PrintWriter;
import java.util.Scanner;

public class AbrString22 {

    /*
    Дана строка, изображающая целое положительное число.
    Вывести сумму цифр этого числа.
     */

    void solve (Scanner sc, PrintWriter out){
        int summa = 0;
        String str = sc.nextLine();

        int [] preArr = new int [str.length()];
        for(int i = 0; i < str.length(); i++){
            preArr [i] = str.charAt(i);
            if(!(preArr [i] >= 48 & preArr [i] <= 57 | preArr[i] == 32)){
                out.println("ERROR");
                return;
            }
        }

        String [] arrOfStr = str.split(" ");
        String FirstPart = arrOfStr[0];

        char [] arrChar = FirstPart.toCharArray();
        int [] arr = new int [arrChar.length];
        for(int i = 0; i < arrChar.length; i++){
            arr [i] = Character.getNumericValue(arrChar[i]);
            summa += arr[i];
        }
        out.println(summa);
    }

    void run(){
        try(Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out)){
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new AbrString22().run();
    }
}