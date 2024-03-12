package practice.Array;


//268. Missing Number

// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

// Example 1:
// Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.


// Input: nums = [0,1]
// Output: 2
// Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.


class MissingNumber {

    // brute force approach
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        boolean[] found = new boolean[n + 1];

        for (int num : nums) {
            found[num] = true;
        }

        for (int i = 0; i <= n; i++) {
            if (!found[i]) {
                return i;
            }
        }

        return -1;
    }

    // better approach
    public static int missingNumber2(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return totalSum - actualSum;
    }

    // optimized approach
    public static int missingNumber3(int[] nums) {

        int allXOR = 0;

        // XOR all numbers in range [0, n]
        for (int i = 0; i <= nums.length; i++) {
            allXOR = allXOR ^ i;
        }

        // XOR all numbers in the given array
        for (int num : nums) {
            allXOR = allXOR ^ num;
        }

        // The missing number
        return allXOR;
    }

    public static void main(String[] args) {
        int[] nums1 = { 3, 0, 1 };
        System.out.println("Missing number: " + missingNumber2(nums1));

        int[] nums2 = { 0, 1 };
        System.out.println("Missing number: " + missingNumber3(nums2)); // Output: 2

    }
}