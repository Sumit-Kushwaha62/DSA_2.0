//package 4_ Searchings;

// Itterative Approch:
public class binarySearch {

    public static int binarySearchIterative(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // element found
            }
        }
        return -1; // element not found
    }

    // Recursive Approach:
    public static int binarySearchRecursive(int arr[], int start, int end, int target) {
        // Base case: search space exhausted
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target < arr[mid]) {
            return binarySearchRecursive(arr, start, mid - 1, target);
        } else if (target > arr[mid]) {
            return binarySearchRecursive(arr, mid + 1, end, target);
        } else {
            return mid; // element found
        }
    }

    public static void main(String[] args) {

    }

}
