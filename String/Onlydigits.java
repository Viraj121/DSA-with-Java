public class Onlydigits {
    public static void main(String[] args) {
        String input = "15";
        // boolean containsOnlyDigits = input.matches("\\d+");

        boolean containsDigit=true;

        for (int i = 0; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))){
                containsDigit=false;
                break;
            }
        }

        if (containsDigit) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
