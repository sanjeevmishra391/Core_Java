import java.util.HashSet;
// set: it is a collection of unique data

class Class19_4 {
    public static void main(String args[]) {
        // for (int i = 0; i < args.length; i++) {
        // System.out.println(args[i]);
        // }

        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(9);

        System.out.println(set);

        set.add(5);

        System.out.println(set);

        set.add(4);
        set.add(32);
        set.add(68);

        System.out.println(set); // the order of data in set is not same as the order of insertion.

        boolean res = set.contains(5);
        System.out.println(res);

        set.remove(32);

        System.out.println(set);

        // Question: Union - Intersection of two arrays

        int arr1[] = { 4, 7, 9, 10, 52 };
        int arr2[] = { 7, 8, 2, 4, 83 };

        // Expected Output: {9, 10, 52, 8, 2, 83}

        // add arr1 into set: {4, 7, 9, 10, 52}
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int a : arr1) {
            uniqueSet.add(a);
        }

        for (int a : arr2) {
            if (uniqueSet.contains(a)) {
                uniqueSet.remove(a);
            } else {
                uniqueSet.add(a);
            }
        }

        System.out.println(uniqueSet);
    }
}