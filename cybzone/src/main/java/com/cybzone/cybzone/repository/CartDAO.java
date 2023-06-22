package com.cybzone.cybzone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybzone.cybzone.beans.CartDTO;

@Repository
public interface CartDAO extends JpaRepository<CartDTO, Integer> {

	List<CartDTO> findByUserEmail(String email);

	CartDTO findByUserEmailAndProductName(String email, String ProductName);

}
