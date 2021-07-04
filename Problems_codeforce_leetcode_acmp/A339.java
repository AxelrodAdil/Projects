import java.util.Scanner;

/**
 * @Author Adil
 * @create 04.07.2021 22:19
 */
public class A339 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt(), t=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        for (int i=0;i<t;i++){
            for (int j=1;j<s.length();j++){
                if(s.charAt(j-1)=='B' && s.charAt(j)=='G'){
                    sb.setCharAt(j-1,'G');
                    sb.setCharAt(j,'B');
                    j++;
                }
                s=sb.toString();
            }
        }
        System.out.println(s);
    }
}
