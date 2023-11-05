package practice;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 7, 9, 10 };
        int arr2[] = {90,87,54,36,22,1};
        binary(arr, 7);
        binaryDesc(arr2,1);
    }

    static void binary(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java if the start and end range is much bigger so new formula will be..
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (ans == -1) {
            System.out.println("not found");
        } else {
            System.out.println("element found at index: " + ans);
        }
    }

    static void binaryDesc(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java if the start and end range is much bigger so new formula will be..
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                end=mid-1;
            } else {
                start = mid + 1;
            }
        }
        if (ans == -1) {
            System.out.println("not found");
        } else {
            System.out.println("element found at index: " + ans);
        }
    }
}
