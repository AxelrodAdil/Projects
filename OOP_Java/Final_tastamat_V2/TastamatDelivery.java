package OOP_Java.ISFINAL;

import java.util.ArrayList;

public class TastamatDelivery extends DeliverySystem{
    private ArrayList<Tastamat> listOfPostmats;

    public TastamatDelivery(int orderid, int clientid, int invoiceNumber, ArrayList<Tastamat> listOfPostmats) {
        super(orderid, clientid, invoiceNumber);
        this.listOfPostmats = listOfPostmats;
    }

    public ArrayList<Tastamat> getListOfPostmats() {
        return listOfPostmats;
    }

    public void setListOfPostmats(ArrayList<Tastamat> listOfPostmats) {
        this.listOfPostmats = listOfPostmats;
    }

    @Override
    public String toString() {
        return super.toString() + ", listofPostmats: " +getListOfPostmats();
    }
}
