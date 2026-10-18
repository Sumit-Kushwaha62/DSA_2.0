public class InsertionSort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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


    public static void test(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }


    }



    public static void main(String[] args) {
        int arr[] = { 1, 3, 8, 4, 9 };
        test(arr);
        print(arr);

    }
}








