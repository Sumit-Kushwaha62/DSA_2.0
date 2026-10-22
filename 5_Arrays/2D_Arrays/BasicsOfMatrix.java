//package 5_Arrays.2D_Arrays;


import java.util.*;

public class BasicsOfMatrix {
    public static void main(String[] args) {
        

        
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];

        System.out.println("Enter your values ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        // // printing

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
