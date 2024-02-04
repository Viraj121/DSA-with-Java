package practice.Array;

//Given an integer array nums, find the  subarray with the largest sum, and return its sum.

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

public class MaximumSubarray {

    static int maxSubArray(int arr[]) {

        int maxi = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int ans = maxSubArray(arr);
        System.out.println(ans);
    }
}
