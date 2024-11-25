package com.laptop.productservice.payload;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductRequest {
	private String model;
	private long price;
	private String image;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	

}
