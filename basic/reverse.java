// package basic;

import java.util.Scanner;

class reverse {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String s = "";

        while (number != 0) {
            int pick_last = number % 10;
            s = s + Integer.toString(pick_last);
            number = number / 10;

        }
        System.out.println();

        sc.close();
    }
}
