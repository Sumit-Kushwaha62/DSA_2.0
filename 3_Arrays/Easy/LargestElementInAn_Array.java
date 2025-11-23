import java.util.*;

public class LargestElementInAn_Array {

    // The Brute Force Approach sort elements:

    public static int largest(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }


    // Recursive Approach - Using a max variable
    public static int largestValue(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 8, 5, 9, 8, 6 };
        System.out.println(largestValue(arr));
        
        System.out.println("-----------");

        System.out.println(largest(arr));

    }
}
