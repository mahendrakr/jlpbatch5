package executeQueryMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.batch5.JdbcUtil;

public class Update {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
           String name=sc.next();
        System.out.println("enter id");
	       int id=sc.nextInt();
		Connection con = JdbcUtil.getMySqlConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "update student1 set name=?,where id=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(2, name);
			ps.setInt(1,id);
			rs = ps.executeQuery();
		
			while ( rs.next() ) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name") + " " + rs.getString("city"));
			}
		} catch ( SQLException e ) {
			e.printStackTrace();
		} finally {
			JdbcUtil.cleanResources(ps, con, rs);
		}
	}
}
