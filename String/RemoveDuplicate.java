import java.util.Arrays;

class Main {
    static int removeDuplicates(int arr[], int n) {
        if (n == 0 || n == 1)
            return n;

        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[j] != arr[i])
                arr[++j] = arr[i];
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 90, 40, 100, 100, 10 };
        Arrays.sort(arr);
        int n = arr.length;

        n = removeDuplicates(arr, n);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}