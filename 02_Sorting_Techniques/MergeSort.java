public class MergeSort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void MergeSort1(int arr[], int start, int end) {
        // Base case: when array has 0 or 1 element, it's already sorted
        if (start >= end) {
            return;
        }

        // Find the middle index
        int mid = start + (end - start) / 2;

        // Recursively sort the left half
        MergeSort1(arr, start, mid);

        // Recursively sort the right half
        MergeSort1(arr, mid + 1, end);

        // Merge the two sorted halves
        merge(arr, start, mid, end);
    }

    public static void merge(int arr[], int start, int mid, int end) {
        // Temporary array to store merged sorted elements
        int temp[] = new int[end - start + 1]; // Because of zero based indexing 

        int i = start;   // pointer for left subarray
        int j = mid + 1; // pointer for right subarray
        int k = 0;       // pointer for temp array

        // Compare and pick smaller element from left or right subarray
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left subarray (if any)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right subarray (if any)
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy merged result back to the original array
        //System.arraycopy(temp, 0, arr, start, temp.length);

// Your old code:
 for (int m = 0; m < temp.length; m++) {
            arr[start + m] = temp[m]; // Because of zero based indexing 'start+m' size
        }


    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 2, 4, 9, 5, 4 };
        MergeSort1(arr, 0, arr.length-1);
        print(arr);
    }
}
