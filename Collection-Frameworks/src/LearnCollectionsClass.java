import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LearnCollectionsClass {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(23);
        arr.add(36);
        arr.add(72);
        arr.add(43);
        arr.add(12);
        arr.add(29);

        System.out.println(arr);

        // Min-Element
        System.out.println(Collections.min(arr));

        // Max-Element
        System.out.println(Collections.max(arr));

        // Frequency of an Element
        System.out.println(Collections.frequency(arr, 12));

        // Sort(Ascending)
        Collections.sort(arr);
        System.out.println(arr);

        // Sort(Decending)
        Collections.sort(arr, Comparator.reverseOrder());
        System.out.println(arr);
    }
}