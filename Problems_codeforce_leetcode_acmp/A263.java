import java.util.Scanner;

/**
 * @Author Adil
 * @create 04.07.2021 22:17
 */
public class A263 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr=new int[5][5];
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int x=0, y=0;
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if(arr[i][j]==1){
                    y=i+1; x=j+1;
                }
            }
        }
        int count=Math.abs(x-3)+Math.abs(y-3);
        System.out.println(count);
    }
}
