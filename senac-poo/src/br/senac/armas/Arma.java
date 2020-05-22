package br.senac.armas;

import br.senac.batalhas.Ataque;
import br.senac.batalhas.Tipo;

public abstract class Arma {
	String nome;
	int valor;
	Tipo tipo;
	
	public Arma() {
		
	}
	
	public Arma(String nome, int valor, Tipo tipo) {
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public void setValorAtaque(int valor) {
		this.valor = valor;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public void setAtaque(Ataque ataque) {
		ataque.aumentaForca(valor);
		ataque.incluiTipo(tipo);
	}
}
