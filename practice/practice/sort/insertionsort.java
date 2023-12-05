package practice.sort;

import java.util.Arrays;

//apna college method.
class insertionsort{
    public static void main(String[] args) {
        int arr[]={9099,99,182,88,1};
        System.out.println(Arrays.toString(arr));
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insert(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
                
            }
            arr[j+1]=current;
        }
    }
}