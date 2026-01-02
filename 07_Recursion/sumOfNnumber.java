public class sumOfNnumber {

    public static int sum(int n) {

        if (n == 1) {
            return 1;
        }

        int sumOfn_1 = sum(n - 1);
        int sumOfN = n + sumOfn_1;
        return sumOfN;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));

    }
}
