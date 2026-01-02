public class factorial {

    public static int Calcfactorial(int n) {

        if (n == 0) {
            return 1;
        }
        int fact1_n = Calcfactorial(n - 1);
        int factN = n * fact1_n;
        return factN;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Calcfactorial(5));

    }
}
