package it.menu.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class MenuEntity {
	
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMenu;
	private String prezzo;
	@Column(nullable = true)
	private String prezzoDue;
	private String url;
	@Column(nullable = true)
	private String filtro;
	private String elencoAllergeni;
	
	
	
	@OneToMany(mappedBy = "menuEntity")
	@JsonBackReference
	private List<DescrizioneEntity> descrizioni = new ArrayList<>();
	
	
	public int getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}

	public String getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}

	public String getPrezzoDue() {
		return prezzoDue;
	}

	public void setPrezzoDue(String prezzoDue) {
		this.prezzoDue = prezzoDue;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	public String getFiltro() {
		return filtro;
	}

	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}

	public List<DescrizioneEntity> getDescrizioni() {
		return descrizioni;
	}

	public void setDescrizioni(List<DescrizioneEntity> descrizioni) {
		this.descrizioni = descrizioni;
	}

	public MenuEntity() {
		
	}
	
	public String getElencoAllergeni() {
		return elencoAllergeni;
	}

	public void setElencoAllergeni(String elencoAllergeni) {
		this.elencoAllergeni = elencoAllergeni;
	}
	
	public MenuEntity(int idMenu, String prezzo, String prezzoDue, String url, String filtro, String elencoAllergeni,
			List<DescrizioneEntity> descrizioni) {
		super();
		this.idMenu = idMenu;
		this.prezzo = prezzo;
		this.prezzoDue = prezzoDue;
		this.url = url;
		this.filtro = filtro;
		this.elencoAllergeni = elencoAllergeni;
		this.descrizioni = descrizioni;
	}

	
	
}