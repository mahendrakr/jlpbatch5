package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.util.JdbcUtil;

public class JdbcService {
public int saveData(String username,String email,String password,String gender,String course, String timings, String remarks) {
	Connection con= JdbcUtil.getMySqlConnection();
	String sql="insert into registration_detail values(?,?,?,?,?,?,?)";
	int count=0;
	PreparedStatement ps=null;
	
	try {
		 ps= con.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, email);
		ps.setString(3, password);
		ps.setString(4, gender);
		ps.setString(5, course);
		ps.setString(6, timings);
		ps.setString(7, remarks);
		 count = ps.executeUpdate();
		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		JdbcUtil.cleanResources(ps, con);
	}
	return count;
}
}
