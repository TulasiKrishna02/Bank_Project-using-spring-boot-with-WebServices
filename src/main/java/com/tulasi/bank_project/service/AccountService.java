package com.tulasi.bank_project.service;

import java.util.List;

import com.tulasi.bank_project.dto.AccountDto;

public interface AccountService {
	
	AccountDto createAccount(AccountDto accountDto);
	
	AccountDto getAccountById(Long id); 
	
	AccountDto diposit(Long id,double amount); 
	
	AccountDto withdraw(Long id,double amount);
	
	List<AccountDto> getAllAccounts();
	
	
	void deleteAccount(Long id);

}
