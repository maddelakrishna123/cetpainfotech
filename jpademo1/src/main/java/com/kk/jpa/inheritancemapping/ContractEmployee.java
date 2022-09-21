package com.kk.jpa.inheritancemapping;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value="con_emp")
public class ContractEmployee extends Employee12{
	
	private int hoursworked;
	private double payperhour;
	public int getHoursworked() {
		return hoursworked;
	}
	public void setHoursworked(int hoursworked) {
		this.hoursworked = hoursworked;
	}
	public double getPayperhour() {
		return payperhour;
	}
	public void setPayperhour(double payperhour) {
		this.payperhour = payperhour;
	}
	@Override
	public String toString() {
		return "ContractEmployee [hoursworked=" + hoursworked + ", payperhour=" + payperhour + "]";
	}
	

	
	public double calculateSalary()
	{
		return this.payperhour * this.hoursworked;
	}
}
