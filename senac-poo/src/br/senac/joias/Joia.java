package br.senac.joias;

import br.senac.batalhas.Tipo;

public class Joia {
	String nome;
	int valor;
	Tipo tipo;
	
	public Joia() {
		
	}
	
	public Joia(String nome, Tipo tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}	
}
