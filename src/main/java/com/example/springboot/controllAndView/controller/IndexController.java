package com.example.springboot.controllAndView.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")  // indica al root delle risorsa
public class IndexController {
    
    // qui andiamo ad realizzare i vari metodi
    // ricordo che per le applicazioni client stiamo utilizzando timelife
    // per cui le viste vanno inderite nella cartella templates, 
    // non si useranno delle jsp come avviene in una classica applicazione web
    
    /**
     *  questo metodo e lo stesso di sottto ma serve per gestire url root
     *  ovvero quando si passa solo url rotto si viene indirizzati alla pagina index
     *   
     * @param model
     * @return
     */

    @GetMapping
    public String getWelcome(Model model){	
	this.setModel(model);	
	return "index";
    }


  
    @GetMapping(value="index")
    public String getWelcome2(Model model){
	
	this.setModel(model);
	
	return "index";
    }
    
    private Model setModel(Model model) {
  	model.addAttribute("intestazione", "Benvenuti nel sito di test");
  	model.addAttribute("saluti", "Seleziona uno dei prodotti ");
  	
  	return model;
  	
      }


}
