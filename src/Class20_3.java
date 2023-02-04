// Map: contains key: value pair
// key is unique so as to uniquely identify the data(value).

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Class20_3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        // put method stores key, value pair in map
        map.put(2, "Rohit");
        map.put(5, "Rahul");
        map.put(9, "Sahil");
        map.put(4, "Hema");
        map.put(32, "Rahul");

        System.out.println(map); // order of storage is different from order of insertion

        String value = map.get(9); // retrieves value with the associated key.
        System.out.println("Value at key 9 is " + value);

        boolean res = map.containsKey(4); // checks if entered key is present in map or not
        System.out.println("Does key 4 exist? " + res);

        boolean rohitValue = map.containsValue("Rohit"); // checks if entered value is present in map or not
        System.out.println("Does value Rohit exist ? " + rohitValue);

        String v;
        if (map.containsKey(6)) {
            v = map.get(6);
        } else {
            v = "Sanjeev";
        }

        String defaultRes = map.getOrDefault(5, "Sanjeev");
        System.out.println("Default result of key 5: " + defaultRes);

        map.remove(4);
        System.out.println(map);

        map.remove(9, "Sahil"); // removes only when key: value pair matches
        System.out.println(map);

        map.replace(5, "Prashant"); // replaces the data of the corresponding key with new value
        System.out.println(map);

        Set<Integer> keys = map.keySet(); // it returns all the keys in the form of set.
        System.out.println("Key set: " + keys);

        System.out.println("Values : " + map.values()); // returns all the values

        System.out.println("Entry set: " + map.entrySet()); // returns key:value pair set

        for (Map.Entry<Integer, String> me : map.entrySet()) {
            System.out.println(me);
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }

    }
}
