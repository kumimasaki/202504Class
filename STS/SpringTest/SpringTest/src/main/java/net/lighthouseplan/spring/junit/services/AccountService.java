package net.lighthouseplan.spring.junit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.lighthouseplan.spring.junit.models.Account;
import net.lighthouseplan.spring.junit.repositories.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository repository;
	
	public boolean validateAccount(String username, String password) { 
		Account account = repository.findByUsername(username);
		if (account == null || !account.getPassword().equals(password)) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean createAccount(String username, String password) {
		if (repository.findByUsername(username) == null) {
			repository.save(new Account(username, password));
			return true;
		} else {
			return false;
		}
	}
}
