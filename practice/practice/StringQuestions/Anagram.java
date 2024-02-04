package practice.StringQuestions;

import java.util.Arrays;

class Anagram{
    public static void main(String[] args) {
        String str1="Viraj";
        String str2="viraj";

        if (isAnagram(str1,str2)) {
            System.out.println("it is anagram");
        }else{
            System.out.println("its is not");
        }
    }

    static boolean isAnagram(String str1,String str2){
        boolean status=true;

        if (str1.length()!=str2.length()) {
            status=false;
        }else{
            char sh[]=str1.toLowerCase().toCharArray();
            char ch[]=str2.toLowerCase().toCharArray();
            Arrays.sort(sh);
            Arrays.sort(ch);
            status = Arrays.equals(ch, sh);
        }
        return status;
    }
}