package com.cybzone.cybzone.controller;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cybzone.cybzone.beans.CartDTO;
import com.cybzone.cybzone.beans.OrderDTO;
import com.cybzone.cybzone.service.CartService;
import com.cybzone.cybzone.service.OrderService;
@Controller
public class ProductController {
	
	@Autowired
	private CartService service;
	
	@Autowired
	private OrderService orderService;
	
	


	@GetMapping("/")
	public String homecontroll(HttpSession session) {
		return "login";
	}	
	
	
	
	
	@RequestMapping("cart")
	public String UserCart(String email,Model m) {
		List<CartDTO> list=service.getCart(email);
		list.forEach(l->{
			System.out.println(l.getProductName()+"productname");
		});
		m.addAttribute("list", list);
		
		return "cart";
	}
	
	
	@GetMapping("cartcheckout")
	public String checkOut(CartDTO dto,Model m) {
		m.addAttribute("list", dto);
		return "cartcheckout";
	}
		

	
	@PostMapping("place")
	public String placeOrder( OrderDTO odto,Model m) {
		System.out.println("stsrted");
		LocalDate date=LocalDate.now();
		odto.setDateAndTime(date);
		orderService.saveOrder(odto);
		service.deleteCart(odto.getCartId());
		System.out.println("order created");
		m.addAttribute("placed", "placed");
		
		return "order";
	}
	
	@GetMapping("order")
	public String getOrder(String email,Model m) {
		
			List<OrderDTO> list=orderService.getOrder(email);
	
		
			m.addAttribute("list", list);
			return "order";
	}
	
	
}
