package org.zbm.acente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.zbm")
public class AcenteSoapServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcenteSoapServiceApplication.class, args);
	}
}
