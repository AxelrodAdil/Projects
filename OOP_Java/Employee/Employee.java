package OOP_Java.Employee;

import java.util.Date;

public abstract class Employee {
    private int contactId;
    private String name;
    private String surname;
    private int age;
    private String position;
    private Date dateOfAgreement;
    private Date expireDate;

    public Employee(){}

    public Employee(int contactId, String name, String surname, int age, String position, Date dateOfAgreement, Date expireDate) {
        this.contactId = contactId;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.dateOfAgreement = dateOfAgreement;
        this.expireDate = expireDate;
    }

    public int getContactId() {
        return contactId;
    }
    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public Date getDateOfAgreement() {
        return dateOfAgreement;
    }
    public void setDateOfAgreement(Date dateOfAgreement) {
        this.dateOfAgreement = dateOfAgreement;
    }

    public Date getExpireDate() {
        return expireDate;
    }
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public void calculatePayment(){
        System.out.println("ContactId " + contactId + "Name " + name + "Surname " + surname + "Age " + age + "Position " + position + "dateOfAgreement" + dateOfAgreement + "expireDate" + expireDate);
    }
}