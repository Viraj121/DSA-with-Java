import java.util.*;

public class Hashing {
    public static void main(String[] args) {

        // Creation
        HashMap<String, Integer> map = new HashMap<>();

        // insertion

        map.put("india", 0);
        map.put("china", 12);
        map.put("lolne", 90);

        // System.out.println(map);

        map.put("india", 100);
        // System.out.println(map);

        // Searching

        if (map.containsKey("india")) {
            System.out.println("key present");

        } else {
            System.out.println("key not present");
        }

        System.out.println(map.get("china"));

        System.out.println(map.get("lolu"));

        // iteration through entryset.

        for(Map.Entry<String,Integer> e:map.entrySet()){
        System.out.print(e.getKey()+" ");
        System.out.print(e.getValue());
        System.out.println();
        }

        // iteration through keyset
        
        // Set<String> keys=map.keySet();
        // for(String key:keys){
        // System.out.println(key+" "+map.get(key));
        // }

    }
}
