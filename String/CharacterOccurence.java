// public class CharacterOccurence {
//     public static void main(String[] args) {
//         String str = "Hello, world!";
//         char targetChar = 'l';
//         int count = 0;

//         for (char ch : str.toCharArray()) {
//             if (ch == targetChar) {
//                 count++;
//             }
//         }

//         System.out.println("The number of occurrences of '" + targetChar + "' is: " + count);
//     }
// }


//using hashmap

import java.util.HashMap;

public class CharacterOccurence {
    public static void main(String[] args) {
        String str = "Hello, world!";
        char targetChar = 'l';
        HashMap<Character, Integer> charCount=new HashMap<>();

        for (char ch: str.toCharArray()){
            if (!charCount.containsKey(ch)) {
                charCount.put(ch, 0);
            }
            charCount.put(ch, charCount.get(ch)+1);
        }
        System.out.println(charCount.get(targetChar));
    }
}
