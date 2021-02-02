package PLaT;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class W9_lab_1 {
    /**
     * Created by Adil Myktybek
     * on 10.11.2020, 11:11.
     */

    static void stack_peek (Stack<Integer> stack) {
        Integer element = stack.peek();
        System.out.println("Stack top: " + element);
    }

    static void stack_pop (Stack<Integer> stack) {
        System.out.print("Pop Operation:");
        Integer y = stack.pop();
        System.out.println(y);
    }

    protected void solve (Scanner sc, PrintWriter out){
        Stack <Integer> stack = new Stack<>();
        int[] array = new int[]{48, 54, 12, 0, -25, 7, 2};    // stack_1
        for (int i = 0; i < 7; i++){
            stack.push(array[i]);
        }
        System.out.println("Stack: " + stack);   // LIFO
        stack_peek(stack);
        stack_pop(stack);
        System.out.print("After pop operation: ");
        stack_peek(stack);
        System.out.println(stack + "\nEND");

        System.out.println("-----------------------------------------------------------------");
        Stack<Integer> stack1 = new Stack<>();
        for (int i = 0; i < 5; i++){              // stack_2
            stack1.push(sc.nextInt());            // 5 37 73 25 121
        }

        for (int i = 0; i < 5; i++){
            Integer temp = stack1.pop();
            System.out.print(temp + " ");
        }
        System.out.println("\nAfter pop operation: " + stack1);
        out.println("END");
    }

    private void run (){
        try(Scanner sc = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)){
            solve(sc, out);
        }
    }

    public static void main(String[] args) {
        new W9_lab_1().run();
    }
}