package com.web.controller;

import javax.servlet.http.HttpServletRequest;

import com.web.model.User;
import com.web.service.UserService;

public class UserController {
	
	 private UserService us;

	public String login(HttpServletRequest req) {
		String userName = req.getParameter("name");
		User u = us.findByName(userName);
		if(u != null) {
			return "html/user.html";
		} else {
			return "html/landing.html";
		}
	}
	
}
