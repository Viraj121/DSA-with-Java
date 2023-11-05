package DSA;

// Input: arr[] = {11, 15, 6, 8, 9, 10}, X = 16
// Output: true
// Explanation: There is a pair (6, 10) with sum 16


// Java program to find a pair with a given
// sum in a sorted and rotated array

public class rotatedSortedArray {
    // This function returns true if arr[0..n-1]
	// has a pair with sum equals to x.

    static boolean pairInSortedRotated(int arr[], int n, int X) {

        // find pivot element
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                break;
            }
        }

        // left is the lowest element
        int left = (i + 1) % n;

        // right is the largest element
        int right = i;

        while (left != right) {
            if (arr[left] + arr[right] == X) {
                return true;
            }

            if (arr[left] + arr[right] < X) {
                left = (left + 1) % n;
            } else {
                right = (n + right - 1) % n;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int arr[]={11,15,6,7,8,9,10};
        int X=25;
        int N=arr.length;

        if (pairInSortedRotated(arr, N, X)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
