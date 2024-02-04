// //find all duplicate elements and print them

public class duplicate_characters {
    public static void main(String[] args) {
        String str = "VirajisViraj";

        char[] ch = str.toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    System.out.println("duplicate element is " + ch[j]);
                    count++;
                }
            }
        }

        //TOTAL DUPLICATE
        System.out.println("duplicate " + count);
    }
}

// Remove duplicate element using indexOf method of string class

// class duplicate_characters {
//     public static void main(String[] args) {
//         String str = "VirajisViraj";

//         StringBuilder sb = new StringBuilder();

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             int indx = str.indexOf(ch, i + 1);
//             if (indx == -1) {
//                 sb.append(ch);
//             }
//         }
//         System.out.println(sb);


//         //new approach
//         char[] arr=str.toCharArray();
//         StringBuilder sb1=new StringBuilder();
//         for (int i = 0; i < arr.length; i++) {
//             boolean repeated=false;
//             for (int j = i+1; j < arr.length; j++) {
//                 if(arr[i]==arr[j]){
//                     repeated=true;
//                     break;
//                 }
//             }
//             if(!repeated){
//                 sb1.append(arr[i]);
//             }
//         }
//         System.out.println(sb1);


//     }
// }



// import java.util.HashMap;
// import java.util.Map;

// public class duplicate_characters {
// public static void main(String[] args) {
// String input = "programming";
// findDuplicateCharacters(input);
// }

// public static void findDuplicateCharacters(String str) {
// // Create a HashMap to store character counts
// Map<Character, Integer> charCountMap = new HashMap<>();

// // Convert the string to an array of characters
// char[] chars = str.toCharArray();

// // Iterate through the characters and count their occurrences
// for (char ch : chars) {
// if (charCountMap.containsKey(ch)) {
// // If the character is already in the map, increment its count
// charCountMap.put(ch, charCountMap.get(ch) + 1);
// } else {
// // If the character is not in the map, add it with a count of 1
// charCountMap.put(ch, 1);
// }
// }

// // Print characters with counts greater than 1 (duplicates)
// for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
// if (entry.getValue() > 1) {
// System.out.println("duplicate element "+entry.getKey() + ": " +
// entry.getValue());
// }
// }
// }
// }
