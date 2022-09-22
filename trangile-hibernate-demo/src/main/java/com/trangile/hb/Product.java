package com.trangile.hb;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="prod01")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Product {
	@Id
	
	@SequenceGenerator(name="prodSeq",initialValue = 6000,allocationSize = 1,sequenceName = "PROd_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "prodSeq")
	private int pid;
	private String pname;
	//@Column(name="descr")
	private String description;
	private double price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int pid, String pname, String description, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.description = description;
		this.price = price;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", description=" + description + ", price=" + price + "]";
	}
	
	

}
// 60000 , 6001 , 6002