package com.cetpa.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data

public class Employee {
	private int id;
	private String name;
	private String email;
	private String mobile;
	private double salary;
	private String username;
	private String password;
}
