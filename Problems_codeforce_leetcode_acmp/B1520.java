import java.util.Scanner;

/**
 * @Author Adil
 * @create 04.07.2021 22:22
 */
public class B1520 {
    static Scanner sc = new Scanner(System.in);

    static int solve_ez_try2(){
        long n=sc.nextLong();
        int count=0;

        for(int i=1;i<10;i++){
            long tp=i;
            while (tp<=n){
                count++;
                tp=tp*10+i;
            }
        }
        return count;
    }

    static int solve(){
        int n=sc.nextInt();
        int count=0;
        String s=String.valueOf(n);
        if(s.length()==1) return n;

        int count_b=0;
        boolean b=true;

        for(int i=10;i<=n;i++){
            count_b=0;
            b=true;
            s=String.valueOf(i);
            boolean[] booleans=new boolean[s.length()-1];

            for(int j=1;j<s.length();j++){
                if(Character.getNumericValue(s.charAt(j-1))==Character.getNumericValue(s.charAt(j))) {
                    booleans[count_b]=true;
                    count_b++;
                } else {
                    booleans[count_b]=false;
                    count_b++;
                }
            }
            for(int z=0;z<booleans.length;z++){
                if(!booleans[z]) {
                    b=false;
                }
            }
            if(b) {
                count++;
            }
        }
        return count+9;
    }

    public static void main(String[] args) {
        int t=sc.nextInt();
        //int t=1;
        while(t-->0){
            System.out.println(solve_ez_try2());
        }
    }
}