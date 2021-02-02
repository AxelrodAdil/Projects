import java.util.Scanner;

public class Array135 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float minDist = 2147483647;
        int points1 = 0;
        int points2 = 0;

        int n = scanner.nextInt();
        int[][] matrixArr = new int[n][2];
        for (int i = 0; i < n; i++) {
            matrixArr[i][0] = scanner.nextInt();
            matrixArr[i][1] = scanner.nextInt();
        }


        float result;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                result = (float) Math.sqrt(Math.pow(matrixArr[i][0]
                        - matrixArr[j][0], 2) + Math.pow(matrixArr[i][1] - matrixArr[j][1], 2));
                if (result < minDist){
                    minDist = result;
                    points1 = i;
                    points2 = j;
                }
            }
        }
        System.out.println(matrixArr[points1][0]+" "+ matrixArr[points1][1]);
        System.out.println(matrixArr[points2][0]+" "+ matrixArr[points2][1]);
        System.out.println(minDist);
    }
}