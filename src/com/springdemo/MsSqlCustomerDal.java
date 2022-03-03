package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class MsSqlCustomerDal  implements ICustomerDal{
	@Value("${database.connectionString}")
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	@Override
	public void add() {
		System.out.println("Connection string:" + connectionString);
		System.out.println("MS SQL veritaban�na eklendi.");
		
	}

}
