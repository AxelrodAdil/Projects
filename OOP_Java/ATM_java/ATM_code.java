package OOP_Java.ATM_java;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ATM_code extends ATM_users {
    static Scanner sc = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,###,##0.00");
    static HashMap <Integer, String> data = new HashMap<>();

    public void getLogin() {
        int x = 1;
        System.out.println("1) Log in\n2) Sign in\nChoice: ");
        int startProject = sc.nextInt();
        if (startProject == 1){
            do {
                try {
                    data.put(1234, "Sanat Tolegen");
                    data.put(1230, "Tanbayev Mirat");
                    System.out.println("Welcome to the ATM Project!");

                    System.out.print("Enter Your Pin Number: ");
                    setPinNumber(sc.nextInt());           //
                } catch (Exception e) {
                    System.out.println("\n" + "Invalid characters." + "\n");
                    x = 2;
                }
                for (Entry<Integer, String> entry : data.entrySet()) {
                    if (entry.getKey() == getPinNumber()) {
                        System.out.println("\n" + data.get(getPinNumber()));
                        getAccountType();
                    }
                }
                System.out.println("\n" + "Pin Number." + "\n");
            } while (x == 1);
        } else if (startProject == 2){
            System.out.print("Creating a new account...\nYour first and last name? ");
            String surname_name_new = SpecialForLine40_102.StringUse();
            System.out.print("\nPassword? ");
            int passcode_new = SpecialForLine40_102.IntUse();
            data.put(passcode_new, surname_name_new);
            System.out.println("You have created a new account");
            System.out.println("Thank You for using this ATM, bye.");
            forNewAccountBalance();
            getLogin();
        } else {
            System.out.println("Invalid number");
        }
    }

    public void getAccountType() {
        System.out.println("Welcome, what would you like to do?");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Exit");
        System.out.print("Choice: ");

        selection = sc.nextInt();

        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                System.out.println("Thank You for using this ATM, bye.");
                System.exit(0);
                break;
            default:
                System.out.println("\n" + "Invalid Choice." + "\n");
                getAccountType();
        }
    }

    public void getChecking() {
        System.out.println("Checking Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Transfer");
        System.out.println("Type 5 - Exit");
        System.out.print("Choice: ");

        selection = sc.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()) + "\n");
                getAccountType();
                break;

            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.print("The name_surname of the account to which you want to transfer money: ");  //Error
                String str = SpecialForLine40_102.StringUse();
                int data_keyAccount = getKeyByValue(str);
                make_a_transaction_to_another_account(data_keyAccount);
                getAccountType();
                break;
            case 5:
                System.out.println("Thank You for using this ATM, bye.");
                System.exit(0);
                break;

            default:
                System.out.println("\n" + "Invalid choice." + "\n");
                getChecking();
        }
    }

    public static int getKeyByValue(String value) {
        int key = 0;
        for (Map.Entry <Integer, String> entry : data.entrySet()) {
            if (entry.getValue().equals(value)) {
                System.out.println(entry.getKey());
                key = entry.getKey();
            }
        }
        return key;
    }

    public void make_a_transaction_to_another_account (int key_anotherAccount){
        double balance_second_Account;
        for (Entry<Integer, String> entry : data.entrySet()) {
            if (entry.getKey() == key_anotherAccount) {
                balance_second_Account = getCheckingBalance();
                balance_second_Account = transferMoney(balance_second_Account);
                System.out.println("Balance of second Account: " + moneyFormat.format(balance_second_Account));
            }
        }
    }
    int selection;
}