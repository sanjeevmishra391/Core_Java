// treeset: stores the data in the sorted manner. By default it is ascending order.
// data is stored in tree.

import java.util.SortedSet;
import java.util.TreeSet;

public class Class20 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(64);
        set.add(99);
        set.add(42);
        set.add(12);
        set.add(48);

        System.out.println(set);

        int lowest = set.first(); // returns the lowest data
        System.out.println(lowest);

        int highest = set.last(); // returns the highest data
        System.out.println(highest);

        int nearestLower = set.floor(48);
        System.out.println("Nearest and less than or equal to 48: " + nearestLower);

        int nearestCeiling = set.ceiling(48);
        System.out.println("Nearest and greater than or equal to 48: " + nearestCeiling);

        int lowerData = set.lower(48);
        System.out.println("Data less than 48: " + lowerData);

        int higherData = set.higher(48);
        System.out.println("Data greater than 48:" + higherData);

        SortedSet<Integer> subset = set.subSet(41, 65); // it does not include the end range
        System.out.println("Subset: " + subset);

        set.pollFirst(); // removes the lowest data;
        set.pollLast(); // removes the highest data;

        System.out.println(set);
    }
}
