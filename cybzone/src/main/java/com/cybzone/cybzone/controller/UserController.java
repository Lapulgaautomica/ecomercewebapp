package com.cybzone.cybzone.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cybzone.cybzone.beans.userDTO;
import com.cybzone.cybzone.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping("/save")
	public String saveUser(userDTO dto,Model m) {
		service.saveUser(dto);
		String success="account created sucsessfully";
		m.addAttribute("success",success );
		return"login";
		
	}
	
	@RequestMapping("/userlogout")
	public String userLogOut(HttpSession session) {
		session.invalidate();
		return "login";
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
