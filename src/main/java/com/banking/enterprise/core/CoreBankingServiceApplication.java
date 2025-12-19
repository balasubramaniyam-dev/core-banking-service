package com.banking.enterprise.core;

import com.corebanking.model.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.banking.enterprise",
        "com.corebanking"
})
public class CoreBankingServiceApplication {

	public static void main(String[] args) {
        SpringApplication.run(CoreBankingServiceApplication.class, args);
        Account account = null;
	}

}
