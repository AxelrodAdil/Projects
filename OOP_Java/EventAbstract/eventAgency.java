package OOP_Java.EventAbstract;

import java.util.ArrayList;

public class eventAgency implements eventAgencyService{
    private String name;
    private ArrayList<Event> events = new ArrayList<>();

    public eventAgency(String name) {
        this.name = name;
    }

    @Override
    public void addEvent(Event e) {
        events.add(e);
    }

    @Override
    public void printEventsData() {
        System.out.println("Event agency: " + name);
    }

    @Override
    public long calculateIncome() {
        long count = 0;
        for (Event i : events)
            count += (int)i.totalPriceEvent();
        return count;
    }
}
