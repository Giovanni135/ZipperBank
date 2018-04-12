package io.zipcoder;

import io.zipcoder.domain.Account;
import io.zipcoder.repositories.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ZcwbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZcwbankApplication.class, args);
	}

}

