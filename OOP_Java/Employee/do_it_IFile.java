package OOP_Java.Employee;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class do_it_IFile implements IFile {
    static Scanner iSc = new Scanner(System.in);

    public void add_arr(Employee emp) {
        Main.main_arraylist.add(emp);
    }

    @Override
    public void add() {
        String temp_str = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("NewEmployees.txt"));
            while((temp_str = reader.readLine()) != null){ // reading...
                if (temp_str.trim().isEmpty()) {  // empty line
                    continue;
                }

                String[] array_str = temp_str.split(",");
                if(array_str[0].equals("freelancer")){
                    int contactId = 1;
                    String name = array_str[1];
                    String surname = array_str[2];
                    int age = Integer.parseInt(array_str[3]);
                    String position = array_str[4];

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    // Calendar cal = Calendar.getInstance();
                    String dateTime = "04/12/2020";
                    String dateTime2 = "04/12/2021";
                    Date date = sdf.parse(dateTime);
                    Date date1 = sdf.parse(dateTime2);
                    Date dateOfAgreement = date;
                    Date expireDate = date1;

                    double hoursWorked = Integer.parseInt(array_str[5]);
                    String temp_rate = array_str[6].substring(0, array_str[6].length()-1);
                    double rate = Integer.parseInt(temp_rate);

                    add_arr(new PartTimeEmployee (contactId, name, surname, age, position, dateOfAgreement, expireDate, hoursWorked, rate) );

                } else if (array_str[0].equals("fulltime")){
                    int contactId = 1;
                    String name = array_str[1];
                    String surname = array_str[2];
                    int age = Integer.parseInt(array_str[3]);
                    String position = array_str[4];

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    // Calendar cal = Calendar.getInstance();
                    String dateTime = "04/12/2020";
                    String dateTime2 = "04/12/2021";
                    Date date = sdf.parse(dateTime);
                    Date date1 = sdf.parse(dateTime2);
                    Date dateOfAgreement = date;
                    Date expireDate = date1;

                    add_arr(new FullTimeEmployee (contactId, name, surname, age, position, dateOfAgreement, expireDate) );
                }
            }
            reader.close();
        } catch (IOException | ParseException e) {  // error
            System.out.println(-1);
            e.printStackTrace();
        }

    }

    @Override
    public ArrayList<Employee> read() {
        ArrayList<Employee> employees = new ArrayList<>();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("NewEmployees.txt"));
            employees = (ArrayList<Employee>) inputStream.readObject();
            inputStream.close();
        } catch (Exception e) {
            write(employees);
        }

        System.out.println("-----------------------------\n" + Main.main_arraylist);
        return employees;
    }

    @Override
    public void write(ArrayList<Employee> employees) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("NewEmployees.txt"));
            outputStream.writeObject(employees);
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(ArrayList<Employee> employees) {
        String ID, Name;  // contactId, name, surname, age, position
        double salary;
        int replenish;

        try{
            System.out.printf("%s%n%s   %s", "What do you want to update?", "", "");
            Scanner console = new Scanner(System.in);
            System.out.print("Enter ID : ");
            String pID = console.nextLine();
            System.out.print("Enter replenish salary: ");
            replenish = console.nextInt();

            File originalFile = new File("NewEmployees.txt");
            BufferedReader br = new BufferedReader(new FileReader(originalFile));
            File tempFile = new File("tempfile.txt");
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

            String line = null;
            // Read from the original file and write to the new
            // unless content matches data to be removed.
            while ((line = br.readLine()) != null) {

                if (line.contains(pID)) {
                    String strCurrentSalary = line.substring(line.lastIndexOf(" "), line.length());
                    if (strCurrentSalary != null || !strCurrentSalary.trim().isEmpty()) {
                        int replenishedSalary = Integer.parseInt(strCurrentSalary.trim()) + replenish;
                        System.out.println("replenishedSalary : " + replenishedSalary);
                        line = line.substring(0,line.lastIndexOf(" ")) + replenishedSalary;
                    }

                }
                pw.println(line);
                pw.flush();
            }
            pw.close();
            br.close();


            if (!originalFile.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            if (!tempFile.renameTo(originalFile)) {
                System.out.println("Could not rename file");
            }

        } catch (IOException e){
            e.printStackTrace();
            System.out.println(-1);
        }

    }

}