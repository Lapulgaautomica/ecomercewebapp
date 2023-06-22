package com.cybzone.cybzone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybzone.cybzone.beans.OrderDTO;

@Repository
public interface OrderDAO  extends JpaRepository<OrderDTO, Integer>{

	List<OrderDTO> findByUserEmail(String email); 

}
