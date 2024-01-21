package executeQueryMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.batch5.JdbcUtil;

public class Create {
	public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
      //  System.out.println("enter id");
	     //  int id=sc.nextInt();
		Connection con = JdbcUtil.getMySqlConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "create table student3(id int,name varchar(20),city varchar(25))";
		try {
			ps = con.prepareStatement(sql);
			//ps.setInt(1,id);
			rs = ps.executeQuery();
		
			while ( rs.next() ) {
				System.out.println("table is created successfully");
			}
		} catch ( SQLException e ) {
			e.printStackTrace();
		} finally {
			JdbcUtil.cleanResources(ps, con, rs);
		}
	}
}
