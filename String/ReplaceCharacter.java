class ReplaceCharacter{
    public static void main(String[] args) {
        String str1="viraj";

        String str2=str1.replace("a", "");
        System.out.println(str2);


        //using for loop

        StringBuilder str3=new StringBuilder();
        char charToRemove='a';

        for (char ch : str1.toCharArray()) {
            if(ch != charToRemove){
                str3.append(ch);
            }
        }
        
        System.out.println(str3.toString());
    }
}