import java.util.Scanner;

// write a program to check if string is palindrome or not.
// find the frequency of each character.

public class Class16_2 {

    // find the frequency of each character
    // "corejavasession"
    // a: 2, c: 1, e: 2, i: 1, j: 1, o: 2, n: 1, r: 1, s: 3, v: 1
    static void countFrequency(String str) {
        str = str.toLowerCase();

        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 97;
            freq[idx]++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                // i = 1 + 97 = 98, 'b'
                char c = (char) (i + 97);
                System.out.print(c + " : " + freq[i] + ", ");
            }
        }
    }

    // Palindrome string: string which is same when read from front or back.
    // For ex.: ata: true, asdfdsa: true
    static boolean isPalindrome(String str) {
        int l = str.length();
        for (int i = 0; i < l / 2; i++) {
            if (str.charAt(i) != str.charAt(l - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check for palindrome: ");
        String str = sc.next();

        // System.out.println(str + " is palindrome? " + isPalindrome(str));
        countFrequency(str);

    }
}
