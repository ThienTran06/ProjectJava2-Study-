package com.javaweb.controller_advice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.javaweb.model.Error_Response;

import Custom_Exception.Field_Required_Exception;

@ControllerAdvice
public class Controller_Advisor extends ResponseEntityExceptionHandler {
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<Object> handleArithmeticException(ArithmeticException ex, WebRequest request) {
		Error_Response error_response = new Error_Response();
		error_response.setError(ex.getMessage());
		List<String> Detail = new ArrayList<String>();
		Detail.add("Khong chia duoc cho 0");
		error_response.setDetail(Detail);
		return new ResponseEntity<>(error_response, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(Field_Required_Exception.class)
	public ResponseEntity<Object> handleField_Required_Exception(Field_Required_Exception ex, WebRequest request) {
		Error_Response error_response = new Error_Response();
		error_response.setError(ex.getMessage());
		List<String> Detail = new ArrayList<String>();
		Detail.add("Name hoac so building dang bi null!");
		error_response.setDetail(Detail);
		return new ResponseEntity<>(error_response, HttpStatus.BAD_GATEWAY);
	}
}
