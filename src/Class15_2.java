// program to find whether a number is prime or not

// prime number: any number is prime number if number of factors are two.

import java.util.Scanner;

public class Class15_2 {

    static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            // prime number
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to check for prime number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // check for prime number
        System.out.println(n + " is prime: " + isPrime(n));
    }
}