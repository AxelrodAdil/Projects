package OOP_Java.Final_tastamat;

public class Tastamat {
    private int index;
    private String city;
    private String location;

    public Tastamat(int index_, String city_, String location_){
        this.index = index_;
        this.city = city_;
        this.location = location_;
    }

    public String getCity() {
        return city;
    }

    public int getIndex() {
        return index;
    }

    public String getLocation() {
        return location;
    }
}
