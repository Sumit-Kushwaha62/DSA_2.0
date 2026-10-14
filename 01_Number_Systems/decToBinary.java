/*
 * Conversion: Decimal to Binary and Binary to Decimal
 * 
 * -------------------------------------------------------------
 * Concept / Definition:
 * 1. Decimal (Base 10): 0 to 9 numbers (normal numbers jaise 10, 25, 42).
 * 2. Binary (Base 2): Only 0 and 1 (computer format jaise 1010 = 10 in decimal).
 * 
 * Decimal to Binary Conversion:
 * Input: 10
 * Calculation:
 * - 10 / 2 = 5, Remainder = 0
 * - 5 / 2 = 2,  Remainder = 1
 * - 2 / 2 = 1,  Remainder = 0
 * - 1 / 2 = 0,  Remainder = 1
 * Read remainders from bottom to top: 1010
 * Output: 1010
 * 
 * Binary to Decimal Conversion:
 * Input: 1010
 * Calculation:
 * (1 * 2^3) + (0 * 2^2) + (1 * 2^1) + (0 * 2^0) = 8 + 0 + 2 + 0 = 10
 * Output: 10
 * 
 * -------------------------------------------------------------
 * Logic / Approach Hints:
 * Decimal to Binary:
 * - While `decNum > 0`:
 *   - `rem = decNum % 2`
 *   - `ans = ans + (rem * pow)`
 *   - `pow = pow * 10`
 *   - `decNum = decNum / 2`
 * 
 * Binary to Decimal:
 * - While `binNum > 0`:
 *   - `rem = binNum % 10`
 *   - `ans = ans + (rem * pow)`
 *   - `pow = pow * 2`
 *   - `binNum = binNum / 10`
 */

public class decToBinary {

    // Decimal to Binary Converter
    public static int decToBinaryConv(int decNum) {
        int ans = 0;
        int pow = 1;

        while (decNum > 0) {
            int rem = decNum % 2;
            decNum /= 2;

            ans += (rem * pow);
            pow *= 10;
        }
        return ans;
    }

    // Binary to Decimal Converter
    public static int binToDecimal(int binNum) {
        int ans = 0;
        int pow = 1;

        while (binNum > 0) {
            int rem = binNum % 10;
            ans += rem * pow;

            binNum /= 10;
            pow *= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int dec = 10;
        int bin = decToBinaryConv(dec);
        System.out.println("Decimal " + dec + " to Binary -> " + bin); // Expected: 1010

        int originalDec = binToDecimal(bin);
        System.out.println("Binary " + bin + " to Decimal -> " + originalDec); // Expected: 10
    }
}
