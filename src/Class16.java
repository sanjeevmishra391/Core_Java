// exception handling

// an exception is an abnormal condition that arises in code at run time.
// runtime-error

// throw, throws, try, catch, finally

// Error: Error refers to an illegal operation performed by the user which results in the abnormal working of the program.
// Error vs Exception

// When you have multiple catch statements, it is important to place exception subclasses
// before any of their superclasses.

public class Class16 {

    static void division(int a, int b) {
        System.out.println("Before try catch block");

        // int n = a / 0;

        try {
            // block of code that monitors for errors(exceptions)
            System.out.println("Beginning of try block");

            int ans = a / b;
            System.out.println("Below division");

            int arr[] = new int[5];
            arr[9] = 15;

            System.out.println("At the end of try block");
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Exception: Division by zero is not possible");
        } catch (Exception e) {
            System.out.println("In the exception catch block");
        }

        System.out.println("Outside the try block");
    }

    public static void main(String[] args) {
        System.out.println("In the main method");

        division(8, 0);

        System.out.println("At the end of main method");
    }
}
