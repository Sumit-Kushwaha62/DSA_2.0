/*
 * Question 1: Count All Digits of a Number
 * 
 * -------------------------------------------------------------
 * Concept / Definition (Count Digits Kya Hota Hai?):
 * Kisi given number N me total kitne digits (ank) hain,
 * unhe count karna.
 * 
 * Example 1:
 * Input: n = 7789
 * Digits: 7, 7, 8, 9
 * Output: 4
 * 
 * Example 2:
 * Input: n = 0
 * Output: 1 (0 has 1 digit)
 * 
 * Example 3:
 * Input: n = -456
 * Output: 3 (Negative sign is ignored when counting digits)
 * 
 * -------------------------------------------------------------
 * Variation 2: Count Digits That Evenly Divide N
 * (Number ke aise digits count karo jo N ko completely divide karein)
 * 
 * Example:
 * Input: n = 12
 * Digits: 1, 2
 * Check:
 * - 12 % 1 == 0 -> Yes (count = 1)
 * - 12 % 2 == 0 -> Yes (count = 2)
 * Output: 2
 * 
 * -------------------------------------------------------------
 * Logic / Approach Hints:
 * 1. Base Case: Agar `n == 0` hai, count = 1.
 * 2. Loop: Jab tak `n > 0` (or `n != 0`):
 *    - Last digit hatane ke liye: `n = n / 10`
 *    - `count++`
 * 3. Alternate Trick: `(int) Math.log10(Math.abs(n)) + 1` (for n > 0)
 */

public class countDigit {

    // Count total number of digits in n
    public static int countTotalDigits(int n) {
        if (n == 0) {
            return 1;
        }

        n = Math.abs(n); // Handle negative numbers
        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        return count;
    }

    // Count how many digits in n evenly divide n
    public static int countDividingDigits(int n) {
        int original = Math.abs(n);
        int temp = original;
        int count = 0;

        while (temp != 0) {
            int digit = temp % 10;
            // Prevent division by zero and check if digit evenly divides original
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            temp = temp / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 7789;
        System.out.println("Total digits in " + n + ": " + countTotalDigits(n)); // Expected: 4

        int num = 12;
        System.out.println("Digits of " + num + " that divide " + num + ": " + countDividingDigits(num)); // Expected: 2
    }
}
