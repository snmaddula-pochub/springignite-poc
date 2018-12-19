package com.springignite.poc;

import java.util.HashMap;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springignite.poc.model.Account;
import com.springignite.poc.repo.AccountRepo;

public class SpringIgniteApp {
	
	private static final String FIRSTNAME = "Alpha";
	private static final String LASTNAME = "Omega";

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
			context.register(AppIgniteConfig.class);
			context.refresh();

			AccountRepo accountRepo = context.getBean(AccountRepo.class);
			
			//1. Save an Account
			Account account1 = new Account(1L, "Alpha", "Omega");
			Account account2 = new Account(2L, "Alpha", "B");
			Account account3 = new Account(3L, "Alpha_3", "Omega");
			
			accountRepo.save(new HashMap<Long, Account>() {{
				put(account1.getAccountId(), account1);
				put(account2.getAccountId(), account2);
				put(account3.getAccountId(), account3);
			}});
			
			
			System.out.println("************ Accounts by FirstName : " + FIRSTNAME);
			accountRepo.getAccountByFirstName(FIRSTNAME).forEach(System.out::println);
			
			System.out.println("************ Accounts by LastName : " + LASTNAME);
			accountRepo.getAccountByLastName(LASTNAME).forEach(System.out::println);

		}
		
		
	}


}
