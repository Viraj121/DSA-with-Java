package practice.StringQuestions;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{";
        System.out.println(valid(s));

    }

    static boolean valid(String str) {

        char[] c = str.toCharArray();
        Stack<Character> st = new Stack<>();

        for (char ch : c) {
            if (ch == '{' || ch == '[' || ch == '(') {
                st.add(ch);
            }else{

                if (st.empty()) {
                    return false;
                }

                if (ch=='}' && st.peek()!='{' )return false;
                if (ch==']' && st.peek()!='[' )return false;
                if (ch==')' && st.peek()!='(' )return false;
                st.pop();
            }

        }

        return st.isEmpty();
    }
}
