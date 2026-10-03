//package 4_Searchings;

public class LinearSearch {


public static int test(int arr[], int target){
    for(int i = 0; i<arr.length; i++){
        if(target == arr[i]){
            System.out.println("The value is exits on = "+ i +" and the value is = " + arr[i]);
            return i;
        }
    }
    return -1;
}
















    public static int linearSearch(int arr[], int target){
        for(int i = 0; i<arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return - 1;
    }







    public static void main(String[] args) {
        int arr[] = {2, 3, 4,5, 6, 7, 8 , 9};
        System.out.println(test(arr, 7));
    }
}
