import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;
        System.out.println(Arrays.toString(arr));

        divide(arr, 0, n - 1);

        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        System.out.println(Arrays.toString(arr));

    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int arr[], int si, int mid, int ei) {

        int merged[] = new int[ei - si + 1];// 0 based indexing hota hai so size saayi aaye for that +1;
        int indx1 = si; // to track 1st array
        int indx2 = mid + 1;// to track 2nd array
        int x = 0;// to track merge array index.
        while (indx1 <= mid && indx2 <= ei) {
            if (arr[indx1] <= arr[indx2]) {
                merged[x++] = arr[indx1++];
            } else {
                merged[x++] = arr[indx2++];
            }
        }

        while (indx1 <= mid) {
            merged[x++] = arr[indx1++];
        }

        while (indx2 <= ei) {
            merged[x++] = arr[indx2++];
        }

        // copy all the elements from duplicate array to original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }
}
