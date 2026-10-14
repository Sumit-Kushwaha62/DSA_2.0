/*
 * Question 8: Check for Perfect Number
 * 
 * -------------------------------------------------------------
 * Concept / Definition (Perfect Number Kya Hota Hai?):
 * Perfect number ek aisa positive integer hota hai jiske sabhi
 * "proper divisors" (yaani number ko chhod kar baaki saare factors)
 * ka sum usi number ke barabar hota hai.
 * 
 * Proper Divisors of N = Wo saare numbers jo N ko completely divide karte hain,
 * excluding N itself.
 * 
 * Example 1:
 * Input: n = 6
 * Proper Divisors of 6: 1, 2, 3 (6 ko include nahi karenge)
 * Sum of divisors = 1 + 2 + 3 = 6
 * Since sum == n (6 == 6) -> 6 is a PERFECT NUMBER (Output: true)
 * 
 * Example 2:
 * Input: n = 28
 * Proper Divisors of 28: 1, 2, 4, 7, 14
 * Sum of divisors = 1 + 2 + 4 + 7 + 14 = 28
 * Since sum == n (28 == 28) -> 28 is a PERFECT NUMBER (Output: true)
 * 
 * Example 3:
 * Input: n = 15
 * Proper Divisors of 15: 1, 3, 5
 * Sum of divisors = 1 + 3 + 5 = 9
 * Since 9 != 15 -> 15 is NOT a perfect number (Output: false)
 * 
 * -------------------------------------------------------------
 * Logic / Approach Hints:
 * Approach 1 (Brute Force):
 * 1. `sum = 0`
 * 2. Loop `i` from 1 to `n - 1`:
 *    - agar `n % i == 0`, toh `sum += i`
 * 3. Return `sum == n`
 * 
 * Approach 2 (Optimized O(sqrt(N))):
 * 1. Loop `i` from 1 to `Math.sqrt(n)`:
 *    - agar `n % i == 0`:
 *        `sum += i`
 *        agar `i * i != n` aur `(n / i) != n`, toh `sum += (n / i)`
 * 2. Check `sum == n`
 */

public class perfectNumber {

    public static boolean isPerfect(int n) {
        if (n <= 1) {
            return false;
        }

        int sum = 1; // 1 is always a proper divisor for n > 1

        // Loop till sqrt(n) for efficiency
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) {
                    sum += (n / i);
                }
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 28;
        int n3 = 15;

        System.out.println(n1 + " is Perfect? -> " + isPerfect(n1)); // Expected: true
        System.out.println(n2 + " is Perfect? -> " + isPerfect(n2)); // Expected: true
        System.out.println(n3 + " is Perfect? -> " + isPerfect(n3)); // Expected: false
    }
}
