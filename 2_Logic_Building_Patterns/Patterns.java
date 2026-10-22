import java.util.*;

public class Patterns {

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< SOLID SQURE PATTERN >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // public static void pattern(int n){
    // for(int i = 0; i<n; i++){
    // for(int j = 0; j<n; j++){
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Right-Angled Triangle Star Pattern >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // public static void pattern2(int n) {
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j <= i; j++) {
    // System.out.print("*" + " ");
    // }
    // System.out.println();
    // }

    // }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Right-Angled Number Triangle >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // public static void pattern3(int n) {
    //     for (int i = 1; i < n; i++) {
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(j + " ");

    //         }
    //         System.out.println();
    //     }
    // }



    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<< Right-Angled Number Triangle (row number repeat) >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 

    // public  static void pattern4(int n){
    //     for(int i= 1; i<=n; i++){
    //         for(int j = 1; j<=i; j++){
    //             System.out.print(i+" ");
    //         }
    //         System.out.println();
    //     }
    // }



// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Inverted Right-Angled Triangle >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// public static void pattern5(int n){
//         for(int i = 1; i<=n; i++){
//             for(int j = 0; j<n-i+1; j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }

// }




// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<                >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

public static void pattern6(int n){
    
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter your number here!");
        int n = sc.nextInt();

        pattern6(n);










        sc.close();
    }
}