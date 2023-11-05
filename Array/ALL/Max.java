package ALL;
import java.util.Scanner;

class Max {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,7};

        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int maxval = maxval(arr);
        int maxR = Maxrange(arr, 0, 3);
        System.out.println("max value is " + maxval + " ");
        System.out.println("Max value within range " + maxR);

    }

    static int Maxrange(int arr[], int start, int end) {

        if (arr == null) {
            return -1;
        }

        if(start>end){
            return -1;
        }

        int max = arr[0];

        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static int maxval(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int Maxi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Maxi) {
                Maxi = arr[i];
            }
        }

        return Maxi;

    }
}