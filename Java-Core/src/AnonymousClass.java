
class X {
    public void display() {
        System.out.println("Class X");
    }
}

interface I {
    void show();
}

public class AnonymousClass {
    public static void main(String[] args) {
        X a = new X();
        a.display();

        // Anonymous Class: used when we want to use ceratin methods only once (saves
        // memory)
        X b = new X() {
            public void display() {
                System.out.println("Anonymous Class X");
            }
        };
        b.display();

        // Interface with Anonymous Classes
        I c = new I() {
            public void show() {
                System.out.println("Interface from Anonymous Class");
            }
        };
        c.show();
    }
}
