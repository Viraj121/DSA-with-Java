package practice.StringQuestions;
import java.util.Scanner;

// Password Validation
// A multi-national company is worried about its employees data. They tried many ways but everything
// failed. So, they decide to secure its employees data with a password combination. Your task is to write a program to validate a password. The password is of string form. You have to print 1 if entered password is valid else print O.
// A password is valid if it satisfies following conditions:
// Atleast 4 characters
// Atleast one numeric digit
// Atleast one capital letter
// Must not have space or slash
// Starting character must not be a number
// Note:
// Input String won't be empty

public class PasswordValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the password:");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static boolean isValidPassword(String password) {
        // Check minimum length
        if (password.length() < 4) {
            return false;
        }

        // Check for at least one numeric digit
        boolean hasNumeric = false;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasNumeric = true;
                break;
            }
        }
        if (!hasNumeric) {
            return false;
        }

        // Check for at least one capital letter
        boolean hasCapital = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasCapital = true;
                break;
            }
        }
        if (!hasCapital) {
            return false;
        }

        // Check for no space or slash
        if (password.contains(" ") || password.contains("/")) {
            return false;
        }

        // Check starting character is not a number
        if (Character.isDigit(password.charAt(0))) {
            return false;
        }

        // If all conditions are met, the password is valid
        return true;
    }
}
