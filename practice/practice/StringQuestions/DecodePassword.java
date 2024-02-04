package practice.StringQuestions;

import java.util.Scanner;

public class DecodePassword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the password string:");
        String password = scanner.nextLine();

        System.out.println("Enter the length:");
        int length = scanner.nextInt();

        dividePassword(password, length);
        scanner.close();
    }

    public static void dividePassword(String password, int length) {
        int row = (int) Math.sqrt(length);
        int col = (int) Math.ceil((double) length / row);

        char[][] matrix = new char[row][col];

        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = password.charAt(index++);
            }
        }

        System.out.println("Output:");

        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                if (matrix[i][j] != 0) {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.print(" ");
        }
    }
}
