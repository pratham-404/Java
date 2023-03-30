import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

class Student {
    int reg_no;
    String name;

    public Student() {
    }

    public Student(int reg_no, String name) {
        this.reg_no = reg_no;
        this.name = name;
    }
}

class DaoStudent {
    Connection con = null;
    Statement cst = null;
    PreparedStatement pst = null;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Student getStudent(int r) {
        Student s = new Student();
        s.reg_no = r;
        connect();
        try {
            cst = con.createStatement();
            String query = "SELECT * FROM student WHERE reg_id = " + r + ";";
            ResultSet rs = cst.executeQuery(query);

            rs.next();
            s.name = rs.getString("sname");
            
            cst.close();
            con.close();
            return s;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void insertStudent(Student s) {
        try {
            connect();
            String query = "INSERT INTO student(reg_id, sname) VALUES (?,?)";

            pst = con.prepareStatement(query);
            pst.setInt(1, s.reg_no);
            pst.setString(2, s.name);

            int c = pst.executeUpdate();
            System.out.println("Rows Affected: " + c);

            pst.close();    
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getAllStudents() {
        connect();
        try {
            cst = con.createStatement();
            String query = "SELECT * FROM student";
            ResultSet rs = cst.executeQuery(query);

            while (rs.next()) {
                System.out.println("Reg. Id: " + rs.getInt("reg_id") + ", Name: " + rs.getString("sname"));
            }

            rs.close();
            cst.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class jdbc {
    public static void main(String[] args) {
        DaoStudent d = new DaoStudent();

        Student s = d.getStudent(5);
        System.out.println("Reg, No: " + s.reg_no + ", Name: " + s.name);

        System.out.println("Before: ");
        d.getAllStudents();

        s = new Student(31, "Mithilesh");
        d.insertStudent(s);

        System.out.println("After: ");
        d.getAllStudents();
    }
}