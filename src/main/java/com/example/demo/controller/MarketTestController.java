package com.example.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entities.Reparto;
import com.example.demo.repository.RepartoRepository;


@Controller
@RequestMapping("/demo")
public class MarketTestController {

	@Autowired RepartoRepository rrepo;
	
	private static Logger log = LogManager.getLogger(MarketTestController.class);
	
	@GetMapping("/test")//http://localhost:8080/demo/test */
	
	public String test01() {
		return "Markettest"; //deve essere il nome della JSP.
	}
	
	@GetMapping("/dbtest")
	public String databaseTest(Model model){
		Reparto reparto=rrepo.findRepartoBySigla("ORTO");
		log.info("**** Test Reparto:"+reparto);
		model.addAttribute("reparto",reparto);
		
		return "databasetest";
	}

}
