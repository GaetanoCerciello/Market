package com.example.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.JsonRequestObject;
import com.example.demo.beans.JsonResponseObject;

@RestController
@RequestMapping("/jsonexa")
public class JsonExampleRestController {
	private static Logger log = LogManager.getLogger(JsonExampleRestController.class);
	private Integer count = 0;
	
	@PostMapping("/echo")
	public String echo(@RequestBody String json) {
		log.info("###### echo ricevuto => "+json);
		return json;
	}
	
	@PostMapping("/plain")
	public JsonResponseObject echoplain(@RequestParam Integer codice, String descrizione) {
		log.info("###### echoplain ricevuto => codice="+codice+" descrizione="+descrizione);
		return new JsonResponseObject(descrizione, codice, ++count);
	}
	
	@PostMapping("/echoobj")
	public JsonResponseObject echoobj(@RequestBody JsonRequestObject jro) {
		log.info("###### echoobj ricevuto => "+jro);
		return new JsonResponseObject(jro.getDescrizione(), jro.getCodice(), ++count);
	}
}
