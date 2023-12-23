package org.zbm.kys;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zbm.kys.domain.Acente;
import org.zbm.kys.repository.AcenteRepository;
import org.zbm.kys.service.AcenteService;
import org.zbm.kys.service.AcenteServiceImpl;

public class MyServiceTest {

	private AcenteRepository acenteRepository;
	private AcenteService acenteService;

	@BeforeEach
	void setUp() {
		acenteRepository = mock(AcenteRepository.class);
		when(acenteRepository.findById(any())).thenReturn(Optional.ofNullable(new Acente()));
		acenteService = new AcenteServiceImpl(acenteRepository);
	}

	@Test
	public void contextLoads() {
		assertThat(acenteService.getAcente(UUID.randomUUID())).isNotNull();
	}

}
