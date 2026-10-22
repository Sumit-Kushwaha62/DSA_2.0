public class Q01_BasicsOfArrays {

    // Searching in Array
    public static int search(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.print("Array elements: ");
        print(arr);

        int target = 4;
        int index = search(arr, target);
        System.out.println("Target " + target + " found at index: " + index);
    }
}
