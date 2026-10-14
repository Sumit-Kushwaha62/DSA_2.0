/*
 * Question 14: Divisors of a Number (Print / Find all factors)
 * 
 * -------------------------------------------------------------
 * Concept / Definition (Divisors Kya Hote Hain?):
 * Divisor (ya Factor) wo number hota hai jo given number N ko completely
 * divide kar de (yaani remainder 0 aaye: `N % i == 0`).
 * 
 * Example 1:
 * Input: n = 12
 * Divisors of 12: 1, 2, 3, 4, 6, 12
 * Output: [1, 2, 3, 4, 6, 12]
 * 
 * Example 2:
 * Input: n = 36
 * Divisors of 36: 1, 2, 3, 4, 6, 9, 12, 18, 36
 * 
 * Example 3:
 * Input: n = 7 (Prime number)
 * Divisors of 7: 1, 7
 * 
 * -------------------------------------------------------------
 * Logic / Approach Hints:
 * 
 * Approach 1 (Brute Force):
 * 1. Loop `i` from 1 to `n`:
 *    - agar `n % i == 0`, toh print `i`.
 * Time Complexity: O(N)
 * 
 * Approach 2 (Optimized O(sqrt(N))):
 * 1. Loop `i` from 1 to `Math.sqrt(n)` (i.e. `i * i <= n`):
 *    - agar `n % i == 0`:
 *        - `i` ek divisor hai.
 *        - agar `(n / i) != i`, toh `(n / i)` bhi dusra divisor hai!
 * 2. Example for 36:
 *    - i=1 -> pairs: (1, 36)
 *    - i=2 -> pairs: (2, 18)
 *    - i=3 -> pairs: (3, 12)
 *    - i=4 -> pairs: (4, 9)
 *    - i=6 -> (6, 6) -> 6 only once
 * Time Complexity: O(sqrt(N))
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class divisorsOfNumber {

    // Approach 1: Simple O(N) approach
    public static void printDivisorsSimple(int n) {
        System.out.print("Divisors of " + n + " (O(N)): ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Approach 2: Optimized O(sqrt(N)) approach returning sorted list
    public static List<Integer> getDivisorsOptimized(int n) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                // Pair divisor check (avoid adding square root twice)
                if (i * i != n) {
                    divisors.add(n / i);
                }
            }
        }

        Collections.sort(divisors);
        return divisors;
    }

    public static void main(String[] args) {
        int n = 36;
        printDivisorsSimple(n);
        System.out.println("Divisors of " + n + " (Sorted O(sqrt(N))): " + getDivisorsOptimized(n));
        
        int n2 = 12;
        System.out.println("Divisors of " + n2 + ": " + getDivisorsOptimized(n2));
    }
}
