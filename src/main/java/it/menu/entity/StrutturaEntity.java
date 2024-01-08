package it.menu.entity;

import java.util.ArrayList;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;



@Entity
public class StrutturaEntity {





	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idStrutturaEntity;
	private String sottoSezione;
	@Column(nullable = true)
	private String sezione;
	private int aggregante;
	
	@OneToMany(mappedBy = "strutturaEntity")
	@JsonBackReference
	private List<DescrizioneEntity> descrizioni = new ArrayList<>();
	
	public StrutturaEntity(int idStrutturaEntity, String sottoSezione, String sezione, int aggregante,
			List<DescrizioneEntity> descrizioni) {
		super();
		this.idStrutturaEntity = idStrutturaEntity;
		this.sottoSezione = sottoSezione;
		this.sezione = sezione;
		this.aggregante = aggregante;
		this.descrizioni = descrizioni;
	}
	
	public StrutturaEntity() {
		
	}
	
	public StrutturaEntity(String sottoSezione) {
		this.sottoSezione=sottoSezione;
	}
	
	public StrutturaEntity(String sottoSezione, String sezione) {
		this.sottoSezione = sottoSezione;
		this.sezione = sezione;
	}
	
	
	public String getSottoSezione() {
		return sottoSezione;
	}
	public void setSottoSezione(String sottoSezione) {
		this.sottoSezione = sottoSezione;
	}
	public String getSezione() {
		return sezione;
	}
	public void setSezione(String sezione) {
		this.sezione = sezione;
	}


	public int getIdStrutturaEntity() {
		return idStrutturaEntity;
	}

	public void setIdStrutturaEntity(int idStrutturaEntity) {
		this.idStrutturaEntity = idStrutturaEntity;
	}

	public int getAggregante() {
		return aggregante;
	}

	public void setAggregante(int aggregante) {
		this.aggregante = aggregante;
	}

	public List<DescrizioneEntity> getDescrizioni() {
		return descrizioni;
	}

	public void setDescrzioni(List<DescrizioneEntity> descrizioni) {
		this.descrizioni = descrizioni;
	}



	
}
