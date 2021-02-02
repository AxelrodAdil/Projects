package OOP_Java.RM2;

public class OrderProducts {
    private int productId;
    private int quantity;

    OrderProducts(int productId, int quantity){
        setProductId(productId);
        setQuantity(quantity);
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
