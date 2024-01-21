package com.service;

import java.util.List;

import com.dto.RegistrationDetail;
import com.sharad.repository.RegistrationRepo;

public class RegistrationService {
   public int save(RegistrationDetail regDetail) {
	   RegistrationRepo repo = new RegistrationRepo();
	   return repo.save(regDetail);   
   }
   public List<RegistrationDetail> getAll() {
	   RegistrationRepo repo = new RegistrationRepo();
	  return repo.findAll();  
   }
}
