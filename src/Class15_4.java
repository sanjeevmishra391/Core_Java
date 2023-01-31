// String class

// https://www.geeksforgeeks.org/difference-between-and-equals-method-in-java/
// https://www.w3schools.com/java/java_ref_string.asp

public class Class15_4 {
    public static void main(String[] args) {
        String name = "    Sanjeev Mishra Hey Hello Hi    "; // ['S', 'a', 'n', 'j', 'e', 'e', 'v']

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
            System.out.println("Are equal.. (contains same data)");
        } else {
            System.out.println("Are not equal");
        }

        int position = name.indexOf('a');
        System.out.println("Position of first a = " + position);

        int len = name.length();
        System.out.println("Length of the string = " + len);

        String arr[] = name.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Sanjeev Mishra
        String sub = name.substring(2, 5); // nje
        System.out.println("Substring: " + sub);

        char[] characters = name.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) (characters[i] + 1);
        }

        System.out.println("Encrypted message: ");
        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
        }

        System.out.println("\nDecrypted message: ");
        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) (characters[i] - 1);
            System.out.print(characters[i]);
        }

        String lower = name.toLowerCase();
        System.out.println("\nLower case string: " + lower);

        String upper = name.toUpperCase();
        System.out.println("Upper case string: " + upper);

        String trimmed = name.trim();
        System.out.println("Trimmed string: " + trimmed);
    }
}
