import java.util.Arrays;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        // int arr[] = { 5, 4, 3, 5, 6, 7 };

        // System.out.println("Enter the word");
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // sc.close();

        // String out=reverse(str);
        // System.out.println(out);

        // reverseInPlace(str);

        // bubble(arr);
        // System.out.println(Arrays.toString(arr));

        // selection(arr);
        // System.out.println(Arrays.toString(arr));

        // insertion(arr);
        // System.out.println(Arrays.toString(arr));

        // int n=arr.length;
        // divide(arr,0,n-1);
        // System.out.println(Arrays.toString(arr));

        // int ans = factorialrec(4);
        // System.out.println(ans);

        // fib(5);

        // int a = 0, b = 1;
        // int n = 9;
        // System.out.print(a + " " + b + " ");
        // fibrec(a, b, n);

        
    }

    // bubble sort ✅
    static void bubble(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    // selection sort ✅

    static void selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    // insertion sort✅

    static void insertion(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // merge sort ✅
    static void divide(int[] arr, int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquere(arr, si, mid, ei);
    }

    static void conquere(int arr[], int si, int mid, int ei) {
        int index1 = si;
        int index2 = mid + 1;

        int merge[] = new int[ei - si + 1];
        int x = 0;

        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                merge[x++] = arr[index1++];
            } else {
                merge[x++] = arr[index2++];
            }
        }

        if (index1 <= mid) {
            merge[x++] = arr[index1++];
        }

        if (index2 <= ei) {
            merge[x++] = arr[index2++];
        }

        for (int i = 0, j = 0; i < merge.length; j++, i++) {
            arr[j] = merge[i];
        }
    }

    // factorial of number
    static void factorial(int num) {
        int fact = 1;

        for (int j = 1; j <= num; j++) {
            fact = fact * j;
        }

        System.out.println(fact);
    }

    static int factorialrec(int num) {
        // using recurrsion
        if (num == 0) {
            return 1;
        } else {
            return (num * factorialrec(num - 1));
        }
    }

    // reverse a string
    // How can a given string be reversed using recursion?
    // How do you reverse a given string in place?

    static String reverse(String str) {

        String reverse = "";
        char ch[] = str.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            reverse = reverse + ch[i];
        }

        return reverse;
    }

    static String UsingStringBuilder(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder out = new StringBuilder(str).reverse();
        return out.toString();
    }

    static void reverseInPlace(String str) {
        char[] ch = str.toCharArray();

        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            right--;
            left++;
        }

        System.out.println(new String(ch));
    }

    // fibonacci series

    static void fib(int num) {
        int a = 0, b = 1;

        System.out.print(a + " " + b + " ");

        int c;

        for (int i = 2; i <= num; i++) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(c + " ");
        }
    }

    // fibonacci using recurrion

    static int fibrec(int a, int b, int n) {
        if (n == 0) {
            return 1;
        }

        int c = a + b;
        System.out.print(c + " ");

        return fibrec(b, c, n - 1);
    }

    // palindrome

    static boolean isPalindrome(int n) {
        int num = n;

        int reverse = 0;

        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            reverse = reverse * 10 + rem;
        }

        if (num == reverse) {
            return true;
        }

        return false;
    }

    // palindrome for string

    static boolean isPalin(String str) {
        String reverse = "";
        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            return true;
        }

        return false;
    }

}

// mosted asked Arrays questions

// MOSTED asked String questions

// How do you print duplicate characters from a string?

// How do you check if two strings are anagrams of each other?

// How do you check if a string contains only digits?

// How do you find duplicate characters in a given string?

// How do you count the number of vowels and consonants in a given string?

// How do you count the occurrence of a given character in a string?

// How do you print the first non-repeated character from a string?
