package com.trangile.hb.associationmapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Account {
	
	@Id

	@SequenceGenerator(name="accSeq",initialValue = 100001,allocationSize = 1,sequenceName = "ACC_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "accSeq")
	private int accno;
	private String name;
	private double balance;
	
	@OneToOne
	@JoinColumn(name = "atm_cno",referencedColumnName = "cno")
	private AtmCard atmcard;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public AtmCard getAtmcard() {
		return atmcard;
	}
	public void setAtmcard(AtmCard atmcard) {
		this.atmcard = atmcard;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + ", atmcard=" + atmcard + "]";
	}


}
// create table account (accno int primary key, atm_cno int  foreign key (atm_cno) refeneces atmcard(cno)