package com.web.service;

import com.web.model.User;
import com.web.repo.DaoContract;

public class UserService {

	 private DaoContract<User, Integer> udao;
	 
	 public UserService(DaoContract<User, Integer> udao) {
		 super();
		 this.udao = udao;
	 }
	 
	 public UserService() {
		 super();
	 }
	 
	 public User findByName(String name) {
		 return udao.findByName(name);
	 }
}
