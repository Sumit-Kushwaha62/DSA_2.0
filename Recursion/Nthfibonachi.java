public class Nthfibonachi {

    public static int fibonachi(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibn_1 = fibonachi(n - 1);
        int fibn = fibonachi(n - 2);
        int fib = fibn_1 + fibn;
        return fib;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(fibonachi(3));

    }
}
