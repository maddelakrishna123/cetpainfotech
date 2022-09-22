package com.trangile.hb.associationmapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class AtmCard {
	@Id
	private int cno;
	private String ctype;
	private String issueddate;
	@OneToOne
	private Account account;
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getIssueddate() {
		return issueddate;
	}
	public void setIssueddate(String issueddate) {
		this.issueddate = issueddate;
	}
	
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "AtmCard [cno=" + cno + ", ctype=" + ctype + ", issueddate=" + issueddate + "]";
	}

	
	

}
