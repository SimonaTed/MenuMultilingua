package it.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.menu.entity.AllergeniEntity;
import it.menu.entity.DescrizioneEntity;
import it.menu.entity.LinguaEntity;
import it.menu.entity.StrutturaEntity;
import it.menu.repository.AllergeniRepository;
import it.menu.repository.DescrizioneRepository;
import it.menu.repository.LinguaRepository;
import it.menu.repository.StrutturaRepository;

@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	DescrizioneRepository descrizioneRepository;
	
	@Autowired
	LinguaRepository linguaRepository;
	
	@Autowired
	StrutturaRepository strutturaRepository;
	
	@Autowired
	AllergeniRepository allergeniRepository;
	
	@Override
	public List<DescrizioneEntity> findDescrizioneByLingua(String sigla){
		return descrizioneRepository.findDescrizioneEntitiesByLinguaEntity_Sigla(sigla);
	}

	@Override
	public List<LinguaEntity> findAllLingua() {
		return linguaRepository.findAll();
	}

	@Override
	public LinguaEntity findByLingua(String sigla) {
		return linguaRepository.findBySigla(sigla);
	}

	@Override
	public List<StrutturaEntity> findStrutturaEntityByLingua(String sigla) {
		return (List<StrutturaEntity>) strutturaRepository.findStrutturaEntitiesByDescrizioni_LinguaEntity_Sigla(sigla);
	}

	@Override
	public List<AllergeniEntity> findAllergeniByLingua(String sigla) {
		return (List<AllergeniEntity>) allergeniRepository.findAllergeniEntitiesByLinguaEntity_Sigla(sigla);
	}
	
	
	
	

}
