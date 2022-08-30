
// Abstract Class => Methods defined & declared
// Interface => Only Methods defined --------------- Till Java 1.7
//           => Methods defined & declared --------- From Java 1.8 & Above

@FunctionalInterface // => this works here because a Functional Interface as we have only one abstract method & hence it can contain as many non-abstract methods defined in it
interface Demo {
    void Display1();

    // we need to use default keyword to declare method inside an interface
    default void Display2() {
        System.out.println("Inteface Demo: Display 2");
    }

    // from java 1.8 we can also define static methods in interfaces hence can be called directly by _interface_name_._method_name()
    static void Display3(){
        System.out.println("Interface Demo: Display 3");
    }

    // we can even define variables(declare, if only initialized => ERROR) in an interface but by default the variables are made final(i.e cannot be modified)
    // int num; // ERROR
    int num = 10;
}

class DemoClass implements Demo {
    public void Display1() {
        System.out.println("Class DemoClass: Display 1");
    }

    // default methods by interfaces can be overriden by the class that implement
    // the interface
    public void Display2() {
        System.out.println("Class DemoClass: Display 2");
    }
}

// In case we implement multiple interfaces in a class and if they have duplicate default methods than ambiguity might arise
// In such cases 
    // 1. we again define that method in the class
    // 2. we can overide and call method from one of the interfaces

interface Demo2 {
    default void Display2() {
        System.out.println("Interface Demo2: Display2");
    }
}

class DemoClass2 implements Demo, Demo2 {
    // define abstract methods
    public void Display1() {
        System.out.println("Class DemoClass2: Display 1");
    }

    // define duplicate methods in the implemented interfaces
    // Case 1:
    // public void Display2() {
    //     System.out.println("Class DemoClass2: Display 2");
    // }

    // Case 2:
    @Override
    public void Display2(){
        Demo.super.Display2();
        // Demo2.super.Display2();
    }
}

public class DefaultInterface {
    public static void main(String[] args) {
        Demo dc = new DemoClass();
        // DemoClass dc = new DemoClass();

        dc.Display1();
        dc.Display2();

        // calling static member from an interface
        Demo.Display3();

        // Demo.num = 12; // Final field cannot be updated
    }
}
