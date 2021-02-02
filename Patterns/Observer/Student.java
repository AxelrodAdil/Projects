package Patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Student {
    /**
     *
     * Created by Adil Myktybek
     * on 30.11.2020, 13:55
     *
     */
    private List<Observer> observers = new ArrayList<Observer>();
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}