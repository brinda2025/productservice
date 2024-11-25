package com.laptop.productservice.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.laptop.productservice.payload.ErrorResponse;

@ControllerAdvice
public class RestResponseEntityException extends ResponseEntityExceptionHandler{
	
	//@ExceptionHandler(ProductServiceCustomException.class)
	public ResponseEntity<ErrorResponse> handleProductServiceException(ProductServiceCustomException exception){
		return null;
		//return new ResponseEntity<>(new ErrorResponse().builder().errorMessage(exception.getMessage()).errorCode(exception.getMessage()).build().HttpStatus.NOT_Fou);
		
		
	}

}
