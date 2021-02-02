package Algorithms.Stack;

import java.util.Scanner;

public class StackFinal {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //testStack();
        System.out.println("------------");
        testQueue();
    }

    private static void testQueue() {
        Queue2<Integer> queue = new Queue2<>();
        String str = sc.nextLine();
        char [] indexChar = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            indexChar[i] = str.charAt(i);
        }

        /*for (char c : indexChar){
            queue.add(c);
        }
        for (int i = 0; i < str.length(); i++){
            System.out.println(indexChar);
            queue.add(i);
        }*/

        System.out.println("\n");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }




    /*private static void testStack() {
        Stack2<Integer> queue = new Stack2<>();
        String str = sc.nextLine();

        for (int i = 1; i < str.length(); i++) {
            System.out.println(i);
            queue.push(i);
        }

        System.out.println("\n");

        while (!queue.isEmpty()) {
            System.out.println(queue.pop());
        }
    }*/
}