package ALL;
import java.util.Arrays;
import java.util.Scanner;

class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int arr[] = new int[3];
        // arr[0]=23;
        // arr[1]=89;

        // System.out.println(arr[1]);

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]+" ");
        // }

        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(str));

        str[1]="lol";

        System.out.println(Arrays.toString(str));

        sc.close();
    }
}
