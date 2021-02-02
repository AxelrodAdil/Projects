package OOP_Java.Final_tastamat;

import java.util.ArrayList;

public class TastamatDelivery extends DeliverySystem {
    /**
     * /**
     *      *
     *      * 910044;Nur-Sultan;ул.Сатпаева,23/1
     *      * 910009;Nur-Sultan;пр.Момышулы,16
     *      * 910198;Almaty;Орманова,129
     *      * 910061;Almaty,Жибек Жолы,50
     *      * 910100;Karaganda;пр.Нуркена Абдирова,19
     *      * 910156;Pavlodar;Лермонтова,91
     *      *
     *      */
    private ArrayList<Tastamat> listOfPostmats = new ArrayList<>();


    public TastamatDelivery(int orderId_, int clientId_, int invoiceNumber_){
        super(orderId_, clientId_, invoiceNumber_);
    }

}