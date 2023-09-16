package sort;

import java.util.Arrays;

//kunal kushwaha solution
public class selection {
    public static void main(String[] args) {

        int arr[] = { 4, 2, 1, 5, 8 };
        select(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void select(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }

    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

}

// apna college solution on selection sort

class Sorting {
    
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 7, 8, 1, 3, 2 };

        // selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;

            // this loop will run to find the smallest element in the array and then it will
            // be swapped with assumped smallest element which was 1st element hint:(for
            // loop of i)

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            // finally joh do numbers select hua hai unko swap kar diya hai
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }
}
