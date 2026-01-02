public class MoveZerosToEnd {

    // Using extra space
    public static void moveZeros(int arr[]) {
        int temp[] = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }

    }

    // Using two pointer approch
    public static void moveZeros1(int arr[]){
        int j = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                j = i;
                break;
            }
        }

        if(j == -1){
            return;
        }
        for(int i = j+1; i<arr.length; i++){
            if(arr[i] != 0){
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
               
            }
            j++;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2, 0, 3, 0, 4, 0, 0, 0, 2 };
        moveZeros1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
