package org.zbm.acente.ws;

import java.util.UUID;

import org.springframework.stereotype.Component;
import org.zbm.kys.service.AcenteService;

@Component
public class HelloWorldWSImpl implements HelloWorldWS {
	private AcenteService acenteService;

	public HelloWorldWSImpl(AcenteService acenteService) {
		this.acenteService = acenteService;
	}

	@Override
	public String createMessage(String name) {
		return "Hello " + acenteService.getAcente(UUID.randomUUID()).getUnvan();
	}
}