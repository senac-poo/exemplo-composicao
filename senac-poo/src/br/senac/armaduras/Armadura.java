package br.senac.armaduras;

import br.senac.batalhas.Tipo;

public abstract class Armadura {
	String nome;
	int valor;
	Tipo tipo;
	
	public Armadura(String nome, int valor, Tipo tipo) {
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}
}
