import java.util.HashMap;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
       
        String str="GeeksrGeeks";

        HashMap<Character,Integer> count=new HashMap<>();

        for(char ch:str.toCharArray()){
            if (count.containsKey(ch)) {
                count.put(ch,count.get(ch)+1 );
            }else{
                count.put(ch,1);
            }
        }

        for(char ch:str.toCharArray()){
            if (count.get(ch)==1) {
                System.out.println("first non repeating character is: "+ch);
                break;
            }
        }

    }
}
