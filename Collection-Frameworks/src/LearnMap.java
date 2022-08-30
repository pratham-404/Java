// import java.util.HashMap;
// import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

// Map -> Stores Key-Value Pairs 

public class LearnMap {
    public static void main(String[] args) {
        // HashMap -> Unique Keys stored in random order
        // HashMap<Integer, String> mp = new HashMap<>(); // Hashing => O(1)

        // LinkedHashMap -> Unique Keys stored in order pairs are inserted in set
        // LinkedHashMap<Integer, String> mp = new LinkedHashMap<>(); // Linked List

        // TreeMap -> Unique Keys stored in sorted order
        TreeMap<Integer, String> mp = new TreeMap<>(); // BST => O(log(n))

        // put(k,v)[adds key-value pair to map], putIfAbsent(k,v)[adds key-value pair to map if KEY it is not already present in map]
        // containsKey(k), containsValue(v),[returns bool if key/value is present in a map]

        System.out.println("Map isEmpty: " + mp.isEmpty());

        mp.put(1, "Pratham");
        mp.put(2, "Kunal");
        // mp.put(1, "Kunal"); // overrides value of key-1(default behaviour)

        // if (!mp.containsKey(1)) {
        // mp.put(1, "Kunal");
        // }

        mp.putIfAbsent(1, "Kunal");

        mp.put(3, "Siya");

        System.out.println(mp);

        // Iterating thorugh Map i.e entrySet()
        for (Map.Entry<Integer, String> me : mp.entrySet()) {
            System.out.println(me);
            System.out.println("Key:" + me.getKey() + ", Value: " + me.getValue());
        }

        // Iterating through Keys i.e keySet()
        for (Integer i : mp.keySet()) {
            System.out.println(i);
        }

        // Iterating through Values i.e values()
        for (String s : mp.values()) {
            System.out.println(s);
        }

        System.out.println(mp);
        mp.remove(1);
        System.out.println(mp);
        mp.remove(3, "Kunal");
        System.out.println(mp);

        System.out.println("Map isEmpty: " + mp.isEmpty());
        mp.clear();
        System.out.println("Map isEmpty: " + mp.isEmpty());
    }
}
