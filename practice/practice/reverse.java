package practice;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.println("Enter the word");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        char ch[]=str.toCharArray();

        String reverse ="";

        for (int i = ch.length-1; i >=0; i--) {
            reverse=reverse+ch[i];
        }

        System.out.print(reverse);
    }
}
