package com.reor.vitivinicola.dao;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Conectar{
	
	
	public DriverManagerDataSource conectar() {
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/vitivinicola");
		dataSource.setUsername("root");
		dataSource.setPassword("susy123");
		return dataSource;
	}
}