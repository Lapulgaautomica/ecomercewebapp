package com.cybzone.cybzone.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cybzone.cybzone.beans.LoginDTO;
import com.cybzone.cybzone.beans.ProductDTO;
import com.cybzone.cybzone.beans.userDTO;
import com.cybzone.cybzone.service.UserService;

@Controller
public class LoginController 
{
	
	
	
	@Autowired
	private UserService service;
	
	@GetMapping("/userlogin")
	public  String userValidation() {
		return "login";
	}
	
	@RequestMapping("/signup")
	public String saveUser() {
		return "signup";
	}
	
	@PostMapping("/login")
	 public String login(LoginDTO dto,Model model) {
		String email=dto.getEmail();
		String password=dto.getPassword();
		System.out.println(email+password);
		userDTO fromdb=service.login( email,password);
	
		
		if(fromdb!=null) 
		{
			List<ProductDTO> list=service.getData();
			model.addAttribute("list", list);
			model.addAttribute("email", fromdb.getEmail());
			return"home";
		}
		else 
		{
			model.addAttribute("failed", "notvalid");
			return "Login";
		}
	}
	@GetMapping("search")
	public String search( String keyword, Model m){
		ProductDTO list=service.search(keyword);
		System.out.println("keyword"+keyword);
		System.out.println(list);
		m.addAttribute("list",list);
		
		return  "searchresult";
	}
	
	
	
}
