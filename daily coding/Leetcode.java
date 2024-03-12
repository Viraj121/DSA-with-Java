// leetcode array ⭐

// leetcode string ⭐

public class Leetcode {
    public static void main(String[] args) {
        // int[] nums = { 5, 7, 7, 8, 8, 10 };
        // int target = 8;
        // int[] result = searchRange(nums, target);

        // System.out.println("Starting position: " + result[0]);
        // System.out.println("Ending position: " + result[1]);

        // int nums[] = { 1, 2, -3, 0, -4, -5 };
        // int answer = maxProduct(nums);
        // System.out.print("The maximum product subarray is: " + answer);

        // String ans=countAndSay(4);
        // System.out.println(ans);

        // int arr[] = { 11, 15, 6, 8, 9, 10 };
        // int X = 16;
        // int N = arr.length;

        // if (pairInSortedRotated(arr, N, X))
        // System.out.print("true");
        // else
        // System.out.print("false");

        // Let us search 3 in below array
        int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int key = 3;
        int ans = searchInRotate(arr1, key);
        System.out.println(ans);

    }
    // 1. find min max element from array - gfg

    static void findminmax(int arr[]) {
        if (arr == null || arr.length == 0) {
            System.out.println("array is empty");
            return;
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("min value " + min);
        System.out.println("max value " + max);
    }

    // 2. first and last occurence of element in sorted array - leetcode

    public static int[] searchRange(int nums[], int target) {
        int ans[] = { -1, -1 };

        int low = 0;
        int high = nums.length - 1;

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

    // 3. maximum product subarray

    static int maxProduct(int arr[]) {
        int ans = arr[0];
        int left = 1;
        int right = 1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            left = left == 0 ? 1 : left;
            right = right == 0 ? 1 : right;

            left *= arr[i];

            right *= arr[n - 1 - i];

            ans = Math.max(ans, Math.max(left, right));
        }

        return ans;
    }

    // 4. count and say
    public static String countAndSay(int n) {

        if (n == 1) {
            return "1";
        }

        String say = countAndSay(n - 1);

        String result = "";

        for (int i = 0; i < say.length(); i++) {
            int count = 1;
            char ch = say.charAt(i);

            while (i < say.length() - 1 && say.charAt(i) == say.charAt(i + 1)) {
                count++;
                i++;
            }

            result += Integer.toString(count) + ch;
        }
        return result;

    }

    // 5. Find if there is a pair with a given sum in the rotated sorted Array

    static boolean pairInSortedRotated(int arr[], int n,
            int x) {
        // Find the pivot element
        int i;

        for (i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1])
                break;

        // l is now index of smallest element
        int l = (i + 1) % n;

        // r is now index of largest element
        int r = i;

        // Keep moving either l or r till they meet
        while (l != r) {
            // If we find a pair with sum x, we
            // return true
            if (arr[l] + arr[r] == x)
                return true;

            // If current pair sum is less, move
            // to the higher sum
            if (arr[l] + arr[r] < x)
                l = (l + 1) % n;

            // Move to the lower sum side
            else
                r = (n + r - 1) % n;
        }
        return false;
    }

    // 6. search element in rotated sorted array
    static int searchInRotate(int arr[], int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && arr[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            else {
                if (arr[mid] < target && arr[high] >= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    //7. valid parentheses

    

}
