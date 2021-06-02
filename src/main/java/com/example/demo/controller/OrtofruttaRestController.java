package com.example.demo.controller;

import java.util.List;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Merce;
import com.example.demo.repository.MerceRepository;

@RestController
@RequestMapping("/orto")
public class OrtofruttaRestController {

	private static Logger log = LogManager.getLogger(MarketTestController.class);

	@Autowired
	MerceRepository mrepo;

	@GetMapping("/lista")
	public List<Merce> test01() {
		log.info("OrtofruttaRestController.test01");
		return mrepo.findMerceByRepartoSigla("ORTO");
	}

}
