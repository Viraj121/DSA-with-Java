package practice.StringQuestions;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    // Function to swap values at two pointers
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    // Function to print permutations of an integer array
    // This function takes three parameters:
    // 1. Integer array
    // 2. Starting index of the array
    // 3. Ending index of the array
    static void permute(int[] arr, int l, int r, List<List<Integer>> result) {
        if (l == r) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : arr) {
                permutation.add(num);
            }
            result.add(permutation);
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, r, result);
                swap(arr, l, i); // backtrack
            }
        }
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, 0, nums.length - 1, result);

        // Print the result
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}
