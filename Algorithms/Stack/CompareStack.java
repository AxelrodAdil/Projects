package Algorithms.Stack;

import java.util.Scanner;
import java.util.Stack;

public class CompareStack {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(CompareStack.balanced());
    }

    private static boolean balanced() {
        String str = sc.nextLine();
        Stack<Character> ParenOrBrackets = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                ParenOrBrackets.push(str.charAt(i));
            } else {
                if (ParenOrBrackets.isEmpty()) {
                    return false;
                }
                if (str.charAt(i) == '}' && ParenOrBrackets.peek() != '{'
                        || str.charAt(i) == ')' && ParenOrBrackets.peek() != '('
                        || str.charAt(i) == ']' && ParenOrBrackets.peek() != '[') return false;
                ParenOrBrackets.pop();
            }
        }
        return ParenOrBrackets.isEmpty();
    }
}