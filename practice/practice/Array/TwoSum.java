package practice.Array;
// https://studyalgorithms.com/array/leetcode-two-sum/

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {



    //optimized approach
    public static int[] sumTwo(int nums[],int target){

        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int compliment=target-nums[i];

            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment),i};
            }

            map.put(nums[i], i);
        }
        
        return new int[]{};
    }
    public static void main(String[] args) {
        int nums[]={1, 3, 3, 4};
        int target=5;

        int ans[]=sumTwo(nums,target);
        System.out.println(Arrays.toString(ans));


    }
}
