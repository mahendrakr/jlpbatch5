package executeMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.batch5.JdbcUtil;

public class Delete {
	public static void main(String[] args) {
		Connection con = JdbcUtil.getMySqlConnection();
		PreparedStatement ps = null;
		String sql = "delete from student1 where id=6";
		try {
			ps = con.prepareStatement(sql);
			boolean result = ps.execute();
			System.out.println(result);
			if ( !result ) {
				System.out.println("record has been deleted");
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
