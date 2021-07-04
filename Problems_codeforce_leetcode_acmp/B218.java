import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Adil
 * @create 04.07.2021 22:25
 */
public class B218 {
    static Scanner sc = new Scanner(System.in);

    static void solve(){
        int n=sc.nextInt(), m=sc.nextInt(), sum=0;
        int n_=n;
        int[] arr=new int[m];
        int[] arr2=new int[m];
        for(int i=0; i<m; i++){
            arr[i]=sc.nextInt();
            arr2[i]=arr[i];
        }
        int max=0, min=0;
        while (n_-->0){
            Arrays.sort(arr);
            max=max+arr[m-1];
            arr[m-1]=arr[m-1]-1;
        }
        System.out.print(max+" ");

        Arrays.sort(arr2);
        int next_step=0;
        while (n-->0){
            min=min+arr2[next_step];
            arr2[next_step]=arr2[next_step]-1;
            if(arr2[next_step]<=0) next_step++;
        }
        System.out.print(min);
    }

    public static void main(String[] args) {
        //int t=sc.nextInt();
        int t=1;
        while(t-->0) {
            solve();
        }
    }
}