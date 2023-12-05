package practice;

import java.util.Arrays;

class Main {
    static int removeDuplicates(int arr[], int n) {
        if (n == 0 || n == 1)
            return n;
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            if (arr[i] != arr[i + 1])
                arr[j++] = arr[i];
        arr[j++] = arr[n - 1];

        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 90, 40, 90, 40, 50, 50 };
        Arrays.sort(arr);
        int n = arr.length;

        n = removeDuplicates(arr, n);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}