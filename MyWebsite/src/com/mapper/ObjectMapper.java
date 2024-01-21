package com.mapper;

import javax.servlet.http.HttpServletRequest;

import com.dto.LoginDetail;

public class ObjectMapper {
   public LoginDetail mapToLoginDetail(HttpServletRequest request) {
	   
       LoginDetail loginDetail= new LoginDetail();
       loginDetail.setUsername(request.getParameter("username"));
       loginDetail.setPassword(request.getParameter("pwd"));
	  return loginDetail;
   }
}
