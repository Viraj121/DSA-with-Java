package ALL;
import java.util.Scanner;

//sum of all elements

public class sumofArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

// search an element in an array

class search {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 21, 3 };

        int target = 3;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                ans = i;
                break;
            }
        }

        System.out.println("found " + target + " at index " + ans);
    }
}

// Count the occurence of element in an array

class OccurenceOf {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("target value??");
        int target = sc.nextInt();
        sc.close();

        // System.out.println("count of x " + Occurence(arr, target));

        // System.out.println("last occurence: "+LastOccurence(arr,target));

        System.out.println("true yaa false: " + sortHaikya(arr));

    }

    public static int Occurence(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        return count;
    }

    static int LastOccurence(int arr[], int target) {
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                last = i;
            }
        }
        return last;
    }

    static boolean sortHaikya(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
            if (!check) {
                break;
            }
        }
        return true;
    }
}