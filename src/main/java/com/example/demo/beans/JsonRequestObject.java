package com.example.demo.beans;

import java.io.Serializable;

public class JsonRequestObject implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String descrizione;
	private Integer codice;
	
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Integer getCodice() {
		return codice;
	}
	public void setCodice(Integer codice) {
		this.codice = codice;
	}
	@Override
	public String toString() {
		return "JsonInputObject [descrizione=" + descrizione + ", codice=" + codice + "]";
	}
	
}
