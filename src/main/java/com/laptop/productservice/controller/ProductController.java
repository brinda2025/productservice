package com.laptop.productservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptop.productservice.ProductService;
import com.laptop.productservice.payload.ProductRequest;
import com.laptop.productservice.payload.ProductResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
@Log4j2
public class ProductController {
	private  ProductService product;
	
	@PostMapping
	public ResponseEntity<Long> addProduct(@RequestBody ProductRequest productRequest){
		
		long productId = product.addProduct(productRequest);
		System.out.println("addproduct");

		return new ResponseEntity<>(productId,HttpStatus.CREATED) ;
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Long> getProductById(@PathVariable("id")long productId){
		
		ProductResponse productResponse = product.getProductById(productId);
		System.out.println("getproduct");

		return new ResponseEntity(productResponse,HttpStatus.OK) ;
		
	}
	
	

}
