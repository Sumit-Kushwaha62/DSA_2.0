public class CheckIfTheArrayIsSorted {

    // brute Force Approach:
    public static boolean isSorted(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }

        return true;
    }

    // Optimal Approch:
    public static boolean checkSorted(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3 };
        System.out.println(checkSorted(arr));

    }
}
