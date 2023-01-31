// nested try statements

public class Class16_3 {

    static void thirdFunc() {
        throw new ArithmeticException();
    }

    static void calculation(int a, int b) {
        try {
            // int res = a / b;
            // System.out.println("Res = " + res);

            // int arr[] = new int[5];
            // arr[9] = 5;

            // throw new ArithmeticException();
            thirdFunc();

        } catch (Exception e) {
            System.out.println("Exception is generated");
            // throw e;
        }
    }

    public static void main(String[] args) {
        // try {
        // int a = 1;

        // int b = 10 / a;

        // System.out.println("b = " + b);

        // try {
        // a = a / (a + a);

        // int arr[] = new int[5];
        // arr[99] = 4;
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Array index out of bound");
        // }

        // } catch (ArithmeticException e) {
        // System.out.println("Arithmetic exception");
        // }

        // try {
        // calculation(10, 0);
        // } catch (ArithmeticException e) {
        // System.out.println("You cannot do the division by zero");
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Index is out of range.");
        // }

        calculation(10, 0);

        System.out.println("Outside try-catch block");
    }
}
