package com.web.model;

public class User {
   
	/*
	 * create table project1.ers_users (
  ers_users_id serial primary key,
  ers_username text,
  unique(ers_username),
  ers_password text,
  user_first_name text,
  user_last_name text,
  user_email text,
  unique(user_email),
  user_role_id integer references public.ers_user_roles(ers_user_role_id)  
 )

	 */
	private int usersid;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String email;
	private String userroleid;
	
	public int getUsersid() {
		return usersid;
	}
	public void setUsersid(int usersid) {
		this.usersid = usersid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserroleid() {
		return userroleid;
	}
	public void setUserroleid(String userroleid) {
		this.userroleid = userroleid;
	}
	@Override
	public String toString() {
		return "User [usersid=" + usersid + ", username=" + username + ", password=" + password + ", firstname="
				+ firstname + ", lastname=" + lastname + ", email=" + email + ", userroleid=" + userroleid + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int usersid, String username, String password, String firstname, String lastname, String email,
			String userroleid) {
		super();
		this.usersid = usersid;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.userroleid = userroleid;
	}
	
	
	
  
}
