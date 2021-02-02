package OOP_Java.EventAbstract;

import java.util.Scanner;

public class Main {
    public static final Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        eventAgencyService eventAgency = new eventAgency("Toi Bolsyn");
        eventAgency.addEvent(new Toi(500, "Almaty", 1500000, 4,3,2,4));
        eventAgency.addEvent(new Corporative(100, "Nur-sultan", 2000000, 6, 1));

        eventAgency.printEventsData();

        System.out.println("Income: " + eventAgency.calculateIncome());
    }
}
