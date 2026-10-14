//package 03_Arrays.Fundamentals;

public class ReverseinArray {

    public static void reverse(int arr[]){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            // swap
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }


    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        reverse(arr);
        System.out.println("The reversed array is: ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

}
}
