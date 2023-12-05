package practice.Search;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,12,33};
        int key=100;

        System.out.println(key+" is on "+search(arr,key));
    }

    public static int search(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
