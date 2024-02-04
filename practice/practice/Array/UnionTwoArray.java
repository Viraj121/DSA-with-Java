package practice.Array;

import java.util.HashSet;

public class UnionTwoArray {

    public static int unoin(int arr[],int arr2[]){

        HashSet<Integer> set =new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr1[]={1,2,23,12,11,22,12};
        int arr2[]={1,2,12,23,22,11,12,33,21};
        System.out.println(unoin(arr1, arr2));

    }
}
