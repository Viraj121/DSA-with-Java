package sort;

import java.util.Arrays;

//time complexity = O(n^2)
public class Bubble {
    public static void main(String[] args) {
        int arr[] = { 7,6,5,4,3,2 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr) {
        boolean swapp;

        // outer loop will count n-1 iterations

        for (int i = 0; i < arr.length; i++) {
            swapp = false;

            // inner loop of sorting elements without considering sorted elements which are
            // at end..

            for (int j = 1; j < arr.length - i; j++) {
                
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapp = true;
                }
            }
            if (!swapp) { // !false=true
                break;
            }
        }
    }
}
