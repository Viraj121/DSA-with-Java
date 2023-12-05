import java.util.HashMap;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
       
        String str="GeeksforGeeks";

        HashMap<Character,Integer> count=new HashMap<>();

        for(char ch:str.toCharArray()){
            if (!count.containsKey(ch)) {
                count.put(ch, 0);
            }
            count.put(ch, count.get(ch)+1);
        }

        for(char ch:str.toCharArray()){
            if (count.get(ch)==1) {
                System.out.println("first non repeating character is: "+ch);
                break;
            }
        }

    }
}
