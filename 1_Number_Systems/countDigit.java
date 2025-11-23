// package Maths;

public class countDigit {

    // Count How many digits have
    public static void count(int n) {
        int count = 0;
        if (n == 0) {
            count = 1;
        } else {
            while (n != 0) {
                n = n / 10;
                count++;

            }
        }
        System.out.println(count);

    }

    // Count how many nums is have which can divided with nums:

    public static int divide(int n) {
        int count = 0;
        int p = n;

        while (n != 0) {
            int digit = n % 10;
            if (p % n == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 121;

        count(n);
        System.out.println();
        System.out.println(divide(n));

    }
}







