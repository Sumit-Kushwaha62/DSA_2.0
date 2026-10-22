import java.util.Arrays;

public class Q05_LargestElementInArray {

    // Brute Force Approach: Sort the array - O(N log N)
    public static int largestBruteForce(int arr[]) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        return temp[temp.length - 1];
    }

    // Optimal Approach: Single loop - O(N)
    public static int largest(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("The largest element in the array is: " + largest(arr));
        System.out.println("Brute force check: " + largestBruteForce(arr));
    }
}