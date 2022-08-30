class Outer { // classfile_name => Outer.class
    // member variable/field
    int a;

    // member method
    public void show() {
        System.out.println(a);
    }

    // Inner classes: 1. Member Class, 2. Static Class, 3. Anonymous Class

    // member class i.e nested class
    class Inner { // classfile.name => Outer$Inner.class
        public void showInner() {
            System.out.println("Inner Class");
        }
    }

    // static member class
    static class StaticInner {
        public void showStaticInner() {
            System.out.println("Static Inner Class");
        }
    }

    // anonymous class
    
}

public class InnerClass { // classfile_name => InnerClass.class
    // variables, methods, classes
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.a = 10;
        obj.show();

        // IMP => Outer.Inner & obj.new
        Outer.Inner in = obj.new Inner(); // constructor of nested class
        in.showInner();

        // IMP => Outer.StaticInner & Outer.StaticInner
        Outer.StaticInner stIn = new Outer.StaticInner(); // constructor of static inner class
        stIn.showStaticInner();
    }
}