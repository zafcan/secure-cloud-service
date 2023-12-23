package org.zbm.kys.service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.zbm.kys.domain.Acente;
import org.zbm.kys.repository.AcenteRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AcenteServiceImpl implements AcenteService {

	private final AcenteRepository acenteRepository;

	@Override
	public Acente getAcente(UUID id) {
		return acenteRepository.findById(id).orElse(null);
	}

	@Override
	public UUID createAcente(Acente acente) {
		return acenteRepository.save(acente);
	}
}
