package org.zbm.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.zbm.kys.domain.Acente;
import org.zbm.kys.repository.AcenteRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AcenteRepositoryImpl implements AcenteRepository {

	@Override
	public Optional<Acente> findById(UUID id) {
		return acente(id);
	}

	private Optional<Acente> acente(UUID id) {
		Acente acente = new Acente();
		acente.setId(id);
		acente.setUnvan("En Birinci Acente");
		return Optional.ofNullable(acente);
	}

	@Override
	public UUID save(Acente acente) {
		return Optional.ofNullable(acente)
				.map(a -> a.getId())
				.orElse(acente(UUID.randomUUID())
						.get().getId());
	}

}
