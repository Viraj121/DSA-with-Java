package practice.StringQuestions;

import java.util.Scanner;

public class LargeOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2 number daalo bhaiya");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is big boy");
        } else {
            System.out.println(b + " is big boy");
        }
        sc.close();
    }
}
