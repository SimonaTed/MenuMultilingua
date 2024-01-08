package it.menu.service;

import java.util.List;

import it.menu.entity.DescrizioneEntity;
import it.menu.entity.LinguaEntity;
import it.menu.entity.StrutturaEntity;

public interface MenuService {

	List<DescrizioneEntity> findDescrizioneByLingua(String lingua);

	List<LinguaEntity> findAllLingua();
	
	LinguaEntity findByLingua(String sigla);
	
	List<StrutturaEntity> findStrutturaEntityByLingua(String sigla);
}
