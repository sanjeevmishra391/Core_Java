
import java.util.Scanner;

public class Class15 {

    static int throwDice() {
        double r = Math.random(); // [0.0, 1.0)
        return (int) (r * 6 + 1);
    }

    public static void main(String[] args) {
        // scanner class is used to take inputs from other locations(console, file).
        // System.in takes input from standard input stream i.e., Console
        Scanner sc = new Scanner(System.in);

        // nextLine() Reads the full line
        // next() reads a single word
        // nextInt() reads integer
        // nextFloat()
        // nextDouble()

        System.out.println("Enter your full name:");
        String name = sc.nextLine();

        System.out.println("Hello, " + name);

        System.out.println("Enter the number of times to roll die");
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            int ans = throwDice();
            System.out.println("Die roll: " + ans);
        }

        int p = (int) Math.pow(2, 10);
        System.out.println("2^10 = " + p);
    }
}

// Write a program to take input from user.
// Take a number as input from user and check if it is prime or not.