public class Class10 {

    // n = 2^x;
    // 1. n is power of 2:
    // prime factorization of n contains only 2s.
    // if we divide n by 2 we will cancel out all the 2s and n will be reduced to 1.
    // 2. n is not power of 2:
    // prime factorization of n contains prime number other than 2.
    // we will reach to an odd number other than 1.
    boolean powerOfTwo(int n) {

        // loop
        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1;
    }

    boolean powerOfTwoRecursion(int n) {
        // base condition
        if (n == 1) {
            return true;
        }

        // check if n is odd
        if (n % 2 != 0) {
            return false;
        }

        return powerOfTwoRecursion(n / 2);
    }

    public static void main(String[] args) {
        int n = 16;
        Class10 obj = new Class10();

        boolean result = obj.powerOfTwo(n);
        System.out.println(n + " is power of 2: " + result);

        boolean resultRecursion = obj.powerOfTwoRecursion(n);
        System.out.println(n + " is power of 2: " + resultRecursion);
    }
}
