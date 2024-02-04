package practice.Array;
//A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array arrt of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

// For Example:

// N=7 and arr = [4,5,0,1.9,0,5,0].

// There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array

// Example 1:

// Input:

// 7  – Value of N

// [4,5,0,1,0,0,5] – Element of arr[O] to arr[N-1],While input each element is separated by newline

// Output:

// 4 5 1 9 5 0 0


//campusmonk solution

import java.util.Scanner;

public class tcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //approach 2 using two pointer 

        // int i = 0;
        // int j = n - 1;

        // while (i <= j) {
        //     while (i < n && arr[i] != 0) {
        //         i++;
        //     }

        //     while (j > 0 && arr[j] == 0) {
        //         j--;
        //     }

        //     if (i < j) {
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //     }

        // }


        //if we want the same order as given input then this approach 

        int i=0;
        int j=0;

        while(j<n){
            if(arr[j]!=0){
                arr[i]=arr[j];
                i++;
                j++;
            }else{
                j++;
            }
        }

        while(i<n){
            arr[i]=0;
            i++;
        }


        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2] + " ");
        }
    }}

    // approach 1

    // int brr[] = new int[n];

    // int i = 0;
    // int j = 0;

    // while (i < arr.length) {
    // if (arr[i] != 0) {
    // brr[j] = arr[i];
    // i++;
    // j++;
    // } else {
    // i++;
    // }
    // }
    // for( int j2 = 0;j2<brr.length;j2++)
    // {
    //         System.out.print(brr[j2] + " ");
    //     }

    //s.c = o(n)



