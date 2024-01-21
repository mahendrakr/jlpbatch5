package com.jdbc.batch5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateUsingPrepared {
	public static void main(String[] args) {
		//CreateUsingPrepared c=new CreateUsingPrepared();
		//c.createTable();
	//}
	//public void createTable() {
		Connection con = JdbcUtil.getMySqlConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "create table student2(id int,name varchar(20),city varchar(25))";
 	System.out.println(sql);
		try {
			ps = con.prepareStatement(sql);
		//	ps.setInt(1, id);
			rs = ps.executeQuery();
 //	rs.next();
//		System.out.println(rs.getInt("stu_id") + " " + rs.getString("stu_name") + " " + rs.getString("city"));
			while ( rs.next() ) {
				System.out.println("table created");
			}
		} catch ( SQLException e ) {
			e.printStackTrace();
		} finally {
			JdbcUtil.cleanResources(ps, con, rs);
		}
	}
}


