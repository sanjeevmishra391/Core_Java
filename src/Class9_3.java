// recursion: when a method calls itself

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

        if (n == 1) {
            return 1;
        }

        return n * factorialRecursion(n - 1);
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

    }
}

// 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
// write a program to find the nth fibonacci number
// use recursion to find the nth fibonaccir number