package com.laptop.productservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//import jakarta.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Builder
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;
	
	@Column(name = "PRODUCT_MODEL")
    private String productModel;
	
	@Column(name = "PRICE")
	private long price;
	
	@Column(name = "IMAGE")
    private String laptopImage;
	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getLaptopImage() {
		return laptopImage;
	}

	public void setLaptopImage(String laptopImage) {
		this.laptopImage = laptopImage;
	}

	


}

