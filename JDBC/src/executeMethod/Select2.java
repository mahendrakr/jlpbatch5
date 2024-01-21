package executeMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.batch5.JdbcUtil;

public class Select2 {
	public static void main(String[] args) {
		Connection con = JdbcUtil.getMySqlConnection();
		PreparedStatement ps = null;
		String sql = "select * from student4";
		try {
			ps = con.prepareStatement(sql);
			boolean result = ps.execute();
			System.out.println(result);
			if ( !result ) {
				System.out.println("record has been selected");
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
