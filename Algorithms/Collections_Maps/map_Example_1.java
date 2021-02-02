package Collections_Maps;

import java.util.*;

public class map_Example_1 {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();

        // create list one and store values

        List<String> One = new ArrayList<String>();
        One.add("Apple");
        One.add("Aeroplane");

        // create list two and store values
        List<String> Two = new ArrayList<String>();
        Two.add("Bat");
        Two.add("Banana");

        // put values into map
        map.put("A", One);
        map.put("B", Two);

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }

        System.out.println("--------------------------------");
        Iterator<List<String>> itr = map.values().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("--------------------------------");
        map.forEach((key, value) -> System.out.println(key + ":" + value));

        System.out.println("--------------------------------");
        for (String keys : map.keySet()) {
            System.out.println(keys + ":"+ map.get(keys));
        }

        System.out.println("--------------------------------");
        map.values().iterator()
                .forEachRemaining(System.out::println);
    }
}
