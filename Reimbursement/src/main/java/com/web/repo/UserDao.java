package com.web.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.revature.config.ConnectionUtil;
import com.web.model.ReimbursementType;
import com.web.model.User;

public class UserDao implements DaoContract<User, Integer> {

	@Override
	public List<User> findAll() {
		
		return null;
	}

	@Override
	public User findById(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int create(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(User i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
