
package com.jdbc.batch5;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		Connection con = JdbcUtil.getMySqlConnection();
		Statement st = null;
		String sql = "insert into student values(1,'sharad','Bhopal')";
		try {
			st = con.createStatement();
			boolean result = st.execute(sql);
			if ( !result ) {
				System.out.println("Record has been inserted");
			}
		} catch ( SQLException e ) {
			e.printStackTrace();
		} finally {
			JdbcUtil.cleanResources(st, con);
		}
	}
}