package OOP_Java.Library_TV_Books;

import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Product_interface product_interface = new do_it_interface();
        product_interface.addProduct(new Fields_TV(132, 100, "Samsung", 30));
        product_interface.addProduct(new Fields_TV(456, 2000, "Sony", 50));
        product_interface.addProduct(new Fields_Books(753, 60, "Under the sky", "Sun press", 1992));
        product_interface.addProduct(new Fields_Books(951, 50, "Java programming", "Springer", 2005));
        product_interface.addProduct(new Fields_Books_kids(258, 20, "Kurtlar", "Morsik", 2001, 11));
        product_interface.addProduct(new Fields_Books_kids(179, 28, "Ormanda", "Morsik", 2014, 14));

        System.out.println("Begin\n");

        product_interface.computeSalePrice();
        System.out.println("------------------------------");
        product_interface.totalComputeSalePrice();
        System.out.println("------------------------------");
        product_interface.Avg_kids_age();

        System.out.println("\nEND");
    }
}
