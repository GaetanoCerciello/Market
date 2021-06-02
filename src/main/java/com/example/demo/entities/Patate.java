package com.example.demo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("patate")
public class Patate extends Verdura {

	
	private static final long serialVersionUID = 1L;
	

	public Patate(String descrizione, float prezzoUnitario, String colore) {
		super(descrizione, prezzoUnitario,Pesatura.DA_PESARE, colore);
	}
	

}
