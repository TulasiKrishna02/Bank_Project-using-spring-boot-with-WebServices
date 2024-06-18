package com.tulasi.bank_project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tulasi.bank_project.dto.AccountDto;
import com.tulasi.bank_project.service.AccountService;

@RestController
@RequestMapping("/api/account")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	
	//Add Account REST API
	@PostMapping
	public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
		return new ResponseEntity<>(accountService.createAccount(accountDto),HttpStatus.CREATED );
	}
	
	//Get Account RestApi
	@GetMapping("/{id}")
	public ResponseEntity<AccountDto> getAccountbyId(@PathVariable Long id){
		AccountDto accountDto=accountService.getAccountById(id);
		return ResponseEntity.ok(accountDto);
	}
	//Deposit Rest API
	@PutMapping("/{id}/deposit")
	public ResponseEntity<AccountDto> deposit(@PathVariable Long id,
			@RequestBody Map<String,Double> request){
		Double amount=request.get("amount");
		AccountDto accountDto=accountService.diposit(id,request.get("amount"));
		return ResponseEntity.ok(accountDto);
	}
	
	//withdraw rest API
	@PutMapping("/{id}/withdraw")
	public ResponseEntity<AccountDto> withdraw(@PathVariable Long id,
			@RequestBody Map<String,Double> request){
		double amount=request.get("amount");
		AccountDto accountDto=accountService.withdraw(id, amount);
		return ResponseEntity.ok(accountDto);
	}
	//Get ALl Accounts REST API
	@GetMapping
	public ResponseEntity<List<AccountDto>> getAllAccounts(){
		List<AccountDto> accounts=accountService.getAllAccounts();
		return ResponseEntity.ok(accounts);
	}
	
	//Deleting ACcount REST API
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAccount(@PathVariable Long id){
		accountService.deleteAccount(id);
		return ResponseEntity.ok("Account deleted Successfully");
	}
	

}
