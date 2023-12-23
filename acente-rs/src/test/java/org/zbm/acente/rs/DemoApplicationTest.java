package org.zbm.acente.rs;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zbm.kys.service.AcenteService;

@SpringBootTest
public class DemoApplicationTest {

	@Autowired
	private AcenteService acenteService;

	@Test
	public void contextLoads() {
		assertThat(acenteService.getAcente(UUID.randomUUID())).isNotNull();
	}

}
