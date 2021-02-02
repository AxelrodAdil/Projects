package Algorithms.Stack;

import  java.util.Scanner;
import java.util.Stack;

public class Postfix {
    static Scanner sc = new Scanner(System.in);

    private static String infixToPostfix(String str) {
        Stack<Character> st = new Stack<>();
        String pfx = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c != '+' && c != '-' && c != '*' && c != '/' && c != '(' && c != ')') {
                pfx = pfx + c;

            } else if (c == '(') {
                st.push(c);

            } else if (c == ')') {
                while (!st.empty() && st.peek() != '(') {
                    pfx = pfx + st.peek();
                    st.pop();
                }
                if(!st.empty() && st.peek()=='('){
                    st.pop();
                }

            } else {
                while (!st.empty() && priority(c) < priority(st.peek())) {
                    if (st.peek() == '(')
                        pfx = pfx + st.pop();
                }
                st.push(c);
            }
        }

        while (!st.empty()) {
            pfx = pfx + st.pop();
        }
        return pfx;
    }

    private static int priority(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if(c == '*' || c=='/'){
            return 2;
        } else if(c=='^'){
            return 3;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        String str = sc.nextLine();
        System.out.println(infixToPostfix(str));
    }
}