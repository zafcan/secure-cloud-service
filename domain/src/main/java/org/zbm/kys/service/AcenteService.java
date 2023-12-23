package org.zbm.kys.service;

import java.util.UUID;

import org.zbm.kys.domain.Acente;

public interface AcenteService {

	Acente getAcente(UUID id);

	UUID createAcente(Acente acente);
}
