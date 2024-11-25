package com.laptop.productservice;

import com.laptop.productservice.entity.Product;
import com.laptop.productservice.payload.ProductRequest;
import com.laptop.productservice.payload.ProductResponse;
import com.laptop.productservice.repo.ProductRepository;
import lombok.extern.java.Log;

public class ProductServiceImpl implements ProductService {
	ProductRepository productRepository;

	@Override
	public long addProduct(ProductRequest productRequest) {
		// TODO Auto-generated method stub
		Product product= new Product();
		product.setProductModel(productRequest.getModel());
		product.setPrice(productRequest.getPrice());
		product.setLaptopImage(productRequest.getImage());
		productRepository.save(product);
		return product.getProductId();
	}

	@Override
	public ProductResponse getProductById(long productId) {
		// TODO Auto-generated method stub
		
		productRepository.getById(productId);
		return null;
	}

	@Override
	public void deleteProductById(long productId) {
		// TODO Auto-generated method stub
		productRepository.deleteById(productId);
		

		
	}

}
