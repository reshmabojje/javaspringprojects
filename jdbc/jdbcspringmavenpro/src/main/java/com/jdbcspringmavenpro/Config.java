package com.jdbcspringmavenpro;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com")
@PropertySource(value="classpath:app.properties")
public class Config {

	@Bean("dataSource")
	public DataSource getDataSource()
	{
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setUrl("jdbc:mysql://localhost:3306/jdbc");
		dmds.setUsername("root");
		dmds.setPassword("Reshma@13");
		return dmds;
	}
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		return jdbcTemplate;
	}
}
