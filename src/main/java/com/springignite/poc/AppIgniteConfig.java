package com.springignite.poc;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.springdata.repository.config.EnableIgniteRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springignite.poc.model.Account;
import com.springignite.poc.repo.AccountRepo;

@Configuration
@ComponentScan(basePackages = { "com.springignite.poc" })
@EnableIgniteRepositories(basePackageClasses = { AccountRepo.class })
public class AppIgniteConfig {

	@Bean
	public Ignite igniteInstance() {
		IgniteConfiguration igniteConfig = new IgniteConfiguration();
		igniteConfig.setIgniteInstanceName("spring-ignite-poc");
		igniteConfig.setPeerClassLoadingEnabled(false);

		CacheConfiguration<Long, Account> accountCache = new CacheConfiguration<>("account");
		accountCache.setIndexedTypes(Long.class, Account.class);

		igniteConfig.setCacheConfiguration(new CacheConfiguration[] { accountCache });

		return Ignition.start(igniteConfig);
	}
}
