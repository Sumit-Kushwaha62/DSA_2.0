/*
 * Question 10: Check for Prime Number
 * 
 * -------------------------------------------------------------
 * Concept / Definition (Prime Number Kya Hota Hai?):
 * Prime number ek aisa positive integer (> 1) hota hai jiske
 * sirf aur sirf DO (2) factors hote hain:
 * 1 aur wo Number khud (itself).
 * Note: 1 prime number NAHI hota hai (kyunki 1 ka sirf 1 factor hai).
 * 
 * Example 1:
 * Input: n = 7
 * Factors of 7: 1, 7 (Exactly 2 factors)
 * Output: true (7 is Prime)
 * 
 * Example 2:
 * Input: n = 4
 * Factors of 4: 1, 2, 4 (3 factors)
 * Output: false (4 is NOT Prime / Composite)
 * 
 * Example 3:
 * Input: n = 2
 * Factors of 2: 1, 2
 * Output: true (2 is the only EVEN prime number)
 * 
 * -------------------------------------------------------------
 * Logic / Approach Hints:
 * 1. Base cases: Agar `n <= 1` ho, toh return `false`.
 * 2. Optimized Loop: `2` se lekar `sqrt(n)` (yaani `i * i <= n`) tak check karo.
 *    - Agar kisi bhi `i` se `n % i == 0` ho jaye, iska matlab n divisible hai, toh return `false`.
 * 3. Agar poore loop me koi divisor nahi mila, toh return `true`.
 * 
 * Time Complexity: O(sqrt(N))
 */

public class primeNumber {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        // Check divisibility from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a factor other than 1 and n
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(n + " is prime? " + isPrime(n));

    }
}
