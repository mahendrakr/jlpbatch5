package executeUpdateMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.batch5.JdbcUtil;

public class Delete1 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter student sid");
	    int sid=sc.nextInt();
	   
	     
		Connection con = JdbcUtil.getMySqlConnection();
		PreparedStatement ps = null;
		
	
		String sql = "delete from student2 where sid=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,sid);
		    

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
