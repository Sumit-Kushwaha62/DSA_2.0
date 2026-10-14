/*
 * Question 13: LCM (Least Common Multiple) of Two Numbers
 * 
 * -------------------------------------------------------------
 * Concept / Definition (LCM Kya Hota Hai?):
 * LCM (Least Common Multiple / Laghutam Samapavartya) do ya do se 
 * zyada numbers ka wo sabse chhota (smallest) positive integer hota hai
 * jo un dono numbers se completely divide (divisible) ho sake.
 * 
 * Formula:
 * a * b = GCD(a, b) * LCM(a, b)
 * => LCM(a, b) = (a * b) / GCD(a, b)
 * 
 * Example 1:
 * Input: a = 4, b = 6
 * Multiples of 4: 4, 8, [12], 16, 20, [24], ...
 * Multiples of 6: 6, [12], 18, [24], ...
 * Common multiples: 12, 24, ...
 * Smallest common multiple = 12
 * Output: 12
 * 
 * Using Formula:
 * GCD(4, 6) = 2
 * LCM(4, 6) = (4 * 6) / 2 = 24 / 2 = 12
 * 
 * Example 2:
 * Input: a = 5, b = 7
 * GCD(5, 7) = 1 (coprime)
 * LCM(5, 7) = (5 * 7) / 1 = 35
 * Output: 35
 * 
 * -------------------------------------------------------------
 * Logic / Approach Hints:
 * 1. Euclidean algorithm se pehle `GCD(a, b)` nikalo.
 * 2. `LCM = (a * b) / GCD(a, b)`
 * Note: Integer overflow se bachne ke liye `(a / GCD(a, b)) * b` ya long use kar sakte hain.
 */

public class LCM {

    // Helper method to find GCD using Euclidean Algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM
    public static int findLCM(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        int a = 4, b = 6;
        System.out.println("LCM of " + a + " and " + b + " is: " + findLCM(a, b)); // Expected: 12

        int x = 5, y = 7;
        System.out.println("LCM of " + x + " and " + y + " is: " + findLCM(x, y)); // Expected: 35
    }
}
