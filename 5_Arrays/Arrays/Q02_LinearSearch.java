public class Q02_LinearSearch {

    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target if found
            }
        }
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;
        System.out.println("The target element is found at index: " + linearSearch(arr, target));
    }
}
