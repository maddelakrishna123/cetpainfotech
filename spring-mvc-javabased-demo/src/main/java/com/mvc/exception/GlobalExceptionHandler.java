package com.mvc.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	
	@ExceptionHandler(Exception.class)
	public String handleAnyExceptiom(Exception ex, Model model) {
		
		model.addAttribute("err", ex.getMessage());
	return "error";	
	}
	
	@ExceptionHandler(DuplicateEmployeeFoundException.class)
	public String handleDuplicateEmployeeException(DuplicateEmployeeFoundException ex, Model model)
	{
		model.addAttribute("err", ex.getMessage());
	return "error";	
	}
	
	
}
