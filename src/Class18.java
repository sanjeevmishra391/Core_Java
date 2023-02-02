// Collection framework

// is a collection of built-in interfaces and classes that help to handle group of objects.
// is built-in data structures and algorithms.

// In order to use classes of collection framework, import java.util package.

// Array has fixed length
// 1. Arraylist: Length of arraylist can vary.

import java.util.ArrayList;

public class Class18 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(14);
        arr.add(8);
        arr.add(2); // adds data to the end of arraylist.
        arr.add(1, 50); // adds data at specified index and shifts remaining elements.

        // Integer intArr[] = new Integer[arr.size()];
        // intArr = arr.toArray(intArr);

        // for (int i = 0; i < intArr.length; i++) {
        // System.out.println(intArr[i]);
        // }

        System.out.println(arr);

        int len = arr.size(); // returns the number of elements in arraylist
        System.out.println("The size of arraylist is " + len);

        int ele = arr.get(2); // returns element at specified index
        System.out.println("Data at 2nd index is " + ele);

        arr.set(0, 100); // it updates data at specified index with new element
        System.out.println("Modified list (updated 0th index): ");
        System.out.println(arr);

        arr.remove(1); // it removes the element at specified index
        System.out.println("Modified list (removed 1st index element): ");
        System.out.println(arr);

        arr.remove(Integer.valueOf(100)); // it removes element from arraylist if available
        System.out.println("Modified list (removed element 100): ");
        System.out.println(arr);

        System.out.println("Doubled data in arraylist: ");
        for (int i = 0; i < arr.size(); i++) {
            // int a = arr.get(i);
            arr.set(i, 2 * arr.get(i));
        }
        System.out.println(arr);

        boolean res = arr.contains(7); // searches for element in arraylist and returns boolean result.
        System.out.println("7 exist in arr? " + res);

        try {
            int v = arr.get(45);
            System.out.println(v);
        } catch (Exception e) {
            System.out.println("Index is out of bound");
        }

        arr.clear(); // it empties arraylist
        System.out.println(arr);

        ArrayList<String> names = new ArrayList<>();
        names.add("Deepak");
        names.add("Nitin");
        names.add("Sahil");

        System.out.println(names);

        names.remove("Nitin");

        System.out.println(names);

        names.remove(1);

        System.out.println(names);

        int idx = names.indexOf("Deepak"); // returns the index of specified element and if it is not present then -1 is
                                           // returned
        System.out.println("Index of Deepak in names: " + idx);

        System.out.println("Is Names list empty: " + names.isEmpty()); // checks is list is empty or not.
        System.out.println("Is Arr list empty: " + arr.isEmpty());

    }
}

// size(), add(data), add(index, data), get(index), set(index, newElement),
// remove(index), remove(Object), contains(element), clear(), indexOf(element),
// isEmpty()