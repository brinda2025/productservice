package com.laptop.productservice;

import com.laptop.productservice.payload.ProductRequest;
import com.laptop.productservice.payload.ProductResponse;

public interface ProductService {

	long addProduct(ProductRequest productRequest);
	ProductResponse getProductById(long productId);
	public void deleteProductById(long productId);
	
	
}
