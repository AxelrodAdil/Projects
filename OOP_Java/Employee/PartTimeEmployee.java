package OOP_Java.Employee;

import java.util.Date;

public class PartTimeEmployee extends Employee{
    private double hoursWorked; // time
    private double rate;  // salary

    public PartTimeEmployee(){}

    public PartTimeEmployee(int contactId, String name, String surname, int age, String position, Date dateOfAgreement, Date expireDate, double hoursWorked_main, double rate_main){
        super(contactId, name, surname, age, position, dateOfAgreement, expireDate);
        this.hoursWorked = hoursWorked_main;
        this.rate = rate_main;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    public double getRate() {
        return rate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
}
