package resultSetForwardOnly;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.batch5.JdbcUtil;

public class GetRowMethod {
	public static void main(String[] args) {
		Connection con = JdbcUtil.getMySqlConnection();
		Statement st = null;
		ResultSet rs=null;
		String sql = "select * from student1";
		try {
			st = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery(sql);
			System.out.println(rs.getRow());
			while(rs.next()) {
				System.out.println(rs.getRow()+" "+rs.getInt("id")+" "+rs.getString("name") + " " + rs.getString("city"));
			}
		} catch ( SQLException e ) {
			e.printStackTrace();
		} finally {
			JdbcUtil.cleanResources(st, con);
		}
	}
}
