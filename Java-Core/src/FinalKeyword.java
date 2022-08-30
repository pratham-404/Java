// Final Keyword => variables, methods & classes

// variable
class A {
    // final int DAY = 10; // constant(Convention: All Caps)
    final int DAY;

    public A() {
        // DAY = 11; // cannot modify final variables if once initialized
        DAY = 10;
    }
}

// method
class B {
    final public void show() {
        System.out.println("Show in B");
    }
}

class C extends B {
    // we cannot override a final method
    // public void show(){
    // System.out.println("Show in C");
    // }
}

// class
final class D {
    public void show() {
        System.out.println("Show in D");
    }
}

// we cannot inherit from a final class
// class E extends D{

// }
public class FinalKeyword {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.DAY);

        C obj2 = new C();
        obj2.show();

        D obj3 = new D();
        obj3.show();
    }
}