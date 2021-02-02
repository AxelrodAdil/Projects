import java.util.Scanner;

public class Array140 {
    static Scanner scanner = new Scanner(System.in);

    public static void swap (double[] array1, double[] array2){
        array1[0] += array2[0];
        array2[0] = array1[0] - array2[0];
        array1[0] -= array2[0];

        array1[1] += array2[1];
        array2[1] = array1[1] - array2[1];
        array1[1] -= array2[1];
    }

    public static int compare (double[] array1, double[] array2) {
        if ((array1[0] + array1[1] < array2[0] + array2[1])
                || ((array1[0] + array1[1] == array2[0] + array2[1])
                && (array1[0] < array2[0]))) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        double[][] arrayA = new double[n * 5][2];
        for (int i = 0; i < n; i++) {
            arrayA[i][0] = scanner.nextDouble();
            arrayA[i][1] = scanner.nextDouble();
        }

        int n_V2 = n;
        for (int k = 0; k < n; k++){
            n_V2--;
            for (int g = 0; g < n_V2; g++){
                if (compare(arrayA[g+1], arrayA[g]) == 0){
                    swap(arrayA[g+1], arrayA[g]);
                }
            }
        }

        for (int h = 0; h < n; h++){
            System.out.println(arrayA[h][0] + " - " + arrayA[h][1]);
        }
    }
}