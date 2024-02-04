package practice.Array;

//https://takeuforward.org/data-structure/maximum-product-subarray-in-an-array/

public class MaximumProductSubarray {

    // brute force approach
    static int maxProductSubArray(int nums[]) {

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = 1;
                for (int k = i; k <= j; k++) {
                    product *= nums[k];

                }
                result = Math.max(result, product);
            }
        }
        return result;
    }

    // better approach
    static int maxProductSubArray2(int arr[]) {
        int result = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            int p = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                p *= arr[j];
                result = Math.max(result, p);
            }
            result = Math.max(result, p);
        }
        return result;
    }

    // optimized approach

    static int maxProduct(int[] nums) {

        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int ans = nums[0];

        for (int i = 0; i < n; i++) {

            // if any of leftProduct or rightProduct become 0 then update it to 1
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            // prefix product
            leftProduct *= nums[i];

            // suffix product
            rightProduct *= nums[n - 1 - i];

            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, -3, 0, -4, -5 };
        int answer = maxProduct(nums);
        System.out.print("The maximum product subarray is: " + answer);
    }
}
