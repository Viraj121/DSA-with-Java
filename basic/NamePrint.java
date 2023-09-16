// package basic;

import java.util.Scanner;

public class NamePrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("what's your name");
       String name=sc.nextLine();
        System.out.println("Hello "+name);
        sc.close();
    }
}
