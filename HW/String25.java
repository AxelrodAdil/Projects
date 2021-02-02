import java.util.Scanner;

public class String25 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        int m = Integer.parseInt(n);
        int[] binaryNum = new int[1000];
        int i = 0;
        while (m > 0) {
            binaryNum[i] = m % 2;
            m = m / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
}