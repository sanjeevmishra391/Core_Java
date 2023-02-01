import java.util.InputMismatchException;
import java.util.Scanner;

// calculator app;

class Calculator {
    int a, b;
    char op;

    Calculator(int a, int b, char op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    void calculation() {
        int res;
        switch (op) {
            case '+':
                res = a + b;
                printResult(res);
                break;

            case '-':
                res = a - b;
                printResult(res);
                break;

            case '*':
                res = a * b;
                printResult(res);
                break;

            case '/':
                // try {
                // res = a / b;
                // printResult(res);
                // } catch (Exception e) {
                // throw e;
                // }

                if (b == 0) {
                    throw new ArithmeticException();
                }

                res = a / b;
                printResult(res);
                break;

            default:
                System.out.println("Operator passed is not correct");
        }

    }

    void printResult(int res) {
        System.out.println(a + " " + op + " " + b + " = " + res);
    }
}

public class Class17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter one operator out of +, -, *, / or pass @ to exit the program : ");
            char op = sc.next().charAt(0);

            if (op == '@') {
                System.out.println("Exiting the program...");
                break;
            }

            int a = 1, b = 1;
            try {
                System.out.print("Enter the value of a: ");
                a = sc.nextInt();

                System.out.print("Enter the value of b: ");
                b = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Integer value was excepted. But found something else;");
            }

            Calculator cal = new Calculator(a, b, op);

            try {
                cal.calculation();
            } catch (ArithmeticException e) {
                System.out.println("Division by zero is not possible.");
            }

        }

    }
}
