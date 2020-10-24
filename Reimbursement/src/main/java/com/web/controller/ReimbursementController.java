package com.web.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import com.web.model.Reimbursement;
import com.web.service.ReimbursementService;

public class ReimbursementController {
  private ReimbursementService rs;

public ReimbursementController(ReimbursementService rs) {
	super();
	this.rs = rs;
}
  
  public ReimbursementController() {
	  this(new ReimbursementService());
  }
  
//  public String login(HttpServletRequest req) {
//	  String userName =req.getParameter("name");
//	  Reimbursement r = rs.findByName(userName);
//	  if(Optional.of(r).isPresent()) {
//		  return "html/reimbursement.html";
//	  } else {
//		  return "html/landing.html";
//	  }
//  }
  
}
