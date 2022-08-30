
// difference between abstract class & interfaces is that we can extend only one class(since java doesn't support multiple inheritance) but can implement many interfaces
// secondly, in abstract classes we have both abstract & non-abstract methods but in interfaces we can only have abstract methods hence all methods in interfaces are 'public abstract'
// we can create reference of interface but cannot create object of it. This is similar to that of abstract classes
// given a choice always go for interfaces as it provides with more flexibility and division of work among peeps

// abstract class Writer {
interface Writer {
    // abstract public void write();
    void write(); // by default: 'public abstract' in interface
}

// class Pen extends Writer {
class Pen implements Writer {
    public void write() {
        System.out.println("Writing with Pen");
    }
}

// class Pencil extends Writer {
class Pencil implements Writer {
    public void write() {
        System.out.println("Writing with Pencil");
    }
}

class Kit {
    // void write(Pen p){
    // p.write();
    // }

    // void write(Pencil p){
    // p.write();
    // }
    
    // solution to write different methods doing the same thing 
    void write(Writer w) {
        w.write();
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Kit k = new Kit();

        // Pen p1 = new Pen();
        Writer p1 = new Pen(); // SAME

        // Pencil p2 = new Pencil();
        Writer p2 = new Pencil(); // SAME

        k.write(p1);
        k.write(p2);
    }
}
