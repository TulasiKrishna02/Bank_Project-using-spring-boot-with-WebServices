package com.tulasi.bank_project.mapper;

import com.tulasi.bank_project.dto.AccountDto;
import com.tulasi.bank_project.entity.Account;

public class AccountMapper {
	
	public static Account mapToAccount(AccountDto accountDto) {
		Account account=new Account(
				accountDto.getId(),
				accountDto.getAccountholder(),
				accountDto.getBalance()
				
				);
		return account;
	}
	public static AccountDto mapToAccountDto(Account account) {
		
		AccountDto accountDto=new AccountDto(
				account.getId(),
				account.getAccountHolder(),
				account.getBalance()
				
				);
		return accountDto;
		
	}

}
