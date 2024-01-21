package executeMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.batch5.JdbcUtil;

public class Update2 {
	public static void main(String[] args) {
		Connection con = JdbcUtil.getMySqlConnection();
		PreparedStatement ps = null;
		String sql = "update student4 set name='rohit' where id=4";
		try {
			ps = con.prepareStatement(sql);
			boolean result = ps.execute();
			System.out.println(result);
			if ( !result ) {
				System.out.println("record has been updated");
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
