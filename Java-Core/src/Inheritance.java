
class Base { // Super/Parent/Base Class
    int a;

    public Base(int a) {
        this.a = a;
    }

    public void baseMethod() {
        System.out.println("Base Method");
    }
}

// single inheritance
class Derived extends Base { // Sub/Child/Derived Class
    int b;

    // if derived class constructor does not access base class using super(_parameters_) then after object creation of derived class base class default-constructor(i.e super()) is called followed by derived class constructor
    public Derived(int a, int b) {
        super(a);
        this.b = b;
    }

    public void derivedMethod() {
        System.out.println("Derived Method");
    }
}

// multilevel inheritance
class DerivedChild extends Derived {
    int c;

    public DerivedChild(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public void derivedChildMethod() {
        System.out.println("Derived Child Method");
    }
}

// isA & hasA relationship
// isA: inheritance(dog is an animal), hasA: creating object of different classes

// java does not support multiple inheritance because it causes ambiguity
// suppose it did support multiple inheritance and derived class extends from 2 classes A,B and suppose both of these class contains show() method now, upon calling show() on a derived class object it will lead to an ambiguity in selecting show() method from class A or from class B this auses 

public class Inheritance {
    public static void main(String[] args) {

        Base b1 = new Base(2);
        System.out.println("b1 Object => a:" + b1.a);
        b1.baseMethod();
        System.out.println("========================================");

        Derived d1 = new Derived(3, 4);
        System.out.println("d1 Object => a:" + d1.a + ", b:" + d1.b);
        d1.baseMethod();
        d1.derivedMethod();
        System.out.println("========================================");

        DerivedChild dc1 = new DerivedChild(2, 6, 1);
        System.out.println("dc1 Object => a:" + dc1.a + ", b:" + dc1.b + ", c:" + dc1.c);
        dc1.baseMethod();
        dc1.derivedMethod();
        dc1.derivedChildMethod();
        System.out.println("========================================");

    }
}
