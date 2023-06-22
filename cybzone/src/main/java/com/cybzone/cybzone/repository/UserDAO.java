package com.cybzone.cybzone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cybzone.cybzone.beans.userDTO;


@Repository
public interface UserDAO  extends JpaRepository<userDTO, Integer>{

	userDTO findByEmailAndPassword(String email, String password);



	
}
