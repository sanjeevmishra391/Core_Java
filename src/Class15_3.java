// write a program to find the sum of digits of any number
// n = 361, sum = 3 + 6 + 1 = 10

import java.util.Scanner;

public class Class15_3 {

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to find the sum of digits");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Sum of digits of " + n + "= " + sumOfDigits(n));
    }
}
