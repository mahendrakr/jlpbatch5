package executeMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.batch5.JdbcUtil;

public class Insert2 {
	public static void main(String[] args) {
		Connection con = JdbcUtil.getMySqlConnection();
		PreparedStatement ps = null;
		String sql = "insert into student1 values(6,'rajat','hbd')";
		try {
			ps = con.prepareStatement(sql);
			boolean result = ps.execute();
			System.out.println(result);
			if ( !result ) {
				System.out.println("record has been inserted");
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
