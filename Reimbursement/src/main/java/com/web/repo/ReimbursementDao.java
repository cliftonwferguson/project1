package com.web.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import com.revature.config.ConnectionUtil;
import com.web.model.Reimbursement;
import com.web.model.ReimbursementType;
import com.web.model.User;

public class ReimbursementDao implements DaoContract<Reimbursement, Integer> {

	@Override
	public List<Reimbursement> findAll() {
		List<Reimbursement> reimbursement = new LinkedList<>();
		String sql = "select * from project1.reimbursement_view";
		try (Connection conn = ConnectionUtil.getInstance().getConnection()) {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				/*
				 * a.reimb_id, a.reimb_author, a.reimb_amount, b.reimb_status,
				 * a.reimb_submitted, c.reimb_type
				 */

				reimbursement.add(new Reimbursement(rs.getInt("reimb_id"), rs.getString("reimb_author"),
						rs.getInt("reimb_amount"), rs.getString("reimb_status"),
						rs.getObject("reimb_submitted", LocalDateTime.class), rs.getString("reimb_type")));
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reimbursement;
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

	@Override
	public Reimbursement findByName(String name) {
		Reimbursement r = null;
		String sql = "select * from reimbursement_view where reimb_author=?";
		try (Connection conn = ConnectionUtil.getInstance().getConnection()) {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			rs.next();
			r = new Reimbursement(rs.getInt("reimb_id"), rs.getString("reimb_author"), rs.getInt("reimb_amount"),
					rs.getString("reimb_status"), rs.getObject("reimb_submitted", LocalDateTime.class),
					rs.getString("reimb_type"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}

}
