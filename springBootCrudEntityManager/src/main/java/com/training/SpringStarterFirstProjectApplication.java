package com.training;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringStarterFirstProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringStarterFirstProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
