package com.capg.bean;

public class Details {
private String username;
private String userid;
private String address;
private String password;
private String repassword;

public Details(String username, String userid, String address, String password, String repassword) {
	super();
	this.username = username;
	this.userid = userid;
	this.address = address;
	this.password = password;
	this.repassword = repassword;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRepassword() {
	return repassword;
}
public void setRepassword(String repassword) {
	this.repassword = repassword;
}
public Details() {
	
}
@Override
public String toString() {
	return "Details [username=" + username + ", userid=" + userid + ", address=" + address + ", password=" + password
			+ ", repassword=" + repassword + "]";
}
}
