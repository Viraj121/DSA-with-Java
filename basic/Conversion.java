

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {

        // // float rupees;
        // float dollars;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter dollar:");

        float dollar = in.nextLong();

        // float dollars = rupees / 81;

        float rupees = dollar*81;

        System.out.println(rupees + " Rupees");
        in.close();
    }
}
