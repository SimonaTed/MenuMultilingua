package it.menu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class DescrizioneEntity {
	
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDescrizione;
	private String nome;
	@Column(nullable = true)
	private String ingrediente;
	@Column(nullable = true)
	private String dimensione;
	@Column(nullable = true)
	private String dimensioneDue;
	
	@ManyToOne
	private MenuEntity menuEntity;
	
	@ManyToOne
	private LinguaEntity linguaEntity;
	
	@ManyToOne
	private StrutturaEntity strutturaEntity;
	
	
	public DescrizioneEntity(int idDescrizione, String nome, String ingrediente, String dimensione,
			String dimensioneDue, MenuEntity menuEntity, LinguaEntity linguaEntity, StrutturaEntity strutturaEntity) {
		super();
		this.idDescrizione = idDescrizione;
		this.nome = nome;
		this.ingrediente = ingrediente;
		this.dimensione = dimensione;
		this.dimensioneDue = dimensioneDue;
		this.menuEntity = menuEntity;
		this.linguaEntity = linguaEntity;
		this.strutturaEntity = strutturaEntity;
	}
	
	public DescrizioneEntity() {
		
	}
	
	public int getIdDescrizione() {
		return idDescrizione;
	}
	
	public void setIdDescrizione(int idDescrizione) {
		this.idDescrizione = idDescrizione;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}
	
	public String getDimensione() {
		return dimensione;
	}
	
	public void setDimensione(String dimensione) {
		this.dimensione = dimensione;
	}

	public String getDimensioneDue() {
		return dimensioneDue;
	}

	public void setDimensioneDue(String dimensioneDue) {
		this.dimensioneDue = dimensioneDue;
	}

	public MenuEntity getMenuEntity() {
		return menuEntity;
	}

	public void setMenuEntity(MenuEntity menuEntity) {
		this.menuEntity = menuEntity;
	}

	public LinguaEntity getLinguaEntity() {
		return linguaEntity;
	}

	public void setLinguaEntity(LinguaEntity linguaEntity) {
		this.linguaEntity = linguaEntity;
	}

	public StrutturaEntity getStrutturaEntity() {
		return strutturaEntity;
	}

	public void setStrutturaEntity(StrutturaEntity strutturaEntity) {
		this.strutturaEntity = strutturaEntity;
	}
	

}
