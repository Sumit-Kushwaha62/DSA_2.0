/*
 * Question 6: Factorial of a Given Number
 * 
 * -------------------------------------------------------------
 * Concept / Definition (Factorial Kya Hota Hai?):
 * Factorial of a non-negative integer N (denoted as N!) ka matlab hota hai
 * 1 se lekar N tak ke sabhi positive integers ka continuous multiplication (product).
 * 
 * Special Rule:
 * 0! = 1
 * 1! = 1
 * 
 * Formula:
 * N! = N * (N - 1) * (N - 2) * ... * 2 * 1
 * 
 * Example 1:
 * Input: n = 5
 * Calculation: 5! = 5 * 4 * 3 * 2 * 1 = 120
 * Output: 120
 * 
 * Example 2:
 * Input: n = 4
 * Calculation: 4! = 4 * 3 * 2 * 1 = 24
 * Output: 24
 * 
 * Example 3:
 * Input: n = 0
 * Output: 1
 * 
 * -------------------------------------------------------------
 * Logic / Approach Hints:
 * 
 * Approach 1 (Iterative Loop):
 * 1. Initialize `ans = 1` (use `long` because factorial grows very fast).
 * 2. Loop `i` from 2 to `n`:
 *    - `ans = ans * i`
 * 3. Return `ans`
 * 
 * Approach 2 (Recursive):
 * 1. Base case: `if (n == 0 || n == 1) return 1;`
 * 2. Recursive call: `return n * fact(n - 1);`
 */

import java.util.Scanner;

public class factorial {

    // Iterative Approach
    public static long fact(int num) {
        if (num < 0) {
            System.out.println("Factorial of negative numbers is undefined.");
            return -1;
        }

        long result = 1;
        for (int i = 2; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    // Recursive Approach
    public static long factRecursion(int num) {
        if (num < 0) return -1;
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factRecursion(num - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " (Iterative): " + fact(n));       // Expected: 120
        System.out.println("Factorial of " + n + " (Recursive): " + factRecursion(n)); // Expected: 120
    }
}
