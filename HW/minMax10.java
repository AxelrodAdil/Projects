import java.util.Scanner;

public class minMax10 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] array = new int[n];
        int min = 0;
        int idMin = 0;
        int max = 0;
        int idMax = 0;
        for (int j = 0; j < n; j++){
            array[j] = scanner.nextInt();
            if (j == 1 || array[j] < min){
                min = array[j];
                idMin = j;
            }
            if(j == 1 || array[j] > max){
                max = array[j];
                idMax = j;
            }
        }

        if (idMin < idMax){
            System.out.println(idMin);
        } else {
            System.out.println(idMax);
        }
        System.out.println();
    }
}