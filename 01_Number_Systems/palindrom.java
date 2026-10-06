public class palindrom {

    public static boolean isReverse(int n) {
        int rev = 0;
        int original = n;

        while (n != 0) {
            int store = n % 10;

            rev = (rev * 10) + store;
            n = n / 10;
        }

        return (rev == original);

    }

    public static void main(String[] args) {

    }
}
