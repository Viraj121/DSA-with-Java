package practice.Array;

public class FindMinMax {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        findMinMax(arr);
    }

    static void findMinMax(int arr[]) {
        if (arr == null || arr.length == 0) {
            System.out.println("array is empty");
            return;
        }

        int min=arr[0];
        int max=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
            }else if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println("min value "+min);
        System.out.println("max value "+max);
    }
}
