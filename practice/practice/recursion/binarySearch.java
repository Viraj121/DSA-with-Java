package practice.recursion;


public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 23, 25, 36, 49, 90 };
        int n = arr.length;
        int target = 36;
        int ans = binaryRec(arr, 0, n, target);
        System.out.println(ans);
    }

    static int binaryRec(int arr[], int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target==arr[mid]) {
            return mid;
        }
        
        if (target < arr[mid]) {
            return binaryRec(arr, start, mid - 1, target);
        }

        return binaryRec(arr, mid+1, end, target);
    }
}
