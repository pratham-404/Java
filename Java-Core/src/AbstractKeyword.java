
// abstract classes are very useful when we want to define similar methods (skeleton) for many classes
abstract class Human { // Abstract Class
    // only an abstract class can contain abstract methods
    public abstract void eat();

    // abstract classes can also contain non-abstract methods these can be overriden by child classes if required or by default run as specified in here
    public void walk() {
        System.out.println("Walk");
    }
}

class Man extends Human { // Concrete Class
    // if we inherit an abstract class then it is compulsory to define all the
    // abstract methods of that class
    public void eat() {
        System.out.println("Man Eating");
    }
}

class Num{
    // void printNum(Integer i){
    //     System.out.println(i);
    // }

    // void printNum(Double i){
    //     System.out.println(i);
    // }

    // now if we (ctrl+click) on Integer & Double we see that it extends from Number class
    //  so we can combinely write 
    void printNum(Number i){
        System.out.println(i);
    }
    // but if we (ctrl+click) on Number we observe that it is an abstract class
    // hence it was created so that all the wrapper classes extend it and create their own identity
}

public class AbstractKeyword {
    public static void main(String[] args) {
        // Human h = new Human(); // cannot create objects of abstract classes

        Man m = new Man();
        m.eat();
        m.walk();

        Num n = new Num();
        n.printNum(10);
        n.printNum(10.23);
    }
}