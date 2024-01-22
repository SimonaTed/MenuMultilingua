package it.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import it.menu.entity.AllergeniEntity;
import it.menu.entity.DescrizioneEntity;
import it.menu.entity.LinguaEntity;
import it.menu.entity.StrutturaEntity;
import it.menu.service.MenuService;



@RestController
public class MenuController {
	/*@CrossOrigin (origins= "http://localhost:8080") bisognerà mettere 5000 forse il percorso?*/
	@Autowired
	MenuService menuService;
	
	
	@GetMapping("/menu")
	public ModelAndView home(Model model) {
		ModelAndView mav = new ModelAndView("menu");
		List<LinguaEntity> lingue = menuService.findAllLingua();
		mav.addObject("lingue", lingue);
		return mav;
	}
	
	
	@GetMapping("/menu-freetto/{sigla}")
	public ModelAndView getPiattiLingua(@PathVariable String sigla) {
		ModelAndView mav = new ModelAndView("menu-freetto");
		List<DescrizioneEntity> descrizioni = menuService.findDescrizioneByLingua(sigla);
		mav.addObject("descrizioni", descrizioni);
		LinguaEntity linguaTrovata = menuService.findByLingua(sigla);
		mav.addObject("lingua", linguaTrovata);
		List<StrutturaEntity> strutture = menuService.findStrutturaEntityByLingua(sigla);
		mav.addObject("strutture",strutture);
		List<AllergeniEntity> allergeni = menuService.findAllergeniByLingua(sigla);
		mav.addObject("allergeni", allergeni);
		return mav;
	}
	
	
	
}
