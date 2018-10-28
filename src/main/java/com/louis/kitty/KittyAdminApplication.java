package com.louis.kitty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.louis.kitty"})
public class KittyAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(KittyAdminApplication.class, args);
	}
}
