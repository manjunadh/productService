package com.marks.microservices.productService.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ProductServiceConfig {
	@Autowired
	private Environment env;

	@Bean
	public DataSource dataSource() throws SQLException {

		/*
		 * OracleDataSource dataSource = new OracleDataSource();
		 * dataSource.setUser(env.getRequiredProperty("db.username"));
		 * dataSource.setPassword(env.getRequiredProperty("db.password"));
		 * dataSource.setURL(env.getRequiredProperty("db.url"));
		 * dataSource.setImplicitCachingEnabled(true);
		 * dataSource.setFastConnectionFailoverEnabled(true);
		 */

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getRequiredProperty("db.driverClassName"));
		dataSource.setUrl(env.getRequiredProperty("db.url"));
		dataSource.setUsername(env.getRequiredProperty("db.username"));
		dataSource.setPassword(env.getRequiredProperty("db.password"));
		return dataSource;
	}

}
