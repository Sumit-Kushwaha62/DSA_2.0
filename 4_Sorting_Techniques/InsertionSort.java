

/*
{
  "Question": "Insertion Sort",
  "Leetcode": "Not Available",
  "GeeksforGeeks": "https://www.geeksforgeeks.org/problems/insertion-sort/1",
  "Approach": "Pick elements one by one from unsorted portion and insert them into their correct position in the sorted left subarray by shifting greater elements to the right. Time: O(N^2) worst/avg, O(N) best, Space: O(1)."
}
*/

public class InsertionSort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    





    public static void recursiveInsertoinSort(int arr[]){

    }





    public static void insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // pick current element (element)
            int j = i - 1; // start comparing with previous elements ( possion)

            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j]; // shift element to right
                j--;
            }

            arr[j + 1] = curr; // insert curr at correct position
        }
    }


   



    public static void main(String[] args) {
        int arr[] = { 1, 3, 8, 4, 9 };
        test(arr);
        print(arr);

    }
}








