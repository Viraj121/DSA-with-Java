package practice.Array;

// Non-Repeating Element
// Find the first non-repeating element in a given array arr of N integers.
// Note: Array consists of only positive and negative integers and not zero.
import java.util.HashMap;

public class FirstNonRepeating {

    static int firstNonRepeating(int[] arr,int n){
        HashMap<Integer,Integer> m=new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i])+1);
            }else{
                m.put(arr[i], 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (m.get(arr[i])==1) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={9, 4, 9, 6, 7, 4};
        int n=arr.length;
        System.out.println(firstNonRepeating(arr,n));
    }
}
