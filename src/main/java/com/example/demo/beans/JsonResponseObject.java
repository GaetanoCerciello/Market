package com.example.demo.beans;

import java.io.Serializable;

public class JsonResponseObject implements Serializable {
	private static final long serialVersionUID = 1L;
	private String descrizione;
	private Integer codice;
	private Integer count;
	public JsonResponseObject() {}
	public JsonResponseObject(String descrizione, Integer codice, Integer count) {
		super();
		this.descrizione = descrizione;
		this.codice = codice;
		this.count = count;
	}
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
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "JsonResponseObject [descrizione=" + descrizione + ", codice=" + codice + ", count=" + count + "]";
	}
	
	
}
