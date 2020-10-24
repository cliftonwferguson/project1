package com.web.service;

import com.web.model.Reimbursement;
import com.web.model.User;
import com.web.repo.UserDao;

public class UserService {
	
	   private UserDao udao;
	
   
	public User findByName(String name) {
		return udao.findByName("name");
		
	}
	
	
}
