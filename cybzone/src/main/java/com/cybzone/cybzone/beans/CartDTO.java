package com.cybzone.cybzone.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class CartDTO implements Serializable {
	@Id
	@GenericGenerator(name = "ref",strategy = "increment")
	@GeneratedValue(generator = "ref")
	private int id ;
	private String productName;
	private String productCategory;
	private String productPrice;
	private String productQuantity;
	private String userEmail;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private userDTO dto;
	@Override
	public String toString() {
		return "CartDTO [id=" + id + ", productName=" + productName + ", productCategory=" + productCategory
				+ ", productPrice=" + productPrice + ", productQuantity=" + productQuantity + ", userEmail=" + userEmail
				+ ", dto=" + dto + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public userDTO getDto() {
		return dto;
	}
	public void setDto(userDTO dto) {
		this.dto = dto;
	}


	


}
