// 1. import --> java.sql.*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

class std{
    public int reg;
    public String name;

    public std(int reg, String name) {
        this.reg = reg;
        this.name = name;
    }
}

class update {
    public static void main(String[] args) throws Exception {
        try {
            // 2. load and register the driver ---> com.mysql.cj.jdbc.Driver
            // Class.forName("classname"); is used to load ONLY static block of a class without creating an object of the class // IMP
            // Class.forname("classname").newInstance(); create a new object of the class i.e loads BOTH static & non-static blocks of class
            // i.e Class.forname("com.mysql.cj.jdbc.Driver") === DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "root";

            // 3. create connection
            Connection con = DriverManager.getConnection(url, username, password);

            // 4. create a statement
            std s1 = new std(4, "Nirbahy");
            std s2 = new std(5, "Tushar");
            
            // 5. execute the query

            // INSERTING using Statement
            Statement st1 = con.createStatement();
            String query1 = "INSERT INTO student (reg_id, sname) VALUES (" + s1.reg + ", \"" + s1.name + "\");";
            int c1 = st1.executeUpdate(query1);
            System.out.println("Rows Affected: " + c1);

            // INSERTING using prepared statements
            String query2 = "INSERT INTO student (reg_id, sname) VALUES (?,?);";
            PreparedStatement st2 = con.prepareStatement(query2);
            st2.setInt(1, s2.reg);
            st2.setString(2, s2.name);
            int c2 = st2.executeUpdate();
            System.out.println("Rows Affected: " + c2);
            
            Statement st = con.createStatement();
            String query3 = "SELECT * FROM student";
            ResultSet rs = st.executeQuery(query3);

            // 6. process the results
            while (rs.next()) {
                System.out.println("Reg. No: " + rs.getInt("reg_id") + ", Name: " + rs.getString("sname"));
            }

            // 7. close
            st.close();
            con.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
