public class SecondLargestElementInAnArrayWithoutSorting {

    // Brute Force approch - sort the elements and get sencond last index value but
    // it's only works when array doesn't contains duplicates:

    // Better approach:
    public static int secondLargest1(int arr[]) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != largest && arr[j] > secondLargest) {
                secondLargest = arr[j];
            }
        }
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    // Optimal approach:

    public static int secondLargest2(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];

            }

        }
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(secondLargest1(arr));

    }
}
