public class LeftRotateAnArrayByDPlace {

    // Using an extra space:
    public static void rotateArrayExtraSpace(int[] arr, int D) {
        int n = arr.length;
        D = D % n;
        int[] temp = new int[D];

        // Copy first D elements to temp
        for (int i = 0; i < D; i++) {
            temp[i] = arr[i];
        }

        // Shift remaining elements left
        for (int i = D; i < n; i++) {
            arr[i - D] = arr[i];
        }

        // Append temp elements to the end
        for (int i = 0; i < D; i++) {
            arr[n - D + i] = temp[i];
        }
    }
    

    // Left rotate by D places:
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotateDplace(int arr[], int d) {
        int n = arr.length;
        int D = d % n;

        reverse(arr, 0, D - 1);
        reverse(arr, D, n - 1);
        reverse(arr, 0, n - 1);

    }

    public static void main(String[] args) {

    }
}
