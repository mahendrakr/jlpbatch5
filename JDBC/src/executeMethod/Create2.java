package executeMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.batch5.JdbcUtil;

public class Create2 {

		public static void main(String[] args) {
			Connection con = JdbcUtil.getMySqlConnection();
			PreparedStatement ps = null;
			String sql = "create table student4(id int,name varchar(20),city varchar(25))";
			try {
				ps = con.prepareStatement(sql);
				boolean result = ps.execute();
				System.out.println(result);
				if ( !result ) {
					System.out.println("table has been created");
				}
				else {
					System.out.println("sommething went wrong");
				}
			} catch ( SQLException e ) {
				e.printStackTrace();
			} finally {
				JdbcUtil.cleanResources(ps, con);
			}
		}
}

