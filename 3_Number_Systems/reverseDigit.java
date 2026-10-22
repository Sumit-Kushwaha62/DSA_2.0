/*
 * Question 3: Reverse a Number
 * 
 * -------------------------------------------------------------
 * Concept / Definition (Reverse Number Kya Hota Hai?):
 * Kisi given number ke digits ka order ulta (reverse) kar dena.
 * 
 * Example 1:
 * Input: n = 1234
 * Output: 4321
 * 
 * Example 2:
 * Input: n = 7000
 * Output: 7 (Reverse: 0007 which is 7)
 * 
 * Example 3:
 * Input: n = -456
 * Output: -654
 * 
 * -------------------------------------------------------------
 * Logic / Approach Hints:
 * 1. Initialize `rev = 0`
 * 2. While `n != 0`:
 *    - Last digit nikalo: `digit = n % 10`
 *    - Reverse me jodte jao: `rev = (rev * 10) + digit`
 *    - Number ko divide karo: `n = n / 10`
 * 3. Return `rev`
 * 
 * Dry Run for n = 123:
 * - Iteration 1: digit = 3, rev = 0*10 + 3 = 3, n = 12
 * - Iteration 2: digit = 2, rev = 3*10 + 2 = 32, n = 1
 * - Iteration 3: digit = 1, rev = 32*10 + 1 = 321, n = 0
 * Output: 321
 */

public class reverseDigit {

    public static int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            rev = (rev * 10) + digit;
            n = n / 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        int p = 1234;
        System.out.println("Original: " + p + " -> Reversed: " + reverse(p)); // Expected: 4321

        int neg = -636;
        System.out.println("Original: " + neg + " -> Reversed: " + reverse(neg)); // Expected: -636
    }
}
