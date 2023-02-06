// BufferedReader

import java.io.*;

public class Class21_7 {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        System.out.println("Enter your age: ");

        int age = Integer.parseInt(br.readLine());

        age = age / 10;
        // System.out.println("Hello, " + name);
        System.out.println("Your age is " + age);

    }
}
