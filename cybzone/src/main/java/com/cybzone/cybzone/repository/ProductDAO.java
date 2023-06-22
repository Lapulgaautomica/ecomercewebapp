package com.cybzone.cybzone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cybzone.cybzone.beans.ProductDTO;

public interface ProductDAO  extends JpaRepository<ProductDTO, Integer>{
	
	public ProductDTO findByProductNameContaining(String keyword);

}
