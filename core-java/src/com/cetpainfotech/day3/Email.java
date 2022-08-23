package com.cetpainfotech.day3;

import java.util.Date;

public class Email {
	
	private long id;
	private String to;
	private String from;
	private String subject;
	private String content;
	private double size;
	private Date receiveDate;
	
	
	// getters and setters
	
	
	// No arg 
	
	public Email()
	{
		
	}


	public Email(long id, String to, String from, String subject, String content, double size, Date receiveDate) {
		super();
		this.id = id;
		this.to = to;
		this.from = from;
		this.subject = subject;
		this.content = content;
		this.size = size;
		this.receiveDate = receiveDate;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String from) {
		this.from = from;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}


	public Date getReceiveDate() {
		return receiveDate;
	}


	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}
	
	// all arg
	
	

}
