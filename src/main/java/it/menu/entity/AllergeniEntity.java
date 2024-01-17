package it.menu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class AllergeniEntity {
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAllergeni;
	private String numeroAllergeni;
	private String descrizione;
	
	@ManyToOne
	private LinguaEntity linguaEntity;
	
	public AllergeniEntity(int idAllergeni, String numeroAllergeni, String descrizione, LinguaEntity linguaEntity) {
		super();
		this.idAllergeni = idAllergeni;
		this.numeroAllergeni = numeroAllergeni;
		this.descrizione = descrizione;
		this.linguaEntity = linguaEntity;
	}
	
	public AllergeniEntity() {
	}
	
	
	public int getIdAllergeni() {
		return idAllergeni;
	}

	public void setIdAllergeni(int idAllergeni) {
		this.idAllergeni = idAllergeni;
	}

	public String getNumeroAllergeni() {
		return numeroAllergeni;
	}

	public void setNumeroAllergeni(String numeroAllergeni) {
		this.numeroAllergeni = numeroAllergeni;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public LinguaEntity getLinguaEntity() {
		return linguaEntity;
	}

	public void setLinguaEntity(LinguaEntity linguaEntity) {
		this.linguaEntity = linguaEntity;
	}

}
