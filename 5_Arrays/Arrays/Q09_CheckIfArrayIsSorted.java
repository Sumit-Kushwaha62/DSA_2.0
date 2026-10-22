public class Q09_CheckIfArrayIsSorted {

    // Brute Force Approach:
    public static boolean isSortedBruteForce(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    }

    // Optimal Approach:
    public static boolean checkSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 5, 2, 3, 3 };
        System.out.println("Is array sorted (Optimal): " + checkSorted(arr));
    }
}