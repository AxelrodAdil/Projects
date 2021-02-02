package OOP_Java.Employee;

import java.util.Date;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(){}

    public FullTimeEmployee(int contactId, String name, String surname, int age, String position, Date dateOfAgreement, Date expireDate){
        super(contactId, name, surname, age, position, dateOfAgreement, expireDate);
    }
}
