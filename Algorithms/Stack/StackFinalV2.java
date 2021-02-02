package Algorithms.Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackFinalV2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
    }
}