package com.springignite.poc.repo;

import java.util.List;

import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;
import org.springframework.stereotype.Repository;

import com.springignite.poc.model.Account;

@Repository
@RepositoryConfig(cacheName = "account")
public interface AccountRepo extends IgniteRepository<Account, Long> {
	
	List<Account> getAccountByFirstName(String firstName);
	List<Account> getAccountByLastName(String firstName);
	Account getAccountByAccountId (Long id);
}
