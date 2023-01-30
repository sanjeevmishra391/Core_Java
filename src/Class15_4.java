// String class

// https://www.geeksforgeeks.org/difference-between-and-equals-method-in-java/

public class Class15_4 {
    public static void main(String[] args) {
        String name = "Sanjeev Mishra"; // ['S', 'a', 'n', 'j', 'e', 'e', 'v']

        System.out.println("Character at 2nd index:  " + name.charAt(2));

        String greeting = name.concat(", hey");
        System.out.println(greeting);

        System.out.println("Does ee exist in name:  " + name.contains("ee"));

        String name2 = new String("Sanjeev Mishra");
        System.out.println(name2);

        if (name == name2) {
            System.out.println("Are equal..");
        } else {
            System.out.println("Are not equal");
        }

        if (name.equals(name2)) {
            System.out.println("Are equal..");
        } else {
            System.out.println("Are not equal");
        }

        int position = name.indexOf('a');
        System.out.println("Position of a = " + position);

        int len = name.length();
        System.out.println("Length of the string = " + len);

        String arr[] = name.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
