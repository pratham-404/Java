import java.util.ArrayList;
import java.util.Collection;

public class Collections_Generics {
    public static void main(String[] args) {

        // Collection => Java 1.2, Generics => 1.5
        
        // Collection(Inteface) --> List(Interface) --> Arraylist(Class)
        Collection arr1 = new ArrayList(); // by default we can have any type of Objects inside a collection
        arr1.add(12);
        arr1.add("Pratham");
        arr1.add(102.23);
        
        System.out.println(arr1);

        Collection<Integer> arr2 = new ArrayList<>(); // Integer ArrayList()
        arr2.add(12);
        // arr2.add("Hello"); // ERROR
        arr2.add(52);

        System.out.println(arr2);
    }    
}
