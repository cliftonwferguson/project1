package com.web.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.revature.config.ConnectionUtil;
import com.web.model.User;

public class UserDao implements DaoContract<User, Integer> {

	@Override
	public List<User> findAll() {
		List<User> users = new
		String sql = "select * from reimbursement_view";
		try(Connection conn = ConnectionUtil.getInstance().getConnection()){
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
			}
		}
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
   
}
