import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    public int roll_no;
    public String name;

    public Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", roll_no=" + roll_no + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + roll_no;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (roll_no != other.roll_no)
            return false;
        return true;
    }

    @Override
    public int compareTo(Student o) {
        // -ve => o > this, 0 => o == this, +ve => o < this
        return this.roll_no - o.roll_no;
    }

}

public class StudentSet {
    public static void main(String[] args) {
        List<Student> ss = new ArrayList<>();
        // LinkedHashSet<Student> ss = new LinkedHashSet<>();

        ss.add(new Student(3, "Rushil"));
        ss.add(new Student(1, "Pratham"));
        ss.add(new Student(1, "Chirag"));
        ss.add(new Student(2, "Chirag"));
        ss.add(new Student(2, "Chirag"));

        System.out.println(ss);
        Collections.sort(ss);
        System.out.println(ss);

        // Collections.sort(ss,new Comparator<Student>() {
        // @Override
        // public int compare(Student o1, Student o2){
        // return o1.name.compareTo(o2.name);
        // }
        // });

        Collections.sort(ss, (o1, o2) -> o1.name.compareTo(o2.name)); // using lambda functions

        System.out.println(ss);

        Student s = new Student(1, "hi");

        System.out.println("isEquals: " + s.equals(new Student(1, "hello")));
        System.out.println("isEquals: " + s.equals(new Student(2, "hello")));
        System.out.println("isEquals: " + s.equals(new Student(2, "hi")));
        System.out.println("isEquals: " + s.equals(new Student(1, "hi")));
    }
}
