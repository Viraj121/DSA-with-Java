package sort;

import java.util.Arrays;

class Insertion {
    public static void main(String[] args) {
        int arr[] = { 6, 5, 4, 3, 2, 1 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
//two part sorted and unsorted in array than camparison between sorted and unsorted one 
    static void insertion(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {

            //unsorted part of array
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }else{
                    break;
                }
            }

        }
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
