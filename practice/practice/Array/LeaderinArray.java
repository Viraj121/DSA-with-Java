package practice.Array;
// https://takeuforward.org/data-structure/leaders-in-an-array/

import java.util.ArrayList;
import java.util.Collections;

public class LeaderinArray {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = { 10, 22, 12, 3, 0, 6 };

        // ArrayList<Integer> ans=printLeader(arr,n);

        ArrayList<Integer> ans = printLeaderOA(arr, n);
        Collections.sort(ans, Collections.reverseOrder());

        System.out.println(ans);

    }

    // brute force T.C = O(n2)

    static ArrayList<Integer> printLeader(int[] arr, int n) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean leader = true;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }

            if (leader) {
                ans.add(arr[i]);
            }
        }

        return ans;
    }

    // optimized approach T.C = O(n)

    public static ArrayList<Integer> printLeaderOA(int arr[], int n) {

        ArrayList<Integer> ans = new ArrayList<>();

        int max = arr[n - 1];

        ans.add(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        return ans;
    }

}