package com.web.servlet;

import javax.servlet.http.HttpServletRequest;

import com.web.controller.ReimbursementController;

public class RequestForwarder {

	
	   public String routes(HttpServletRequest req) {
		   
		   switch (req.getRequestURI()) {
		   case "/Reimbursements/login.page":
			   return new ReimbursementController().login(req);
		   default:
			   return "html/landing.html";
		   }
	   }
}
