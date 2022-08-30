import java.util.ArrayList; // ArrayList
// import java.util.LinkedList; // LinkedList
import java.util.Iterator; // Iterator

public class LearnArrayList {
    public static void main(String[] args) throws Exception {
        // For fixed size arrays we should use arrays in java ==> fast
        // For variable size array we should use ArrayList Class from List Interface

        // LinkedList<Integer> arrList = new LinkedList<>();
        ArrayList<Integer> arrList = new ArrayList<>();
        // Empty array is created
        // when first element is added default size = 10
        // further it increases size from n --> n + n/2 + 1, i.e 10 -> 16 -> 25 -> 38 ->
        // ...

        // adding elements to the end of arraylist => O(1)
        arrList.add(12);
        arrList.add(16);
        arrList.add(96);
        System.out.println(arrList);
        arrList.add(56);
        System.out.println(arrList);
        // adding elements to a certain index(0-based) in an arraylist= => O(n)
        arrList.add(1, 34);
        System.out.println(arrList);

        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.add(29);
        newList.add(54);

        // adding all elements of an arraylist in the end of arraylist => O(m)
        arrList.addAll(newList);
        System.out.println(arrList);

        // adding all the elements of an arraylist at certain index(0-based) => =>
        // O(n+m)
        arrList.addAll(1, newList);
        System.out.println(arrList);

        // accessing elements at an index(0-based) of an arraylist => O(1)
        System.out.println(arrList.get(1));

        // setting/updating value at index(0-based) in an arraylist => O(1)
        arrList.set(0, 11);

        // checking if an element is present in an arraylist or not => O(n)
        System.out.println(arrList.contains(50)); // returns true/false

        // Iterating through Arraylist
        // 1. for loop
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println("For Loop " + i);
        }
        // 2. for-each loop
        for (Integer i : arrList) {
            System.out.println("For-Each Loop " + i);
        }
        // 3. Iterator
        Iterator<Integer> it = arrList.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator " + it.next());
        }

        // removing element at given index(0-based) from an arraylist => O(n)
        System.out.println(arrList);
        arrList.remove(1);
        System.out.println(arrList);

        // removing an element from arraylist => O(n)
        // if more than one elements exists then the element which comes
        // first(index-wise) is removed
        arrList.remove(Integer.valueOf(54));
        System.out.println(arrList);

        // removing all elements of a list
        arrList.clear();
        System.out.println(arrList);
    }
}