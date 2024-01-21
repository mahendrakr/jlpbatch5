package executeUpdateMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.batch5.JdbcUtil;

public class CreateTable {
	public static void main(String[] args) {
	     
			Connection con = JdbcUtil.getMySqlConnection();
			PreparedStatement ps = null;
		
			String sql = "create table student2(sid int,sname varchar(50),city varchar(50))";
			//String sql = "drop table student2";
			try {
				ps = con.prepareStatement(sql);
				int count= ps.executeUpdate();
			
			System.out.println(count);
				if( count>0 ) {
					System.out.println(count +"table has been created");
				}
				else {
					System.out.println("something went wrong");
				}
			} catch ( SQLException e ) {
				e.printStackTrace();
			} finally {
				JdbcUtil.cleanResources(ps, con);
			}
		}
}
