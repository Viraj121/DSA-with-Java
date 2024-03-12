package practice.StringQuestions;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.println("Enter the word");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // String str2 = reverseUsingStringBuilder(str);
        // System.out.println(str2);

        // sc.close();

        // char ch[] = str.toCharArray();

        // String reverse = "";

        // for (int i = ch.length - 1; i >= 0; i--) {
        //     reverse = reverse + ch[i];
        // }

        // System.out.print(reverse);


        //reverse in place code
        
        char[] c=str.toCharArray();

        reversee(c);

        System.out.println(new String(c));
    }

    // using string builder

    public static String reverseUsingStringBuilder(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder output = new StringBuilder(input).reverse();
        return output.toString();
    }

    // reverse a string in place

    public static void reversee(char[] c) {

        int left = 0;
        int right = c.length-1;

        while (left < right) {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            left++;
            right--;
        }
    }
}
