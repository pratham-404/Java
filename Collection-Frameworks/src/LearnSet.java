// import java.util.HashSet;
// import java.util.LinkedHashSet;
import java.util.TreeSet;

// Set -> Dupllicate elements are not stored (i.e stores unique elements)

public class LearnSet {
    public static void main(String[] args) {

        // HashSet -> Stores unique elements in random order
        // HashSet<Integer> s = new HashSet<>(); // Hashing => O(1)

        // LinkedHashSet -> Stores unique elements in order elemnts are inserted in set
        // LinkedHashSet<Integer> s = new LinkedHashSet<>(); // Linked List

        // TreeSet -> Stores unique elements in sorted order(acending)
        TreeSet<Integer> s = new TreeSet<>(); // BST => O(log(n))

        // add(e), remove(e), contains(e), isEmpty(), size(), clear()

        System.out.println("Set is Empty: " + s.isEmpty());

        s.add(12);
        s.add(21);
        s.add(19);
        s.add(14);
        s.add(19);

        System.out.println(s);
        s.remove(21);
        System.out.println(s);

        System.out.println("Contains 19: " + s.contains(19));
        System.out.println("Contains 91: " + s.contains(91));

        System.out.println("Set Size: " + s.size());
        System.out.println("Set is Empty: " + s.isEmpty());
        
        s.clear();
        System.out.println("Set is Empty: " + s.isEmpty());
    }
}
