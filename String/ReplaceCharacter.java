class ReplaceCharacter {
    public static void main(String[] args) {
        String str1 = "viraj";

        // String str2 = str1.replace("a", "kok");

        // System.out.println(str2);

        StringBuilder str2 = new StringBuilder();

        char charRemove = 'a';
        for (char ch : str1.toCharArray()) {
            if (ch != charRemove) {
                str2.append(ch);
            }
        }

        System.out.println(str2.toString());
    }

}