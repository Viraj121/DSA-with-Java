public class SpecialChar {
    public static void main(String[] args) {
        String str = "school#&&is love";

        String str3 = "school is love";

        String str2 = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str2);

        String str4 = str3.replace("l", "");
        System.out.println(str4);
    }
}
