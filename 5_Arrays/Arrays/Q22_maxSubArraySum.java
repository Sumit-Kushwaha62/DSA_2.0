public class Q22_maxSubArraySum {

    // Brute Force Solution:

    public static void  maxSub(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            int start = i;

            for(int j = i; j<arr.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k <= end; k++){
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = "+maxSum);
    }



    public static void kadance(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0; 

        for(int i = 0; i<arr.length; i++){
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max subarray sum is = "+ ms);
    }
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3};
        kadance(arr);
    }
}
