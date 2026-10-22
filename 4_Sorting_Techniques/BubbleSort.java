/*
{
  "Question": "Bubble Sort",
  "Leetcode": "Not Available",
  "GeeksforGeeks": "https://www.geeksforgeeks.org/problems/bubble-sort/1",
  "Approach": "Repeatedly compare adjacent elements and swap them if in the wrong order. Optimized with swapped flag to terminate early if array is already sorted. Time: O(N^2) worst/avg, O(N) best, Space: O(1)."
}
*/

//package Sorting_Searching;

public class BubbleSort {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }





    public static void recursiveBubbleSort(int arr[]){


    }









    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

  


    
    public static void main(String[] args) {
        int arr[] = { 2, 3, 7, 4, 1 };
        
        print(arr);

    }

}
