package com.cybzone.cybzone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybzone.cybzone.beans.CartDTO;
import com.cybzone.cybzone.repository.CartDAO;

@Service
public class CartService {
	@Autowired
	private CartDAO dao;
	public void saveCart(CartDTO dto) {
		dao.save(dto);
		System.out.println("save success");
	}
	
	
	public  CartDTO getCartByEmailAndName(String email,String ProductName) {
		CartDTO  list= dao.findByUserEmailAndProductName(email,ProductName);
		return list;
	}
	
	public List<CartDTO> getCart(String email) {
		List<CartDTO> list= dao.findByUserEmail(email);
		return list;
	}
	
	public void deleteCart(int id) {
		dao.deleteById(id);
		System.out.println("sucessfully deleted");
	}
	public CartDTO  getCartById(int id) {
		CartDTO dto=dao.findById(id).orElse(null);
		
		return dto;
	}
	
	

}
