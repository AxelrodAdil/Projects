package OOP_Java.Library_TV_Books;

import java.util.ArrayList;

public class do_it_interface implements Product_interface {
    private ArrayList<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product pr) {
        products.add(pr);
    }

    @Override
    public double computeSalePrice() {
        double salePrice = 0;
        for (Product product : products){
            salePrice = product.getRegularPrice();
            System.out.print(product.getBarcode() + " --- ");
            System.out.println(product.getRegularPrice());
        }
        return salePrice;
    }

    @Override
    public long totalComputeSalePrice() {
        long totalSalePrice = 0;
        long[] arrayPrice = new long[] {0,0,0};
        for (Product product : products) {
            if (product instanceof Fields_TV) { arrayPrice[0] += product.totalPrice(); }
            if (product instanceof Fields_Books && !(product instanceof Fields_Books_kids)) { arrayPrice[1] += product.totalPrice(); }
            if (product instanceof Fields_Books_kids) { arrayPrice[2] += product.totalPrice(); }
        }

        String[] arrStr = new String[]{"Fields_TV: ", "Fields_Books: ", "Fields_Books_kids: "};
        for (int i = 0; i < arrayPrice.length; i++){
            System.out.println(arrStr[i] + " " + arrayPrice[i]);
        }
        return totalSalePrice;
    }

    @Override
    public double Avg_kids_age() {
        double avg = 0;
        int count = 0;
        for (Product product : products){
            if (product instanceof Fields_Books_kids){
                avg += product.AVG_kids();
                count ++;
            }
        }
        avg = avg/count;
        System.out.println(avg);
        return avg;
    }
}
