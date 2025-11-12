package com.luxoft.springioc.example35;

import com.luxoft.springioc.dependencies.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Bean
	public Person johnson() {
		return new Person();
	}

	@Bean
	public ClientService clientService() {

		return new ClientServiceImpl();
	}

	@Bean
	public ClientDao clientDao() {

		return new ClientDaoImpl();
	}

}
