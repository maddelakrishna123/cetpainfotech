package com.cetpa.mvc.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHanlder {
	@ExceptionHandler(DuplicateEmployeeFoundException.class)
	
	public String handleDuplicateEmployeeException(DuplicateEmployeeFoundException ex, Model model)
	{
		model.addAttribute("message", ex.getMessage());
		return "error";
	}

}
