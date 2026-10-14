/*
 * Question 12: GCD (Greatest Common Divisor) / HCF (Highest Common Factor)
 * 
 * -------------------------------------------------------------
 * Concept / Definition (GCD / HCF Kya Hota Hai?):
 * Do ya do se zyada numbers ka GCD / HCF wo sabse BADA (greatest)
 * common factor hota hai jo dono numbers ko completely divide karta hai.
 * 
 * Example 1:
 * Input: a = 12, b = 18
 * Factors of 12: 1, 2, 3, 4, [6], 12
 * Factors of 18: 1, 2, 3, [6], 9, 18
 * Common Factors: 1, 2, 3, 6
 * Greatest Common Factor (HCF) = 6
 * Output: 6
 * 
 * Example 2:
 * Input: a = 7, b = 13
 * Common Factors: 1
 * Output: 1 (Coprime numbers)
 * 
 * Example 3:
 * Input: a = 20, b = 40
 * Output: 20
 * 
 * -------------------------------------------------------------
 * Logic / Approach Hints:
 * 
 * Approach 1 (Brute Force):
 * 1. Loop from `min(a, b)` down to 1:
 *    - agar `a % i == 0` aur `b % i == 0`, toh return `i`.
 * Time Complexity: O(min(a, b))
 * 
 * Approach 2 (Euclidean Algorithm - Subtraction):
 * 1. While `a != b`:
 *    - agar `a > b`: `a = a - b`
 *    - else: `b = b - a`
 * 2. Return `a`
 * 
 * Approach 3 (Euclidean Algorithm - Modulo, Most Optimal):
 * 1. While `b != 0`:
 *    - `temp = b`
 *    - `b = a % b`
 *    - `a = temp`
 * 2. Return `a`
 * Time Complexity: O(log(min(a, b)))
 */

public class GCD_HCF {

    // Approach 1: Brute Force
    public static int bruteForceGCD(int a, int b) {
        int res = Math.min(a, b);
        while (res > 0) {
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }

    // Approach 2: Euclidean Algorithm (Subtraction)
    public static int gcdSubtraction(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    // Approach 3: Optimized Euclidean Algorithm (Modulo - Recursive)
    public static int gcdOptimized(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdOptimized(b, a % b);
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println("GCD of (" + a + ", " + b + ") [Optimized]: " + gcdOptimized(a, b)); // Expected: 6
        System.out.println("GCD of (" + a + ", " + b + ") [Subtraction]: " + gcdSubtraction(a, b)); // Expected: 6
        System.out.println("GCD of (" + a + ", " + b + ") [BruteForce]: " + bruteForceGCD(a, b));  // Expected: 6
    }
}
