import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        first_example first_example = new first_example();
        String str=sc.nextLine();
        //String str="zcinitufxoldnokacdvtmdohsfdjepyfioyvclhmujiqwvmudbfjzxjfqqxjmoiyxrfsbvseawwoyynn";
        char[] arr=str.toCharArray();
        Set<Character> set=new LinkedHashSet<>();
        for (char c:arr) set.add(c);
        StringBuilder sb = new StringBuilder();
        for (Character character : set) sb.append(character);
        String answer = first_example.print(sb.length(), sb.toString());
        System.out.println(answer);
    }
}