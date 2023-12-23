package org.zbm.acente.rs;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zbm.kys.service.AcenteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AcenteController {

	private final AcenteService acenteService;

	@GetMapping("/")
	public String home() {
		return "Hello " + acenteService.getAcente(UUID.randomUUID()).getUnvan();
	}
}
