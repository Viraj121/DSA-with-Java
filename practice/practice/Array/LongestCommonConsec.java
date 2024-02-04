package practice.Array;

// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// Example 1:
// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

import java.util.HashSet;
import java.util.Set;

public class LongestCommonConsec {
    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };

        int result = longestConsecutive(nums);

        System.out.println("Length of the longest consecutive sequence: " + result);

    }

    static int longestConsecutive(int[] nums) {
       Set<Integer> hashset=new HashSet<>();

       for(int num:nums){
        hashset.add(num);
       }

       int longestStreak=0;

       for(int num:nums){
        
        if (!hashset.contains(num-1)) {
            int currentStreak=1;
            int currentNum=num;

            while (hashset.contains(currentNum+1)) {
                currentNum+=1;
                currentStreak+=1; 
            }

            longestStreak=Math.max(currentStreak, longestStreak);
        }
       }

       return longestStreak;
    }
}
