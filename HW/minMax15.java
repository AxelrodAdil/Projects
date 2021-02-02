import java.util.Scanner;

public class minMax15 {
    /*
    Даны числа B, C (0 < B < C) и набор из десяти чисел.
    Вывести максимальный из элементов набора,
    содержащихся в интервале (B, C), и его номер.
    Если требуемые числа в наборе отсутствуют, то дважды вывести 0.
     */

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int maxNum = 0;
        int maxIndex = 0;
        for (int i = 0; i < 10; i++) {
            int k = scanner.nextInt();
            if (b < k && maxNum < k && k < c) {
                maxNum = k;
                maxIndex = i+1;
            }
        }
        if(maxNum == 0){
            System.out.println("00");
            return;
        }
        System.out.println("MaxNum: " + maxNum);
        System.out.println("MaxIndex: " + maxIndex);
    }
}