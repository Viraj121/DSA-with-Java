class stringbuilder1 {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("viraj");

        // System.out.println(sb);

        // // char at index 0
        // System.out.println(sb.charAt(0));

        // // set char at index 0
        // sb.setCharAt(0, 'N');
        // System.out.println(sb);

        // sb.insert(0, 'C');
        // System.out.println(sb);

        // // delete
        // sb.delete(2, 3);
        // System.out.println(sb);

        // sb.append("k");
        // sb.append("s");
        // sb.append("k");
        // System.out.println(sb);

        // System.out.println(sb.length());

        // reverse a string using string builder

        StringBuilder sb = new StringBuilder("king");

        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);

    }
}
