// Encapsulation => Binding data with methods
class stud {
    private String name;
    private int roll_no;

    // Getters & Setters => to access/update data members of Student Class
    // Why? => Data Safety(using log files, user authentication)
    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void display() {
        System.out.println("Roll no: " + roll_no + ", Name: " + name + ".");
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        stud s1 = new stud();

        s1.setName("Pratham");
        s1.setRoll_no(21);

        s1.display();
    }
}
