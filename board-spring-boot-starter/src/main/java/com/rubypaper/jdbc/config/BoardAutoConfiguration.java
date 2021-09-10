package com.rubypaper.jdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rubypaper.jdbc.util.JDBCConnectionManager;

@Configuration
public class BoardAutoConfiguration {

	@Bean
	public JDBCConnectionManager getJDBCConnectionManager() {
		JDBCConnectionManager manager = new JDBCConnectionManager();
		manager.setDriverClass("com.mysql.cj.jdbc.Driver");
		manager.setUrl("jdbc:mysql://localhost/studydb?serverTimezone=UTC");
		manager.setUsername("study");
		manager.setPassword("1111");
		return manager;
	}
}
