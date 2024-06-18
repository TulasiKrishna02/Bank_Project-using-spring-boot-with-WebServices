package com.tulasi.bank_project.dto;


import lombok.Data;
@Data
public class AccountDto {
	
	private Long id;
	private String accountholder;
	private double balance;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccountholder() {
		return accountholder;
	}
	public void setAccountholder(String accountholder) {
		this.accountholder = accountholder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public AccountDto(Long id, String accountholder, double balance) {
		super();
		this.id = id;
		this.accountholder = accountholder;
		this.balance = balance;
	}
	public AccountDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
