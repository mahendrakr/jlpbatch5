import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
   public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  final String url = "jdbc:mysql://localhost:3306/homework";
	  Connection con = DriverManager.getConnection(url,"root","Pr@tiksha123");
	  String query="create table mystudent(sid int,sname varchar(50),city varchar(50))";
	  Statement st = con.createStatement();
	  boolean result = st.execute(query);
	  if(result) {
		  System.out.println("table has been created");
	  }
	  else {
		  System.out.println("something went wrong");
	  }
	  con.close();
	  st.close();
   }
}