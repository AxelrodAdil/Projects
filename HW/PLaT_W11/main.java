package OOP_Java.PLaT_W11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class main {
    /**
     *
     * Created by Adil Myktybek
     * on 24.11.2020, 11:22
     *
     */
    public static final Scanner sc = new Scanner(System.in);

    static void solve_number1 (Interface_PLaT_W11 solve){
        System.out.println("----------------------------------------------");
        System.out.printf("\n%s%n%s   %s   %s   %s   %s   %s   %s    ",
                "What do you want to do?", "[1] Inc", "[2] Dec", "[3] Sum", "[4] Mult", "[5] Dif", "[6] Mult_scal", "[7] Length");
        int solve1_temp = sc.nextInt();
        switch (solve1_temp){
            case 1:
                solve.solve_1_1();
                solve_number1(solve);
                break;
            case 2:
                solve.solve_1_2();
                solve_number1(solve);
                break;
            case 3:
                solve.solve_1_3();
                solve_number1(solve);
                break;
            case 4:
                solve.solve_1_4();
                solve_number1(solve);
                break;
            case 5:
                solve.solve_1_5();
                solve_number1(solve);
                break;
            case 6:
                solve.solve_1_6();
                solve_number1(solve);
                break;
            case 7:
                solve.solve_1_7();
                solve_number1(solve);
                break;
            default:
                System.out.println("\nError_solve1");
                System.exit(-1);
        }
    }

    static void solve_number2 (Interface_PLaT_W11 solve){
        System.out.println("----------------------------------------------");
        System.out.printf("\n%s%n%s   %s   %s   %s   %s   %s    ",
                "What do you want to do?", "[1] Concat", "[2] Substring", "[3] Equals_==", "[4] Equals_!=", "[5] Equals_<", "[6] Equals_>");
        int solve2_temp = sc.nextInt();
        switch (solve2_temp){
            case 1:
                solve.solve_2_1();
                solve_number2(solve);
                break;
            case 2:
                solve.solve_2_2();
                solve_number2(solve);
                break;
            case 3:
                solve.solve_2_3();
                solve_number2(solve);
                break;
            case 4:
                solve.solve_2_4();
                solve_number2(solve);
                break;
            case 5:
                solve.solve_2_5();
                solve_number2(solve);
                break;
            case 6:
                solve.solve_2_6();
                solve_number2(solve);
                break;
            default:
                System.out.println("\nError_solve2");
                System.exit(-1);
        }
    }

    static void solve_number3 (Interface_PLaT_W11 solve){
        System.out.println("----------------------------------------------");
        System.out.printf("\n%s%n%s   %s   %s    ",
                "What do you want to do?", "[1] Raznost", "[2] add", "[3] Week");
        int solve3_temp = sc.nextInt();
        switch (solve3_temp){
            case 1:
                solve.solve_3_1();
                solve_number3(solve);
                break;
            case 2:
                solve.solve_3_2();
                solve_number3(solve);
                break;
            case 3:
                solve.solve_3_3();
                solve_number3(solve);
                break;
            default:
                System.out.println("\nError_solve3");
                System.exit(-1);
        }
    }

    static void solve_number4 (Interface_PLaT_W11 solve){
        System.out.println("----------------------------------------------");
        System.out.printf("\n%s%n%s   %s    ",
                "What do you want to do?", "[1] Raznost", "[2] add_subtract");
        int solve4_temp = sc.nextInt();
        switch (solve4_temp){
            case 1:
                solve.solve_4_1();
                solve_number4(solve);
                break;
            case 2:
                solve.solve_4_2();
                solve_number4(solve);
                break;
            default:
                System.out.println("\nError_solve4");
                System.exit(-1);
        }
    }

    static void solve_number5 (Interface_PLaT_W11 solve) {
        System.out.println("----------------------------------------------");
        System.out.printf("\n%s%n%s   %s   %s   %s   %s   %s   %s   %s   %s    ",
                "What do you want to do?", "[1] Find(Y/N)", "[2] Add", "[3] Remove", "[4] PodMno.",
                "[5] Equals(NOT)", "[6] Add_Mnozh.", "[7] Peresech.", "[8] Raznost", "[9] Symm. Raznost");
        int solve5_temp = sc.nextInt();
        switch (solve5_temp) {
            case 1:
                solve.solve_5_1();
                solve_number5(solve);
                break;
            case 2:
                solve.solve_5_2();
                solve_number5(solve);
                break;
            case 3:
                solve.solve_5_3();
                solve_number5(solve);
                break;
            case 4:
                solve.solve_5_4();
                solve_number5(solve);
                break;
            case 5:
                solve.solve_5_5();
                solve_number5(solve);
                break;
            case 6:
                solve.solve_5_6();
                solve_number5(solve);
                break;
            case 7:
                solve.solve_5_7();
                solve_number5(solve);
                break;
            case 8:
                solve.solve_5_8();
                solve_number5(solve);
                break;
            case 9:
                solve.solve_5_9();
                solve_number5(solve);
                break;
            default:
                System.out.println("\nError_solve5");
                System.exit(-1);
        }
    }

    static void solve_number6 (Interface_PLaT_W11 solve) {
        System.out.println("----------------------------------------------");
        System.out.printf("\n%s%n%s   %s   %s   %s   %s   %s   %s    ",
                "What do you want to do?", "[1] Sokr", "[2] Sum", "[3] Subtract", "[4] Mult",
                "[5] Equals?", "[6] Delenie", "[7] Pravil");
        int solve6_temp = sc.nextInt();
        switch (solve6_temp) {
            case 1:
                solve.solve_6_1();
                solve_number6(solve);
                break;
            case 2:
                solve.solve_6_2();
                solve_number6(solve);
                break;
            case 3:
                solve.solve_6_3();
                solve_number6(solve);
                break;
            case 4:
                solve.solve_6_4();
                solve_number6(solve);
                break;
            case 5:
                solve.solve_6_5();
                solve_number6(solve);
                break;
            case 6:
                solve.solve_6_6();
                solve_number6(solve);
                break;
            case 7:
                solve.solve_6_7();
                solve_number6(solve);
                break;
            default:
                System.out.println("\nError_solve6");
                System.exit(-1);
        }
    }

    static void solve_number7 (Interface_PLaT_W11 solve) {
        System.out.println("----------------------------------------------");
        System.out.printf("\n%s%n%s   %s   %s   %s   %s   %s   %s   %s    ",
                "What do you want to do?", "[1] Sum", "[2] Subtract", "[3] Mult", "[4] Mult Skalyar",
                "[5] Transpo", "[6] Equals?=", "[7] Kvadr", "[8] Symmetr");
        int solve7_temp = sc.nextInt();
        switch (solve7_temp) {
            case 1:
                solve.solve_7_1();
                solve_number7(solve);
                break;
            case 2:
                solve.solve_7_2();
                solve_number7(solve);
                break;
            case 3:
                solve.solve_7_3();
                solve_number7(solve);
                break;
            case 4:
                solve.solve_7_4();
                solve_number7(solve);
                break;
            case 5:
                solve.solve_7_5();
                solve_number7(solve);
                break;
            case 6:
                solve.solve_7_6();
                solve_number7(solve);
                break;
            case 7:
                solve.solve_7_7();
                solve_number7(solve);
                break;
            case 8:
                solve.solve_7_8();
                solve_number7(solve);
                break;
            default:
                System.out.println("\nError_solve6");
                System.exit(-1);
        }
    }

    static void solve_number9 (Interface_PLaT_W11 solve) {
        System.out.println("----------------------------------------------");
        System.out.printf("\n%s%n%s   %s   %s   %s   %s   %s   %s   %s   %s   %s    ",
                "What do you want to do?", "[1] Equals?=", "[2] Square", "[3] Perim", "[4] High",
                "[5] Mediana", "[6] Bissekt", "[7] R_vpis", "[8] R_opisa", "[9] Type", "[10] Povorot");
        int solve9_temp = sc.nextInt();
        switch (solve9_temp) {
            case 1:
                solve.solve_9_1();
                solve_number9(solve);
                break;
            case 2:
                solve.solve_9_2();
                solve_number9(solve);
                break;
            case 3:
                solve.solve_9_3();
                solve_number9(solve);
                break;
            case 4:
                solve.solve_9_4();
                solve_number9(solve);
                break;
            case 5:
                solve.solve_9_5();
                solve_number9(solve);
                break;
            case 6:
                solve.solve_9_6();
                solve_number9(solve);
                break;
            case 7:
                solve.solve_9_7();
                solve_number9(solve);
                break;
            case 8:
                solve.solve_9_8();
                solve_number9(solve);
                break;
            case 9:
                solve.solve_9_9();
                solve_number9(solve);
                break;
            case 10:
                solve.solve_9_10();
                solve_number9(solve);
                break;
            default:
                System.out.println("\nError_solve6");
                System.exit(-1);
        }
    }

    static void solve_number10 (Interface_PLaT_W11 solve) {
        System.out.println("----------------------------------------------");
        System.out.printf("\n%s%n%s   %s   %s   %s   %s   %s    ",
                "What do you want to do?", "[1] Length", "[2] <Move>", "[3] Edit", "[4] Equals?=",
                "[5] Sum", "[6] Subtract");
        int solve10_temp = sc.nextInt();
        switch (solve10_temp) {
            case 1:
                solve.solve_10_1();
                solve_number10(solve);
                break;
            case 2:
                solve.solve_10_2();
                solve_number10(solve);
                break;
            case 3:
                solve.solve_10_3();
                solve_number10(solve);
                break;
            case 4:
                solve.solve_10_4();
                solve_number10(solve);
                break;
            case 5:
                solve.solve_10_5();
                solve_number10(solve);
                break;
            case 6:
                solve.solve_10_6();
                solve_number10(solve);
                break;
            default:
                System.out.println("\nError_solve10");
                System.exit(-1);
        }
    }

    static void solve_number11 (Interface_PLaT_W11 solve) {
        System.out.println("----------------------------------------------");
        System.out.printf("\n%s%n%s   %s   %s    ",
                "What do you want to do?", "[1] Type", "[2] Have", "[3] Max&Min");
        int solve11_temp = sc.nextInt();
        switch (solve11_temp) {
            case 1:
                solve.solve_11_1();
                solve_number11(solve);
                break;
            case 2:
                solve.solve_11_2();
                solve_number11(solve);
                break;
            case 3:
                solve.solve_11_3();
                solve_number11(solve);
                break;
            default:
                System.out.println("\nError_solve11");
                System.exit(-1);
        }
    }

    static void solve_number12 (Interface_PLaT_W11 solve) {
        System.out.println("----------------------------------------------");
        System.out.printf("\n%s%n%s   %s   %s   %s   %s   %s   %s   %s   %s    ",
                "What do you want to do?", "[1] Add", "[2] Remove", "[3] Zamenit", "[4] Count",
                "[5] CountWord", "[6] MaxLengthWord and MinLengthWord", "[7] Find", "[8] Index", "[9] Equals?=");
        int solve12_temp = sc.nextInt();
        switch (solve12_temp) {
            case 1:
                solve.solve_12_1();
                solve_number12(solve);
                break;
            case 2:
                solve.solve_12_2();
                solve_number12(solve);
                break;
            case 3:
                solve.solve_12_3();
                solve_number12(solve);
                break;
            case 4:
                solve.solve_12_4();
                solve_number12(solve);
                break;
            case 5:
                solve.solve_12_5();
                solve_number12(solve);
                break;
            case 6:
                solve.solve_12_6();
                solve_number12(solve);
                break;
            case 7:
                solve.solve_12_7();
                solve_number12(solve);
                break;
            case 8:
                solve.solve_12_8();
                solve_number12(solve);
                break;
            case 9:
                solve.solve_12_9();
                solve_number12(solve);
                break;
            default:
                System.out.println("\nError_solve12");
                System.exit(-1);
        }
    }

    static void solve_number13 (Interface_PLaT_W11 solve) {
        System.out.println("----------------------------------------------");
        System.out.printf("\n%s%n%s   %s   %s   %s   %s   %s   %s   %s    ",
                "What do you want to do?", "[1] Add", "[2] Remove", "[3] Zamenit", "[4] Count[char, word, sent.]",
                "[5] Index", "[6] MaxLength and MinLength", "[7] Find", "[8] Equals?=");
        int solve13_temp = sc.nextInt();
        switch (solve13_temp) {
            case 1:
                solve.solve_13_1();
                solve_number13(solve);
                break;
            case 2:
                solve.solve_13_2();
                solve_number13(solve);
                break;
            case 3:
                solve.solve_13_3();
                solve_number13(solve);
                break;
            case 4:
                solve.solve_13_4();
                solve_number13(solve);
                break;
            case 5:
                solve.solve_13_5();
                solve_number13(solve);
                break;
            case 6:
                solve.solve_13_6();
                solve_number13(solve);
                break;
            case 7:
                solve.solve_13_7();
                solve_number13(solve);
                break;
            case 8:
                solve.solve_13_8();
                solve_number13(solve);
                break;
            default:
                System.out.println("\nError_solve13");
                System.exit(-1);
        }
    }

    static void solve_number14 (Interface_PLaT_W11 solve) {
        System.out.println("----------------------------------------------");
        System.out.printf("\n%s%n%s   %s   %s   %s    ",
                "What do you want to do?", "[1] Add", "[2] Remove", "[3] Edit", "[4] Date");
        int solve14_temp = sc.nextInt();
        switch (solve14_temp) {
            case 1:
                solve.solve_14_1();
                solve_number14(solve);
                break;
            case 2:
                solve.solve_14_2();
                solve_number14(solve);
                break;
            case 3:
                solve.solve_14_3();
                solve_number14(solve);
                break;
            case 4:
                solve.solve_14_4();
                solve_number14(solve);
                break;
            default:
                System.out.println("\nError_solve14");
                System.exit(-1);
        }
    }

    static void solve_number15 (Interface_PLaT_W11 solve) {
        System.out.println("----------------------------------------------");
        System.out.printf("\n%s%n%s   %s   %s   %s    ",
                "What do you want to do?", "[1] Max", "[2] Min", "[3] <Perepad>", "[4] <Krutizna>");
        int solve15_temp = sc.nextInt();
        switch (solve15_temp) {
            case 1:
                solve.solve_15_1();
                solve_number15(solve);
                break;
            case 2:
                solve.solve_15_2();
                solve_number15(solve);
                break;
            case 3:
                solve.solve_15_3();
                solve_number15(solve);
                break;
            case 4:
                solve.solve_15_4();
                solve_number15(solve);
                break;
            default:
                System.out.println("\nError_solve15");
                System.exit(-1);
        }
    }

    public static void main(String[] args) {
        Interface_PLaT_W11 solve = new do_it_interface_PLaT_W11();
        solve.add_to_arrayList(new Problem_1("1", 3));
        solve.add_to_arrayList(new Problem_2("2", "Java is WORA"));
        solve.add_to_arrayList(new Problem_3("3", 24, 11, 2020));
        solve.add_to_arrayList(new Problem_4("4", 41, 2, 19));

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(73);
        hashSet.add(37);
        hashSet.add(10);
        solve.add_to_arrayList(new Problem_5("5", hashSet));
        solve.add_to_arrayList(new Problem_6("6", 12, 4));
        solve.add_to_arrayList(new Problem_7("7", 4, 4));
        //solve.add_to_arrayList(new Problem_8("8", ));
        solve.add_to_arrayList(new Problem_9("9", 0, 0, 5, 0, 0, 7));
        solve.add_to_arrayList(new Problem_10("10", 1, 5));
        ArrayList<Integer> arrayList_problem_11 = new ArrayList();
        for (int i = 1; i < 7; i++){
            arrayList_problem_11.add(i);
        }
        solve.add_to_arrayList(new Problem_11("11", arrayList_problem_11));
        solve.add_to_arrayList(new Problem_12("12", "Java is WORA"));
        solve.add_to_arrayList(new Problem_13("13", "Happy Birthday to me! I have a feeling this is going to be an amazing day."));
        ArrayList<String> al_14 = new ArrayList<>();
        al_14.add("09/12/2020, 28/08/2021, Astana, new_gtx1660");
        al_14.add("09/12/2020, 05/02/2023, Astana, new_coreI7");
        solve.add_to_arrayList(new Problem_14("14", al_14));
        ArrayList<Integer> all_15 = new ArrayList<>();
        all_15.add(2000);
        all_15.add(2125);
        all_15.add(2500);
        solve.add_to_arrayList(new Problem_15("15", all_15));

        System.out.print("Solve(Problems --> 1-15): ");
        int temp = sc.nextInt();
        // int temp = 15;
        System.out.println("\n-------------------------------------------------------------");
        switch (temp){
            case 1:
                solve.solve_1_main();
                solve_number1(solve);
                break;
            case 2:
                solve.solve_2_main();
                solve_number2(solve);
                break;
            case 3:
                solve.solve_3_main();
                solve_number3(solve);
                break;
            case 4:
                solve.solve_4_main();
                solve_number4(solve);
                break;
            case 5:
                solve.solve_5_main();
                solve_number5(solve);
                break;
            case 6:
                solve.solve_6_main();
                solve_number6(solve);
                break;
            case 7:
                solve.solve_7_main();
                solve_number7(solve);
                break;
            case 8:
                System.out.println("\nPolynom!");
                //  solve.solve_8_main();
                break;
            case 9:
                solve.solve_9_main();
                solve_number9(solve);
                break;
            case 10:
                solve.solve_10_main();
                solve_number10(solve);
                break;
            case 11:
                solve.solve_11_main();
                solve_number11(solve);
                break;
            case 12:
                solve.solve_12_main();
                solve_number12(solve);
                break;
            case 13:
                solve.solve_13_main();
                solve_number13(solve);
                break;
            case 14:
                solve.solve_14_main();
                solve_number14(solve);
                break;
            case 15:
                solve.solve_15_main();
                solve_number15(solve);
                break;
            default:
                System.out.println("Error!");
                System.exit(-1);
        }
    }
}