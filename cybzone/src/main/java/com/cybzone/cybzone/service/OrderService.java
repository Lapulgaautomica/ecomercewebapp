package com.cybzone.cybzone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybzone.cybzone.beans.OrderDTO;
import com.cybzone.cybzone.repository.OrderDAO;

@Service
public class OrderService {

	@Autowired
	private OrderDAO dao;
	
	
	public void saveOrder(OrderDTO odto)
	{
		dao.save(odto);
		System.out.println("success");
	}
	

	public List<OrderDTO> getOrder(String email)
	{
		List<OrderDTO>list=dao.findByUserEmail(email);
		System.out.println("success");
		return list;
	}
	
}
