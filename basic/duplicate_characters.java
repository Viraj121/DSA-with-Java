// public class duplicate_characters {
//     public static void main(String[] args) {
//         String str="bknonb";
//         char[] ch=str.toCharArray();
//         int count=0;

//         for (int i = 0; i <ch.length; i++) {
//             for (int j = i+1; j <ch.length; j++) {
//                 if(ch[i]==ch[j]){
//                     System.out.println("duplicate element is "+ch[j]);
//                     count++;
//                 }
//             }
//         }
//         System.out.println("duplicate "+count);
//     }
// }


import java.util.HashMap;
import java.util.Map;

public class duplicate_characters {
    public static void main(String[] args) {
        String input = "programming";
        findDuplicateCharacters(input);
    }

    public static void findDuplicateCharacters(String str) {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to an array of characters
        char[] chars = str.toCharArray();

        // Iterate through the characters and count their occurrences
        for (char ch : chars) {
            if (charCountMap.containsKey(ch)) {
                // If the character is already in the map, increment its count
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // If the character is not in the map, add it with a count of 1
                charCountMap.put(ch, 1);
            }
        }

        // Print characters with counts greater than 1 (duplicates)
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("duplicate element "+entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
