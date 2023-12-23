package org.zbm.acente.ws;

import java.util.UUID;

import org.springframework.stereotype.Component;
import org.zbm.kys.service.AcenteService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class HelloWorldWSImpl implements HelloWorldWS {

	private final AcenteService acenteService;

	@Override
	public String createMessage(String name) {
		return "Hello " + acenteService.getAcente(UUID.randomUUID()).getUnvan();
	}
}