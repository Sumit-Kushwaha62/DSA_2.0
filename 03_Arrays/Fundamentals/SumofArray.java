//package 03_Arrays.Fundamentals;

public class SumofArray {

    public static int sumOfArray(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum +arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("Sum of array: " + sumOfArray(arr));
    }
}
