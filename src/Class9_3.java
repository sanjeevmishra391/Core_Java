
// recursion: when a method calls itself

// it is a process where a function calls itself
// for the smaller inputs until it reaches base condition.

// to solve problem using recursion you must know two things.
// 1. base condition (the solution of the smallest problem)
// 2. formulate problem using solution of smaller problems.

class Class9_3 {

    void printName() {
        System.out.println("Sanjeev Mishra");
    }

    void printSomething() {
        System.out.println("Hello there!!");
    }

    // factorial = 1*2*3*...*n

    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // factorialRecursion(5) = 5 * factorialRecursion(4); = 5 * 24 = 120;
    // factorialRecursion(4) = 4 * factorialRecursion(3); = 4*6 = 24;
    // factorialRecursion(3) = 3 * factorialRecursion(2); = 3 * 2 = 6;
    // factorialRecursion(2) = 2 * factorialRecursion(1); = 2*1 = 2;
    // factorialRecursion(1) = 1;
    int factorialRecursion(int n) {
        // base condition
        if (n == 1) {
            return 1;
        }

        return n * factorialRecursion(n - 1);
    }

    int fibonacci(int n) {
        int a = 0, b = 1;
        int nthTerm = 0;
        for (int i = 2; i <= n; i++) {
            nthTerm = a + b;
            a = b;
            b = nthTerm;
        }

        return nthTerm;

        /*
         * a = 0, b = 1, n = 6;
         * loops starts ->
         * i=2, nthterm = 0 + 1 => 1; a = 1; b = 1;
         * i=3, nthterm = 1 + 1 => 2; a = 1; b = 2;
         * i=4, nthterm = 1 + 2 => 3; a = 2; b = 3;
         * i=5, nthterm = 2 + 3 => 5; a = 3; b = 5;
         * i=6, nthterm = 3 + 5 => 8; a = 5; b = 8;
         */
    }

    int fibonacciRecursion(int n) {

        // base condition
        if (n == 0 || n == 1) {
            return n;
        }

        return (fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2));
    }

    int sumOfDigits(int n) {
        // n = 352, sum = 10;
        int sum = 0;
        while (n > 0) {
            int r = n % 10; // gives the last digit
            sum = sum + r;
            n = n / 10; // gives remaining digits(except last one)
        }

        return sum;
    }

    int sumOfDigitsRecursion(int n) {
        // base condition
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumOfDigitsRecursion(n / 10);
    }

    public static void main(String[] args) {
        Class9_3 obj = new Class9_3();
        obj.printSomething();

        // Class9_3 obj2 = new Class9_3();
        // obj2.printName();

        int n = 5;
        int resultFact = obj.factorial(n);
        System.out.println("Factorial of " + n + " = " + resultFact);

        int recursionFact = obj.factorialRecursion(n);
        System.out.println("Factorial of " + n + " = " + recursionFact);

        int resultFibo = obj.fibonacci(6);
        System.out.println("6th term of fibonacci series = " + resultFibo);

        int resultFiboRecursion = obj.fibonacciRecursion(8);
        System.out.println("8th term of fibonacci series = " + resultFiboRecursion);

        int sumOfDigits = obj.sumOfDigits(1352);
        System.out.println("Sum of digits = " + sumOfDigits);

        int sumOfDigitsRecursion = obj.sumOfDigitsRecursion(352);
        System.out.println("Sum of digits = " + sumOfDigitsRecursion);

    }
}

// a=0, b=1, 2ndterm = a + b = 0 + 1 = 1;
// 3rdterm = 2ndterm + 1stterm =
// 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
// write a program to find the nth fibonacci number
// use recursion to find the nth fibonaccir number