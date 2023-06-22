package com.cybzone.cybzone.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cybzone.cybzone.beans.CartDTO;
import com.cybzone.cybzone.beans.ProductDTO;
import com.cybzone.cybzone.service.CartService;
import com.cybzone.cybzone.service.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService service;
	@Autowired
	private CartService service1;

	
	
	@RequestMapping("home")
	public String gethome(Model model,HttpSession s) {
		List<ProductDTO> list=service.getData();
		model.addAttribute("list", list);
		
		String email=(String) s.getAttribute("email");
		model.addAttribute("email", email);
		System.out.println(email);
		
		return "home";
	}
	
	@RequestMapping("/addtocart")
	public String addToCart(CartDTO dto ,Model m,HttpSession session) {
		
		CartDTO list1=service1.getCartByEmailAndName(dto.getUserEmail(),dto.getProductName());
		System.out.println(list1+"list");
		if(list1!=null) {
			int a=Integer.parseInt(list1.getProductQuantity());
			a+=1;
			
			list1.setProductQuantity(Integer.toString(a));
		
			service1.saveCart(list1);
			
		}
		else {
			service1.saveCart(dto);
		}
	
		session.setAttribute("email", dto.getUserEmail());
		m.addAttribute("cart", "cart added successeffully");
		List<ProductDTO> list=service.getData();
		m.addAttribute("list", list);
		return "home";
	}
	
	

	
}
