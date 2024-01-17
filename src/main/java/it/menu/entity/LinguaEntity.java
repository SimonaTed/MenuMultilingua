package it.menu.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class LinguaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLingua;
	private String sigla;
	private String urlBandiera;
	private String sottotitolo;
	private String benvenuto;
	private String avvertenze;
	private String allergeni;
	@Column(columnDefinition = "VARCHAR(700)")
	private List<String> listaAllergeni;
	
	@OneToMany(mappedBy = "linguaEntity")
	@JsonBackReference
	private List<DescrizioneEntity> descrizioni = new ArrayList<>();

	public LinguaEntity(int idLingua, String sigla, String urlBandiera, String sottotitolo, String benvenuto,
			String avvertenze, String allergeni, List<String> listaAllergeni, List<DescrizioneEntity> descrizioni) {
		super();
		this.idLingua = idLingua;
		this.sigla = sigla;
		this.urlBandiera = urlBandiera;
		this.sottotitolo = sottotitolo;
		this.benvenuto = benvenuto;
		this.avvertenze = avvertenze;
		this.allergeni = allergeni;
		this.listaAllergeni = listaAllergeni;
		this.descrizioni = descrizioni;
	}
	
	public LinguaEntity() {
		
	}
	
	public int getIdLingua() {
		return idLingua;
	}

	public void setIdLingua(int idLingua) {
		this.idLingua = idLingua;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getUrlBandiera() {
		return urlBandiera;
	}

	public void setUrlBandiera(String urlBandiera) {
		this.urlBandiera = urlBandiera;
	}

	public String getSottotitolo() {
		return sottotitolo;
	}

	public void setSottotitolo(String sottotitolo) {
		this.sottotitolo = sottotitolo;
	}

	public String getBenvenuto() {
		return benvenuto;
	}

	public void setBenvenuto(String benvenuto) {
		this.benvenuto = benvenuto;
	}

	public String getAvvertenze() {
		return avvertenze;
	}

	public void setAvvertenze(String avvertenze) {
		this.avvertenze = avvertenze;
	}

	public String getAllergeni() {
		return allergeni;
	}

	public void setAllergeni(String allergeni) {
		this.allergeni = allergeni;
	}

	public List<DescrizioneEntity> getDescrizioni() {
		return descrizioni;
	}

	public void setDescrizioni(List<DescrizioneEntity> descrizioni) {
		this.descrizioni = descrizioni;
	}

	public List<String> getListaAllergeni() {
		return listaAllergeni;
	}

	public void setListaAllergeni(List<String> listaAllergeni) {
		this.listaAllergeni = listaAllergeni;
	}
	
	

}
