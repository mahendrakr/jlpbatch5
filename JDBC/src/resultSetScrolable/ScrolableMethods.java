package resultSetScrolable;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.batch5.JdbcUtil;

public class ScrolableMethods {
	public static void main(String[] args) {
		Connection con = JdbcUtil.getMySqlConnection();
		Statement st = null;
		ResultSet rs=null;
		String sql = "select * from student1";
		try {
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery(sql);
			System.out.println(rs.previous());
			System.out.println(" **********forward*********** ");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name") + " " + rs.getString("city"));
			}
			System.out.println(" ***********backward***********");
			while(rs.previous()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name") + " " + rs.getString("city"));
			}
			System.out.println("***********absolute***********");
			rs.absolute(2);
			System.out.println(rs.getInt("id")+" "+rs.getString("name") + " " + rs.getString("city"));
			System.out.println("*************relative****************");
			rs.relative(3);
			System.out.println(rs.getInt("id")+" "+rs.getString("name") + " " + rs.getString("city"));
		} catch ( SQLException e ) {
			e.printStackTrace();
		} finally {
			JdbcUtil.cleanResources(st, con);
		}
	}
}
