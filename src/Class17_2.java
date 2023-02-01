// try, catch, throw, throws, finally

// method1(called method) is throwing some kind of exception.
// method2(caller method) is calling method1. method2 must be told about exceptions thrown by method1.
// called method tells caller method by use of throws keyword.

// finally block is executed on the conclusion of try - catch block
// finally block will be executed even if no catch statement matches the exception.
// try can be paired with finally.

public class Class17_2 {

    static void execute() throws NullPointerException {
        try {
            String s = null;
            System.out.println(s.length()); // will throw NullPointerException
        } finally {
            System.out.println("In the finally block");
        }

        // System.out.println("At the end of execute function.");
    }

    static void division(int a, int b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("Dividing by zero");
        }

        int res = a / b;
        System.out.println(res);
    }

    public static void main(String[] args) {

        try {
            division(6, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Division by zero is not possible");
        }

        try {
            execute();
        } catch (Exception e) {
            // System.out.println(e);
            // e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Handling exception");
        }

    }

}
