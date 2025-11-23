public class RemoveDuplicatesFromSortedArray {

    /*
     * Brute Forch Approach - Since we need to store only unique elements, we can
     * use the set data structure. We can insert all the elements of the array in
     * the set irrespective of their frequency as set only allows one occurence of
     * each element
     */
    // Optimal Approach - (Two Pointer), Instead of using a set to store the unique
    // elements, we can implement a two pointer strategy to optimize the space.
    // Since the array is sorted, we know that all the duplicate values will be
    // adjacent to each other.

    public static int remove(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }

        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3 };
        System.out.println(remove(arr));

    }
}
