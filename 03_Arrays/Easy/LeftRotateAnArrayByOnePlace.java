
public class LeftRotateAnArrayByOnePlace {

  /*
   * Brute Forch Approch - The rotated array has just a difference that its first
   * element is present at the last index of the array. So if we can just store
   * the element at the first index and then shift all the elements towards the
   * left and at last put the stored element at the last index. We will get th
   * rotated array.
   */
  static void solve(int arr[], int n) {
    int temp[] = new int[n];
    for (int i = 1; i < n; i++) {
      temp[i - 1] = arr[i];
    }
    temp[n - 1] = arr[0];
    for (int i = 0; i < n; i++) {
      System.out.print(temp[i] + " ");
    }
  }

  // Optimal Approch - At first, we have to shift the array towards the left so,
  // we store the value of the first index in a variable (let it be x).
  public static void rotate(int arr[]) {
    int temp = arr[0];
    for (int i = 1; i < arr.length; i++) {
      arr[i - 1] = arr[i];
    }
    arr[arr.length - 1] = temp;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 9, 3, 4, 9, 5, 6 };

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
