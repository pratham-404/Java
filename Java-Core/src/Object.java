// Blueprint
class Calculator {
    int num1;
    int num2;

    // constructor: 1. a member method whih has same name as that of class 
    // 2. it will never return anything and is always public
    // 3. even if we dont create contructors for a class it by default has a default constructor i.e _class_name_()
    // use of default constructor => used to allocate memory to the object
    // we can have as many constructors as we want provided all have different input parameters(i.e constructor overloading)

    // default constructor
    public Calculator()
    {
        // default value of data members
        num1 = 0;
        num2 = 0;
    }

    // parametrized constructor
    // public Calculator (int a, int b)
    // {
    //     num1 = a;
    //     num2 = b;
    // }
    // parmetrized constructor with 'this' keyword
    public Calculator(int num1, int num2)
    {
        // this keyword(current object) is used to define the instance variables of object
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }
}

public class Object {
    // static is used with main because main is called without creating an object
    public static void main(String[] args) {

        // Calculator c1; // reference
        // c1 = new Calculator(); // creating object to reference

        // new is used to create object of a class and upon creation of object in java memory is allocated in heap and to get the size of object is given by constructor of class
        // every time we create an object it will call the class constructor(automatically)

        // here Calculator() is default constructor => inbuilt & only used to allocate memory in heap for the Object 
        Calculator c1 = new Calculator(); // created Calculator object to reference c1
        // an object knows something & does something
        // (data) (method)

        c1.num1 = 32;
        c1.num2 = 12;

        System.out.println(c1.add());

        // here we used parametrized constructor to create an object c2
        Calculator c2 = new Calculator(12,45);

        System.out.println(c2.add());
    }
}
