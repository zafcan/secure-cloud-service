package org.zbm.acente.rs;

import java.util.UUID;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zbm.kys.service.AcenteService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/rs")
@RequiredArgsConstructor
@Slf4j
public class AcenteController {

	private final AcenteService acenteService;
	private final ServletWebServerApplicationContext webServerAppCtxt;

	@GetMapping("/")
	public String home(@RequestHeader("email")String email) {
		log.info("acente-rs:" + webServerAppCtxt.getWebServer().getPort());
		return "Hello " + acenteService.getAcente(UUID.randomUUID()).getUnvan() + ", " + email;
	}

	@GetMapping("/hello/{id}")
	public String hello(@PathVariable("id") String id, @RequestHeader("email")String email) {
		log.info("acente-rs:" + webServerAppCtxt.getWebServer().getPort());
		return "Hello " + id + ", " + email;
	}
}
