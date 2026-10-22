/*
 * Question 5: Return the largest digit in a given number
 * 
 * -------------------------------------------------------------
 * Concept / Definition:
 * Ek given number ke sabhi digits me se jo sabse bada (maximum) digit
 * hai, use find karke return karna hai.
 * 
 * Example 1:
 * Input: n = 254891
 * Digits: 2, 5, 4, 8, 9, 1
 * Output: 9 (kyunki 9 sabse bada digit hai)
 * 
 * Example 2:
 * Input: n = 702
 * Digits: 7, 0, 2
 * Output: 7
 * 
 * Example 3:
 * Input: n = 0
 * Output: 0
 * 
 * -------------------------------------------------------------
 * Logic / Approach Hints:
 * 1. Ek variable `maxDigit = 0` (ya `Integer.MIN_VALUE`) initialize karo.
 * 2. While loop chalao jab tak `n != 0`:
 *    - Last digit nikalo: `int digit = n % 10;`
 *    - Compare karo: `maxDigit = Math.max(maxDigit, digit);`
 *    - Number ko chota karo: `n = n / 10;`
 * 3. Loop khatam hone ke baad `maxDigit` return karo.
 */

public class largestDigit {

    public static int findLargestDigit(int n) {
        // Agar number negative hai toh use positive bana lo
        n = Math.abs(n);

        if (n == 0) {
            return 0;
        }

        int maxDigit = 0;

        while (n != 0) {
            int digit = n % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            n = n / 10;
        }

        return maxDigit;
    }

    public static void main(String[] args) {
        int num1 = 254891;
        System.out.println("Largest digit in " + num1 + " is: " + findLargestDigit(num1)); // Expected: 9

        int num2 = 702;
        System.out.println("Largest digit in " + num2 + " is: " + findLargestDigit(num2)); // Expected: 7
    }
}
