package com.cybzone.cybzone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybzone.cybzone.beans.LoginDTO;
import com.cybzone.cybzone.beans.ProductDTO;
import com.cybzone.cybzone.beans.userDTO;
import com.cybzone.cybzone.repository.ProductDAO;
import com.cybzone.cybzone.repository.UserDAO;
@Service
public class UserService {

	@Autowired
	private UserDAO dao;
	@Autowired
	private ProductDAO pdao;
	public void saveUser(userDTO user) {
		dao.save(user);
		System.out.println("sucses");
		
	}
	public userDTO login(String email,String password) {
		
		 userDTO fromdb=dao.findByEmailAndPassword(email,password);
		 System.out.println(fromdb);
		 return fromdb;
	}
	
	public List<ProductDTO> getData(){
		List<ProductDTO> list=pdao.findAll();
		return list;
		
	}
	
	public ProductDTO  search(String keywords){
		
		ProductDTO list=pdao.findByProductNameContaining(keywords);
		System.out.println(list);
		return list;
		
	}

	
}
