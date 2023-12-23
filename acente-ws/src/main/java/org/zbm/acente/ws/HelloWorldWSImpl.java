package org.zbm.acente.ws;

import java.util.UUID;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.stereotype.Component;
import org.zbm.kys.service.AcenteService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class HelloWorldWSImpl implements HelloWorldWS {

	private final AcenteService acenteService;
	private final ServletWebServerApplicationContext webServerAppCtxt;

	@Override
	public String createMessage(String name) {
		log.info("acente-ws:" + webServerAppCtxt.getWebServer().getPort());
		return "Hello " + acenteService.getAcente(UUID.randomUUID()).getUnvan();
	}
}