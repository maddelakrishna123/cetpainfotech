package com.cetpa.mvc.models;

import java.util.Date;

import lombok.Data;
@Data
public class ErrorModel {
	
	private Date timestamp;
	private int status;
	private String error;
	private String message;
	private String path;
	

}
