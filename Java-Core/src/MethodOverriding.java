class Parent {
    public void display() {
        System.out.println("Parent: Display");
    }
}

class Child extends Parent {
    // method display() of Parent Class is overriden by Child Class
    @Override // no afffect on code but a GOOD Practice
    public void display() {
        // super.display(); // accessing display() method of Parent Class
        System.out.println("Child: Display");
    }
}

class GrandChild extends Child {
    @Override
    public void display() {
        System.out.println("GrandChild: Display");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Parent p = new Parent();
        Child c = new Child();

        p.display();
        c.display();

        System.out.println("===============================");

        Parent pr = new Child(); // Runtime polymorphism
        pr.display();

        pr = new GrandChild();
        pr.display(); // Dynamic Method Dispatch
    }
}