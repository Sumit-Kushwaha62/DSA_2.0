public class GCD_HCF {

    public static int commanDivider(int a, int b){
       
        int res = Math.min(a, b);
        while (res > 0) {
            if(a % res == 0 && b % res == 0 ){
                break;
            }
            res--;
        }
        return res;
    }

    // using euclidean algoritham:

   public static  int gcd(int a, int b){
        while (a != b) {
            if(a >b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        return a;
    }

// Optimized way of euclidean:

public static int Optimized(int a, int b){
    if(b == 0){
        return a;
    }else{
        return Optimized(b, a%b);
    }
}

    public static void main(String[] args) {
        System.out.println(Optimized(10, 15));
        
    }
}
