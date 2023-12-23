package org.zbm.acente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.zbm")
public class AcenteRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcenteRestServiceApplication.class, args);
	}
}
