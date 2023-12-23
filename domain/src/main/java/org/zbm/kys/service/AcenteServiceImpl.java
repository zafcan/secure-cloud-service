package org.zbm.kys.service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.zbm.kys.domain.Acente;
import org.zbm.kys.repository.AcenteRepository;

@Service
public class AcenteServiceImpl implements AcenteService {

	private final AcenteRepository acenteRepository;

	public AcenteServiceImpl(AcenteRepository acenteRepository) {
		this.acenteRepository = acenteRepository;
	}

	@Override
	public Acente getAcente(UUID id) {
		return acenteRepository.findById(id).orElse(null);
	}

	@Override
	public UUID createAcente(Acente acente) {
		return acenteRepository.save(acente);
	}
}
