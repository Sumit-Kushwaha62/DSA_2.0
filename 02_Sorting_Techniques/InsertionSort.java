public class InsertionSort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // pick current element
            int j = i - 1; // start comparing with previous elements

            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j]; // shift element to right
                j--;
            }

            arr[j + 1] = curr; // insert curr at correct position
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 8, 4, 9 };
        insertion(arr);
        print(arr);

    }
}