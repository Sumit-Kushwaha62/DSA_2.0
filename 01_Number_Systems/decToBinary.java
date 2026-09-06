public class decToBinary {

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

    public static int binToDecimal(int binNum){
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

        int num = 1010;
        System.out.println(binToDecimal(num));
        
        // for (int i = 101; i <= 1010; i++) {
        //     System.out.println(binToDecimal(i));
        // }

    }
}
