import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  final String url = "jdbc:mysql://localhost:3306/homework";
		  Connection con = DriverManager.getConnection(url,"root","Pr@tiksha123");
		  String query="select * from mystudent ";
		  Statement st = con.createStatement();
		  boolean result = st.execute(query);
		  if(result) {
			  System.out.println("record has been selected");
		  }
		  else {
			  System.out.println("something went wrong");
		  }
		  con.close();
		  st.close();
	   }
}
