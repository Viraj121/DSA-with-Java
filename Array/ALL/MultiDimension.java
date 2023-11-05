package ALL;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // output

        // for (int row = 0; row < arr.length; row++) {
        //     // for each col in every row
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // output using foreach

        for(int[] a:arr){
        System.out.println(Arrays.toString(a));
        }

        sc.close();
    }
}
