package practice.Array;
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

//If target is not found in the array, return [-1, -1].

public class FirstandLastOccurence {
    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = searchRange(nums, target);

        System.out.println("Starting position: " + result[0]);
        System.out.println("Ending position: " + result[1]);

    }

    public static int[] searchRange(int[] nums, int target) {
        int ans[] = { -1, -1 };

        int low = 0;
        int high = nums.length - 1;

        // first index.
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                ans[0] = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                ans[1] = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
