// 1. import --> java.sql.*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class fetch {
    public static void main(String[] args) throws Exception {
        try {
            // 2. load and register the driver ---> com.mysql.cj.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "root";

            // 3. create connection
            Connection con = DriverManager.getConnection(url, username, password);

            // 4. create a statement
            Statement st = con.createStatement();
            
            // 5. execute the query
            String query = "SELECT * FROM student";
            ResultSet rs = st.executeQuery(query);

            // 6. process the results
            while (rs.next()) {
                System.out.println("Reg. No: " + rs.getInt("reg_id") + ", Name: " + rs.getString("sname"));
            }

            //  7. close
            st.close();
            con.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
