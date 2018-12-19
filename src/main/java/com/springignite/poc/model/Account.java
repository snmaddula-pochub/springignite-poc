package com.springignite.poc.model;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;
import static org.apache.commons.lang3.builder.ToStringStyle.SHORT_PREFIX_STYLE;

import java.io.Serializable;

import org.apache.ignite.cache.query.annotations.QuerySqlField;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	@QuerySqlField(index = true)
	private Long accountId;
	@QuerySqlField(index = true)
	private String firstName;
	@QuerySqlField(index = true)
	private String lastName;
	
	public Account() {
	}

	public Account(Long accountId, String firstName, String lastName) {
		this.accountId = accountId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return reflectionToString(this, SHORT_PREFIX_STYLE);
	}
}
