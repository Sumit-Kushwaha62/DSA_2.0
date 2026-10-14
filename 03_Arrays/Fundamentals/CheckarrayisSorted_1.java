//package 03_Arrays.Fundamentals;

public class CheckarrayisSorted_1 {

    public static boolean isSorted(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] <= arr[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4, 5, 6, 7, 8, 9 };
        System.out.println("Is the array sorted? " + isSorted(arr));
    }
}
