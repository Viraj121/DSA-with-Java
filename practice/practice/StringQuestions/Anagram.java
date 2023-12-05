package practice.StringQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("enter two strings");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        sc.close();

        boolean status = findstatus(str1, str2);

        if (status) {
            System.out.println("anagram");
        } else {
            System.out.println("not");
        }
    }

    public static boolean findstatus(String str, String str2) {
        boolean status;

        if (str.length() != str2.length()) {
            status= false;
        } else {
            char ch[] = str.toLowerCase().toCharArray();
            char ch1[] = str2.toLowerCase().toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ch1);

            status=Arrays.equals(ch, ch1);
        }
        return status;
    }
}
