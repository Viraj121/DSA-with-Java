package practice.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={6,4,3,2,1};
        int end=arr.length-1;
        int start=0;
        System.out.println(Arrays.toString(arr));
        divide(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }

    public static void divide(int arr[],int start,int end){

        if (start>=end) {
            return;
        }

        int mid=start+(end-start)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conquere(arr,start,mid,end);
    }

    public static void conquere(int arr[],int start,int mid,int end){

        int[] merged=new int[end-start+1];

        int index1=start;
        int index2=mid+1;
        int x=0;

        while (index1<=mid && index2<=end) {
            if (arr[index1]<=arr[index2]) {
                merged[x++]=arr[index1++];
            }else{
                merged[x++]=arr[index2++];
            }
        }

        while (index1<=mid) {
            merged[x++]=arr[index1++];
        }

        while (index2<=end) {
            merged[x++]=arr[index2++];
        }

        for (int i = 0,j=start ; i < merged.length; i++,j++) {
            arr[j]=merged[i];
        }
    }
}
