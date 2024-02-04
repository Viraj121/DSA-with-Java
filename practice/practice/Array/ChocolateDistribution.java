package practice.Array;

import java.util.Arrays;

public class ChocolateDistribution {

    static int distribution(int arr[],int n,int m){
        Arrays.sort(arr);
        int ans=Integer.MAX_VALUE;

        for (int i = 0; i <= n-m; i++) {
            int min=arr[i];
            int max=arr[i+m-1];
            int gap=max-min;
            if (gap<ans) {
                ans=gap;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[]={12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int n=arr.length;
        int m=7;
        int ans=distribution(arr, n, m);
        if (ans != -1) {
            System.out.println("Minimum difference is " + ans);
        } else {
            System.out.println("Invalid input");
        }
    }
}
