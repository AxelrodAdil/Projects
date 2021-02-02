package OOP_Java.Abstract_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class example_1 {
    private String name;
    private  String streetAddress;
    private  String city;
    private  String state;
    private  String zipcode;
    private  String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List <example_1> example1List = new ArrayList <example_1>();
        char ans;

        do {
            example_1 example1 = new example_1();
            System.out.print("example_1 name: ");
            example1.setName(in.next());

            System.out.print("Street Address: ");
            example1.setStreetAddress(in.next());

            System.out.print("City: ");
            example1.setCity(in.next());

            System.out.print("State: ");
            example1.setState(in.next());

            System.out.print("Zipcode: ");
            example1.setZipcode(in.next());

            System.out.print("Phone Number: ");
            example1.setPhoneNumber(in.next());

            example1List.add(example1);

            System.out.print("Would you like to enter in a new example1 (y/n)? ");
            String answer = in.next();
            ans = answer.charAt(0);
        } while(ans == 'y');

        for(example_1 c: example1List){
            System.out.print(c.getName());
        }

        for(int i = 0; i< example1List.size(); i++){
            System.out.print(example1List.get(i).getName());
        }
    }
}