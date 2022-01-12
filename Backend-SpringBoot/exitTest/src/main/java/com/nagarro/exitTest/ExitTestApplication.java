package com.nagarro.exitTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExitTestApplication implements CommandLineRunner {
	@Autowired

	public static void main(String[] args) {
		SpringApplication.run(ExitTestApplication.class, args);

	}

	/**
	 * Run.
	 *
	 * @param args the args
	 * @throws Exception the exception
	 */
	@Override
	public void run(String... args) throws Exception {

	}

}
