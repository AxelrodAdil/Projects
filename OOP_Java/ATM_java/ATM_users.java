package OOP_Java.ATM_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ATM_users {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,###,##0.00");

    public void setPinNumber(int pinNumber) {   //
        this.pinNumber = pinNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance) + "\n");
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    public void getCheckingDepositInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to deposit from Checking Account: ");
        double amount = input.nextDouble();

        if ((checkingBalance + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance) + "\n");
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    public double transferMoney(double balance_second_account){
        System.out.print("Amount you want to Transfer from Checking Account: ");
        double amount = input.nextDouble();
        calcCheckingWithdraw(amount);
        System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance) + "\n");
        balance_second_account = balance_second_account + amount;
        return balance_second_account;
    }

    public void forNewAccountBalance (){
        checkingBalance = 100;
    }

    private int pinNumber;
    private double checkingBalance = 0;
}