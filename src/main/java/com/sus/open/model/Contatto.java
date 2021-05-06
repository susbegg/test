package com.sus.open.model;

import java.io.Serializable;

public class Contatto implements Serializable{

	private static final long serialVersionUID = -3858424591169265697L;
	private String nome;
	private String cognome;
	private String username;
	public Contatto(String nome, String cognome, String username) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
	}
	public Contatto() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
