package resultSetScrolable;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.batch5.JdbcUtil;

public class ResultSetReadOnlyUpdateable {
	public static void main(String[] args) {
		Connection con = JdbcUtil.getMySqlConnection();
		Statement st = null;
		ResultSet rs=null;
		String sql = "select * from student1";
		try {
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery(sql);
		//	 while(rs.next()) {
			//	 System.out.println(rs.getInt("id")+" "+rs.getString("name") + " " + rs.getString("city"));
		//	 }
			rs.absolute(2);
			System.out.println(rs.getInt("id")+" "+rs.getString("name") + " " + rs.getString("city"));
			System.out.println("******insert a record********");
			//rs.absolute(2);
			
			rs.moveToInsertRow();
			rs.updateInt(1, 101);
			rs.updateString(2,"sharad");
			rs.updateString(3, "indore");
			rs.insertRow();
			rs.beforeFirst();
			System.out.println("xyz");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name") + " " + rs.getString("city"));
			}
			
		} catch ( SQLException e ) {
			e.printStackTrace();
		} finally {
			JdbcUtil.cleanResources(st, con,rs);
		}
	}   
}
