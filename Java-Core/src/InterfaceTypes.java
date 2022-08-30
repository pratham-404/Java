// Interface Types:
    // 1. Normal Interface => more than one methods
    // 2. Single Abstract Method(SAM) Interface - from Java 8 (Functional Interface) 
            // We can use lambda expressions(adopted from Scala) using functional interfaces
    // 3. Marker Interface => Does not have any methods Eg. Serializable(Inbuilt marker interface) 

@FunctionalInterface // not compulsory but a GOOD Practice
interface XYZ{
    void display();
    // void show(); // ERROR: beacuse functional interface can only contain only single abstract method(SAM)
}


public class InterfaceTypes {
    public static void main(String[] args) {
        
        XYZ a = new XYZ() {
            public void display(){
                 System.out.println("Display: Anonymous Class");
            }
        };
        a.display();

        // lambda expression: works only with functional interface
        XYZ b = () -> System.out.println("Display: Lambda Expression");
        b.display();
    }    
}
