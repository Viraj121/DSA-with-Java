public class Onlydigits {
    public static void main(String[] args) {
        String input = "12345";
        // boolean containsOnlyDigits = input.matches("\\d+");

        boolean containsOnlyDigits=true;

        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                containsOnlyDigits = false;
                break;
            }
        }

        if (containsOnlyDigits) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains non-digit characters.");
        }
    }

}
