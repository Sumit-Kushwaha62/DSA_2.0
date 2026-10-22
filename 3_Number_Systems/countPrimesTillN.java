/*
 * Question 11: Count of Prime Numbers Till N
 * 
 * -------------------------------------------------------------
 * Concept / Definition:
 * 1 se lekar N tak (inclusive) jitne bhi Prime Numbers aate hain,
 * unka total count find karna hai.
 * 
 * Example 1:
 * Input: N = 10
 * Prime numbers <= 10 are: 2, 3, 5, 7
 * Total Count = 4
 * Output: 4
 * 
 * Example 2:
 * Input: N = 20
 * Prime numbers <= 20 are: 2, 3, 5, 7, 11, 13, 17, 19
 * Total Count = 8
 * Output: 8
 * 
 * Example 3:
 * Input: N = 1
 * Output: 0 (1 prime nahi hota)
 * 
 * -------------------------------------------------------------
 * Logic / Approach Hints:
 * 
 * Approach 1 (Simple Loop + isPrime):
 * 1. `count = 0`
 * 2. Loop `i` from 2 to N:
 *    - if `isPrime(i)` is true -> `count++`
 * 3. Return `count`
 * Time Complexity: O(N * sqrt(N))
 * 
 * Approach 2 (Sieve of Eratosthenes - Highly Optimized):
 * 1. Boolean array `isPrime[]` size (N + 1) banao, sabko `true` mark karo.
 * 2. `isPrime[0] = isPrime[1] = false`.
 * 3. Loop `p` from 2 to `sqrt(N)`:
 *    - agar `isPrime[p] == true`, toh `p` ke saare multiples (`p*p, p*p + p, ...`) ko `false` mark karo.
 * 4. Array me kitne `true` bache hain unhe count karo.
 * Time Complexity: O(N * log(log N))
 */

import java.util.Arrays;

public class countPrimesTillN {

    // Helper method for Approach 1
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Approach 1: Simple loop
    public static int countPrimesSimple(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    // Approach 2: Sieve of Eratosthenes (Optimized)
    public static int countPrimesSieve(int n) {
        if (n < 2) return 0;

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Primes count till " + n + " (Simple): " + countPrimesSimple(n)); // Expected: 4
        System.out.println("Primes count till " + n + " (Sieve): " + countPrimesSieve(n));   // Expected: 4

        int n2 = 20;
        System.out.println("Primes count till " + n2 + " (Sieve): " + countPrimesSieve(n2)); // Expected: 8
    }
}
