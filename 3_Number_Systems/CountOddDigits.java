/*
 * Question 2: Count Number of Odd Digits in a Number
 * 
 * -------------------------------------------------------------
 * Concept / Definition (Odd Digits Kya Hote Hain?):
 * Odd digits wo digits hote hain jo 2 se divide nahi hote (remainder 1 aata hai).
 * Odd Digits: 1, 3, 5, 7, 9
 * Even Digits: 0, 2, 4, 6, 8
 * 
 * Task: Ek number ke andar jitne bhi ODD digits hain unka total count nikalna.
 * 
 * Example 1:
 * Input: n = 123456789
 * Digits: 1(Odd), 2(Even), 3(Odd), 4(Even), 5(Odd), 6(Even), 7(Odd), 8(Even), 9(Odd)
 * Odd digits found: 1, 3, 5, 7, 9
 * Output: 5
 * 
 * Example 2:
 * Input: n = 2468
 * Output: 0 (No odd digits)
 * 
 * Example 3:
 * Input: n = 13579
 * Output: 5 (All digits are odd)
 * 
 * -------------------------------------------------------------
 * Logic / Approach Hints:
 * 1. Initialize `count = 0`
 * 2. While `n != 0`:
 *    - `last_digit = n % 10`
 *    - if `last_digit % 2 != 0` -> `count++`
 *    - `n = n / 10`
 * 3. Return `count`
 */

public class CountOddDigits {

    public static int countOddDigits(int n) {
        n = Math.abs(n);
        int count = 0;

        while (n != 0) {
            int last_digit = n % 10;
            if (last_digit % 2 != 0) {
                count++;
            }
            n = n / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int num1 = 123456789;
        System.out.println("Number of odd digits in " + num1 + ": " + countOddDigits(num1)); // Expected: 5

        int num2 = 2468;
        System.out.println("Number of odd digits in " + num2 + ": " + countOddDigits(num2)); // Expected: 0
    }
}
