import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HomeWork {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// Step 1:Load the Driver class.
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   // Step 2: Establish the connection.
		   final String url = "jdbc:mysql://localhost:3306/homework";
		   Connection con = DriverManager.getConnection(url, "root", "Pr@tiksha123");
		   // Step 3: Prepare the SQL statement.
	  // String sql = "insert into student values(101,'Sharad','Hoshangabad'),(102,'sachin','mumbai'),(103,'sourabh','indore'),(104,'virat','delhi'),(105,'rohit','bhopal')";				         
		  // String sql = "update student set name='Rahul' where id=104";
		   String sql = "delete from student where id=105";
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
			   con.close();
			   st.close();
			   
	}
}