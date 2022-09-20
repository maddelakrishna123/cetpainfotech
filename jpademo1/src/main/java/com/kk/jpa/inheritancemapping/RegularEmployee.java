package com.kk.jpa.inheritancemapping;

import javax.persistence.Entity;

@Entity
public class RegularEmployee extends Employee12{
	
	
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "RegularEmployee [bonus=" + bonus + "]";
	}
	
	

}
