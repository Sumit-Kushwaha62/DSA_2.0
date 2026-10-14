/*
 * Question 4: Palindrome Number
 * 
 * -------------------------------------------------------------
 * Concept / Definition (Palindrome Number Kya Hota Hai?):
 * Palindrome number wo number hota hai jise aage se (left to right)
 * ya peeche se (right to left) padhne par SAME hi value milti hai.
 * In other words: If original number == reversed number -> Palindrome.
 * 
 * Example 1:
 * Input: n = 121
 * Reverse: 121
 * Since 121 == 121 -> Output: true (Palindrome)
 * 
 * Example 2:
 * Input: n = 123
 * Reverse: 321
 * Since 123 != 321 -> Output: false (Not a Palindrome)
 * 
 * Example 3:
 * Input: n = -121
 * Reverse: 121-
 * Negative numbers are NOT palindromes (Output: false)
 * 
 * -------------------------------------------------------------
 * Logic / Approach Hints:
 * 1. Agar `n < 0` ho, toh direct `return false`.
 * 2. Number ka reverse nikalo using while loop.
 * 3. Check karo `original == rev`.
 */

public class palindrom {

    public static boolean isPalindrome(int n) {
        // Negative numbers are not palindrome (e.g. -121 != 121-)
        if (n < 0) {
            return false;
        }

        int rev = 0;
        int original = n;

        while (n != 0) {
            int digit = n % 10;
            rev = (rev * 10) + digit;
            n = n / 10;
        }

        return (rev == original);
    }

    public static void main(String[] args) {
        int n1 = 121;
        int n2 = 123;
        int n3 = -121;

        System.out.println(n1 + " is Palindrome? -> " + isPalindrome(n1)); // Expected: true
        System.out.println(n2 + " is Palindrome? -> " + isPalindrome(n2)); // Expected: false
        System.out.println(n3 + " is Palindrome? -> " + isPalindrome(n3)); // Expected: false
    }
}
