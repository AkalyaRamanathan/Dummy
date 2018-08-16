package com.capg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class JspController {
	@RequestMapping("/index")
	public String showindex() {
		return "index";
	}
	@RequestMapping("/login")
	public String showlogin() {
		return "login";
	}
	@RequestMapping("/register")
	public String showregister() {
		return "register";
	}
	@RequestMapping("/Merchant")
	public String showmerchant() {
		return "Merchant";
	}
	@RequestMapping("/Admin")
	public String showAdmin() {
		return "Admin";
	}
}
