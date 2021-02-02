package PLaT;

import java.util.Scanner;
import java.util.Stack;
// W9_lab_2
public class W9_lab_2 {
    public static final Scanner sc = new Scanner(System.in);

    /**
     * Created by Adil Myktybek
     * on 10.11.2020, 11:11.
     */

    /*
    final StringBuilder sb = new StringBuilder();

    public void push(char ch) {
        sb.append(ch);
    }

    public char pop() {
        int last = sb.length() -1;
        char ch = sb.charAt(last);
        sb.setLength(last);
        return ch;
    }
     */

    static void pop_stack (Stack<Character> stack, int length){
        System.out.println(stack);
        System.out.println(length);
        for (int i = 0; i < length; i++){
            System.out.println(stack.peek());
            stack.pop();
        }
        System.out.println(stack);
    }

    static void character_stack (){
        System.out.println("HERE");
        Stack<Character> stack2 = new Stack<>();
        // String str = sc.nextLine();                // KazNU
        String str = "KazNU";
        for (int i = 0; i < str.length(); i++){
            Character temp = str.charAt(i);
            System.out.print(temp + " ");
            stack2.push(temp);
        }
        System.out.println("\nStack: " + stack2);
        System.out.print("Pop operation: ");
        int n = str.length();
        pop_stack(stack2, n);
    }

    public static void main(String[] args) {
        character_stack();
    }
}