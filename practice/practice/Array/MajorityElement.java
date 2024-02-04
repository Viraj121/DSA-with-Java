package practice.Array;

import java.util.HashMap;

public class MajorityElement {


    //better approach.
    public static void MajorityEle(int nums[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key)>n/2) {
                System.out.println(key);
            }
        }

    }

    //optimized approach
    static int majorityElement(int[] num) {

        int majority = num[0], votes = 1;
    
        for (int i = 1; i < num.length; i++) {
    
          if (votes == 0) {
            votes++;
            majority = num[i];
          } else if (majority == num[i]) {
            votes++;
          } else
            votes--;
    
        }
        return majority;
      }

    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        MajorityEle(nums);
        int ans=majorityElement(nums);
        System.out.println(ans);

    }
}


//