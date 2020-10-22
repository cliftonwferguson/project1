package com.web.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.revature.config.ConnectionUtil;
import com.web.model.Reimbursement;
import com.web.model.ReimbursementType;
import com.web.model.User;

public class ReimbursementDao implements DaoContract<Reimbursement, Integer>{

	@Override
	public List<Reimbursement> findAll() {
		List<User> users = new LinkedList<>();
		String sql = "select * from reimbursement_view";
		try(Connection conn = ConnectionUtil.getInstance().getConnection()){
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				/*
		            a.reimb_id, a.reimb_author, a.reimb_amount, 
                b.reimb_status, a.reimb_submitted, c.reimb_type 
				 */
				
				Reimbursement.add(new Reimbursement(rs.getInt("reimb_id"), rs.getString("reimb_author"), rs.getInt("reimb_amount"),
						new ReimbursementStatus(rs.getString("reimb_status"), rs.getOffsetDateTime("reimb_submitted"),
							new ReimbursementType(rs.getString"reimb_type")	)));
			}
			}
		return null;
	}

	@Override
	public Reimbursement findById(Integer i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Reimbursement t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int create(Reimbursement t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Reimbursement i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
