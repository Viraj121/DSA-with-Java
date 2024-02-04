package practice.Array;

//https://takeuforward.org/data-structure/search-element-in-a-rotated-sorted-array/


public class RotatedSortedArray {
        static int search(int[] nums, int target) {
            int low=0;
            int high=nums.length-1;
    
            while(low<=high){
                int mid=(low+high)/2;
    
                if(nums[mid]==target){
                    return mid;
                }
    
                if(nums[low]<=nums[mid]){
                    if(nums[low]<=target && nums[mid]>target){
                    high=mid-1;
                    }
                    else{
                    low=mid+1;
                    }
                }else{
                    if(nums[mid]<target && target<=nums[high]){
                    low=mid+1;
                    }else{
                    high=mid-1;
                    }
                }
            }
            return -1;
        }
        public static void main(String args[])
    {
        // Let us search 3 in below array
        int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int key = 3;
        int ans=search(arr1, key);
        System.out.println(ans);
        
    }
}
