// loops(for, while, do while, nested loop, break, continue)

public class Class5 {
    public static void main(String[] args) {
        // nested loop

        // Pattern 1
        // * i=0
        // * * i=1
        // * * * i=2
        // * * * * i=3
        // * * * * * i=4
        for (int i = 0; i < 5; i++) {
            // row number = i
            // j=[0, i], number of elements = i+1
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 2
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        // while loop -> n=5,
        // int n = 5, i = 5;
        // while (i > 0 && i <= n) {
        // int j = 0;
        // while (j < i) {
        // System.out.print("* ");
        // j++;
        // }
        // i--;
        // System.out.println();
        // }

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 3
        // _ _ _ _ *
        // _ _ _ * *
        // _ _ * * *
        // _ * * * *
        // * * * * *

        int rows = 10;

        for (int i = 0; i < rows; i++) {
            // handle _
            // i=0, j=[0, 3]
            // i=1, j=[1, 3]
            // i=2, j=[2, 3]
            // i=3, j=[3, 3]

            for (int j = i; j < rows - 1; j++) {
                System.out.print("_ ");
            }

            // handle *
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ------------ Enhanced for loop ---------------
        int arr[] = { 2, 6, 4, 9, 10, 5 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEnhanced for loop result: ");
        for (int x : arr) {
            System.out.print(x + " ");
            // any changes to element will not be reflected in original array
            x = x * 2;
            System.out.print(x + " ,");
        }

        // original array
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // given an array and an element find the element in array using foreach.

        // [2, 4, 7, 10, 9]
        // data = 7 -> found

        // 5 -> not found

        // for loop, variable for storing the data, array, if-else, boolean variable

        int data = 4;
        boolean found = false;
        for (int x : arr) {
            if (data == x) {
                found = true;
                break; // helps to come out of loop
            }
            System.out.print(x + " ");
        }

        if (found) {
            System.out.println("\nFound");
        } else {
            System.out.println("\nNot Found");
        }

        // [2 6 4 9 10 5]
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                continue; // helps to move to next iteration
            }

            System.out.print(arr[i] + " ");
        }
    }
}
