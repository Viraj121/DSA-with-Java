package DSA;
//2023. Number of Pairs of Strings With Concatenation Equal to Target Given an array of digit strings nums and a digit string target, return the number of pairs of indices (i, j) (where i != j) such that the concatenation of nums[i] + nums[j] equals target.

// Example 1:

// Input: nums = ["777","7","77","77"], target = "7777"
// Output: 4
// Explanation: Valid pairs are:
// - (0, 1): "777" + "7"
// - (1, 0): "7" + "777"
// - (2, 3): "77" + "77"
// - (3, 2): "77" + "77"
public class Leetcode2023 {
    public int numOfPairs(String[] nums, String target) {;
        int ans=0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i!=j){
                    String str=nums[i]+nums[j];
                    if (str.equals(target)) {
                        ans++;
                    }

                }
            }
        }
        return ans;

    }
}
