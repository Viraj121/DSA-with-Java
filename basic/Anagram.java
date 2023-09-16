import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String s1, String s2) {

        boolean status;
        if (s1.length() != s2.length())
            status = false;
        else {
            char[] a1 = s1.toLowerCase().toCharArray();
            char[] a2 = s2.toLowerCase().toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            status = Arrays.equals(a1, a2);
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two String :");
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();
        boolean status = isAnagram(s1, s2);
        if (status)
            System.out.println(s1 + " and " + s2 + " are Anagram");
        else
            System.out.println(s1 + " and " + s2 + " are not Anagram");
    }
}
