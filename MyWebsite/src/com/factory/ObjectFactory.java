package com.factory;

import com.mapper.ObjectMapper;
import com.service.LoginService;
import com.sharad.repository.UserRepository;

public class ObjectFactory {
   public static ObjectMapper createObjectMapperInstance() {
	   return new ObjectMapper();
   }
   public static LoginService createLoginServiceInstance() {
	   return new LoginService();
   }
   public static UserRepository createUserRepositoryInstance() {
	   return new UserRepository();
   }
}
