package executeUpdateMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.batch5.JdbcUtil;

public class Select1 {
	public static void main(String[] args) {
	
	     
		Connection con = JdbcUtil.getMySqlConnection();
		PreparedStatement ps = null;
		
	
		String sql = "select*from student2";
		
		try {
			ps = con.prepareStatement(sql);
		    int count= ps.executeUpdate();
		    
		System.out.println(count);
			if( count>0 ) {
				System.out.println(count +"record has been inserted");
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
