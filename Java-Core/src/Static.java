class Emp {
    int eid;
    int salary;
    // static members are properties of class rather than being properties of object
    static String ceo; // does not go into heap => goes into class loader memory

    public Emp() { // executed when we create an object
        eid = 1;
        salary = 1000;

        // ceo = "Pratham";
        // Now when every object is created it will allocate memory in heap to ceo as "Pratham" => Unncessary exploitation of memory
        // hence to initialize static members we use static block to allocate memory only once in class loader memory

        System.out.println("Constructor called");
    }
    
    // static block allocates mempry only once in the class loader memory
    static{ // executed when we load a class => doesnt matter with no. of objects, class will load only once
        ceo = "Pratham";
        System.out.println("Static-Block loaded");
    }
    // if we have multiple static blocks then the static blocks are loaded in a sequence from top to bottom
    
    public void showEmp() {
        System.out.println("Eid: " + eid + ", Salary: " + salary + ", CEO: " + ceo);
    }
}

public class Static {
    // int i = 0; // cannot make a static reference to a non static field
    static int i = 0;
    public static void main(String[] args) {
        // we can only access static variables inside a static method
        i = 9;

        Emp pratham = new Emp();
        pratham.eid = 1;
        pratham.salary = 1000;
        pratham.ceo = "Satya";

        pratham.showEmp();

        Emp kunal = new Emp();
        kunal.eid = 2;
        kunal.salary = 1200;

        kunal.showEmp();

        kunal.ceo = "Sundar";
        pratham.showEmp();
        kunal.showEmp();

        // we can even access/update static members from the classname itself
        // therfore, to access static variables we dont need object
        Emp.ceo = "Ratan";
        pratham.showEmp();
        kunal.showEmp();
    }
}
