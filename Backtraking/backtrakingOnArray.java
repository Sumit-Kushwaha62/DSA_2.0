//package 8_Backtraking;

public class backtrakingOnArray {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void changeArray(int arr[], int i, int val) {
        // Base case:
        if (i == arr.length) {
            print(arr);
            return;
        }
        // recursion part:
        arr[i] = val;
        changeArray(arr, i + 1, val + 1); // fuction call stack:
        arr[i] = arr[i] - 2; // Backtracking statement:
    }

    public static void main(String[] args) {
        int arr[] = new int[5];

        changeArray(arr, 0, 1);
        System.out.println();
        print(arr);
    }
}
