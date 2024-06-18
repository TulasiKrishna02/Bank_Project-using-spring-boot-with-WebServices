package com.tulasi.bank_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tulasi.bank_project.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
