package executeUpdateMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jdbc.batch5.JdbcUtil;

public class Insert1 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter student sid");
	    int sid=sc.nextInt();
	    System.out.println("enter student sname");
	    String sname=sc.next();
	    System.out.println("enter student city");
	    String city=sc.next();
	     
		Connection con = JdbcUtil.getMySqlConnection();
		PreparedStatement ps = null;
		
	
		String sql = "insert into student2 values(?,?,?)";
		
		try {
			ps = con.prepareStatement(sql);
		    ps.setInt(1,sid);
		    ps.setString(2,sname);
		    ps.setString(3,city);
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
