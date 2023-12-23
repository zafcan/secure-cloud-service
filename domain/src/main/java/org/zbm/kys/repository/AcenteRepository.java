package org.zbm.kys.repository;

import java.util.Optional;
import java.util.UUID;

import org.zbm.kys.domain.Acente;

public interface AcenteRepository {

	Optional<Acente> findById(UUID id);

	UUID save(Acente acente);
}
