package OOP_Java.Paper_Rock_Scissors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * Created by Adil Myktybek
     * on 18.11.2020, 18:05
     */

    public static final Scanner sc = new Scanner(System.in);
    public static final ArrayList<String> arrayWinners = new ArrayList<>();
    // Later ...

    static boolean another(boolean another_game){
        System.out.println("\nAnother game?\n[1]-Yes       [2]-No");
        int choice_int = sc.nextInt();
        if(choice_int == 2){
            another_game = false;
            System.exit(-1);
        }
        return another_game;
    }

    public static void main(String[] args) {
        Interface_game game = new do_it_interface_game1();
        boolean another_game = true;

        while (another_game){
            System.out.println("Game mode:\n [1]-PVP        [2]-PVE         [3]-History");
            int n = sc.nextInt();
            int k = 1;
            if (n == 1){
                System.out.println("PVP battle: \n");
                System.out.print("Player_" + k + " name? ");
                String temp_str1 = sc.next();
                k++;
                System.out.print("Player_" + k + " name? ");
                String temp_str2 = sc.next();

                /*
                "paper", "rock", "scissors"
                 */
                System.out.println("\n OK! Ur choice(" + temp_str1 + "): ");
                String choice1 = sc.next();
                System.out.println("\n OK! Ur choice(" + temp_str2 + "): ");
                String choice2 = sc.next();


                game.addPlayer(new PVP(temp_str1, choice1, choice2,temp_str2));
                String winner = game.winner_is();
                String temp = "Winner is : " + winner;
                arrayWinners.add(temp);
                System.out.println(temp);

                another(another_game);
            } else if (n == 2){
                System.out.println("PVE battle: \n");

                System.out.print("Player_" + k + " name? ");
                String temp_str1 = sc.next();
                System.out.println("\n OK! Ur choice(" + temp_str1 + "): ");
                String choice1 = sc.next();

                game.addPlayer(new PVE(temp_str1, choice1));
                String temp = "Winner is vs: " + temp_str1 + " and Computer is " + game.winner_is();
                arrayWinners.add(temp);
                another(another_game);
            } else if(n == 3){
                System.out.println("\nHere");
                System.out.println(Arrays.toString(arrayWinners.toArray()));
                System.out.println("\n");
            } else {
                System.out.println("Error!");
                System.exit(-1);
            }
        }
    }
}