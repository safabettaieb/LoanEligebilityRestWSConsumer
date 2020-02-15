package com.safa.loan.rest.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LoanEligebilityRestWsConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanEligebilityRestWsConsumerApplication.class, args);
	}

}
