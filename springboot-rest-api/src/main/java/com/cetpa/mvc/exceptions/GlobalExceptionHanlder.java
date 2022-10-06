package com.cetpa.mvc.exceptions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cetpa.mvc.models.ErrorModel;

@RestControllerAdvice
public class GlobalExceptionHanlder extends ResponseEntityExceptionHandler{
	@ExceptionHandler(ProductNotFoundException.class)
	public ErrorModel handleProductNotFoundException(ProductNotFoundException ex, WebRequest req)
	{
		ErrorModel model = new ErrorModel();
		model.setTimestamp(new Date());

		model.setStatus(404);
		model.setError("NOT FOUND");
		model.setMessage(ex.getMessage());
		model.setPath(req.getDescription(false));
		
		
		return model;
		
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		
	BindingResult br =	ex.getBindingResult();
	List<String> errors = new ArrayList<String>();
	
	br.getAllErrors().stream().forEach(t->errors.add(t.getDefaultMessage()));
		return ResponseEntity.badRequest().body(errors);
	}
	
	
	@ExceptionHandler(ConstraintViolationException.class)
public  ResponseEntity<Object> handleContraintVoilationExceprtion(ConstraintViolationException ex,
			WebRequest request) {
		
		
	
	List<String> errors = new ArrayList<String>();
	
	ex.getConstraintViolations().forEach(t->errors.add(t.getMessage()));
	
	//br.getAllErrors().stream().forEach(t->errors.add(t.getDefaultMessage()));
		return ResponseEntity.badRequest().body(errors);
	}
	

}
