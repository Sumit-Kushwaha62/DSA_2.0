// package Recursion;

public class BasicRec {


    // Print your name n times:
    public static void print(int n) {

        if (n == 0) {
            return;
        }
        System.out.println("Hi Sumit");
        print(n - 1);

    }


    // Print 1 to N times 

    public static void pirntOnetoN(int n){
        if(n == 0){
            return;
        }
      System.out.println(n);
        pirntOnetoN(n-1);
  
    }





    public static void main(String[] args) {
        int n = 5;
        pirntOnetoN(n);

    }
}
