// package basic;

import java.util.Scanner;

public class LargeOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2 number daal");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        if (num > num2) {
            System.out.println(num + " bada bhai");
        } else {
            System.out.println(num2 + " bada bhai");
        }
        sc.close();
    }

}
