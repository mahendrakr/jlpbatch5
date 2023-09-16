import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JbdcDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 // Step 1:Load the Driver class.
		  // Class.forName("com.mysql.jdbc.Driver");
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   // Step 2: Establish the connection.
		   final String url = "jdbc:mysql://localhost:3306/mydb";
		    Connection con = DriverManager.getConnection(url, "root", "Pr@tiksha123");
		   // Step 3: Prepare the SQL statement.
		  // String sql = "insert into student values(106,'pratiksha','bhopal','pratiksha@gmail.com',1234567890,'F')"; 
		    String sql = "delete from student where id=103";
		   // Step 4: Create JDBC statement
		   Statement st = con.createStatement();
		   // Step 5: Submit the SQL statement to Database using JDBC statement.
		   int x = st.executeUpdate(sql);
		   // Step 6: Process the result.
		   if (x == 1) {
		    System.out.println("Record Inserted");
		   } else {
		    System.out.println("Record Not Inserted");
		   }
		   // Step 7: Close all the resources.
		   con.close();
		   st.close();
		   
	}

}
