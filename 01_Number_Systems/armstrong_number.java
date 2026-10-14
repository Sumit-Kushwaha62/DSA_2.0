/*
 * Question 7: Check if the number is Armstrong Number
 * 
 * -------------------------------------------------------------
 * Concept / Definition (Armstrong Number Kya Hota Hai?):
 * Armstrong number (ya Narcissistic number) ek aisa number hota hai
 * jisme har digit ko (total number of digits) ki power laga kar add karein,
 * toh result wahi original number ke barabar aata hai.
 * 
 * General Formula:
 * Agar number me 'd' digits hain (d = count of digits),
 * toh sum = (digit1^d) + (digit2^d) + ... + (digitN^d)
 * Agar sum == original number -> Armstrong Number.
 * 
 * 3-Digit Number Example:
 * Input: n = 153 (Total digits = 3)
 * Sum of cubes of digits = (1^3) + (5^3) + (3^3)
 *                        = 1 + 125 + 27
 *                        = 153
 * Since 153 == 153 -> 153 is an ARMSTRONG NUMBER (Output: true)
 * 
 * Another 3-digit Example:
 * 370 -> (3^3) + (7^3) + (0^3) = 27 + 343 + 0 = 370 -> true
 * 371 -> (3^3) + (7^3) + (1^3) = 27 + 343 + 1 = 371 -> true
 * 
 * 4-Digit Example:
 * Input: n = 9474 (Total digits = 4)
 * Sum of 4th powers = (9^4) + (4^4) + (7^4) + (4^4)
 *                   = 6561 + 256 + 2401 + 256
 *                   = 9474 (Output: true)
 * 
 * Non-Armstrong Example:
 * Input: n = 123 (Total digits = 3)
 * Sum = (1^3) + (2^3) + (3^3) = 1 + 8 + 27 = 36 != 123 (Output: false)
 * 
 * -------------------------------------------------------------
 * Logic / Approach Hints:
 * 1. Pehle number of digits count karo (`digitsCount = countDigits(n)`).
 * 2. Ek variable `sum = 0` aur `original = n` rakho.
 * 3. While loop (`n > 0`):
 *    - Last digit nikalo: `digit = n % 10`
 *    - Power add karo: `sum += Math.pow(digit, digitsCount)`
 *    - Number reduce karo: `n = n / 10`
 * 4. Return `sum == original`
 */

public class armstrong_number {

    // Helper to count total digits in number
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    // Check Armstrong for any number of digits (Generalized)
    public static boolean isArmstrong(int n) {
        int original = n;
        int d = countDigits(n);
        int sum = 0;

        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, d);
            temp = temp / 10;
        }

        return (sum == original);
    }

    public static void main(String[] args) {
        int[] testCases = {153, 370, 371, 9474, 123, 500};

        for (int num : testCases) {
            System.out.println(num + " is Armstrong? -> " + isArmstrong(num));
        }
    }
}
