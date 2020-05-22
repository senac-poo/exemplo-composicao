package br.senac.batalhas;

import java.util.HashSet;
import java.util.Set;

public class Ataque {
	//Set<Tipo> tipoAtaque = new HashSet<Tipo>();
	Tipo tipo;
	int forca;
	
	public Ataque(Tipo tipo, int forca) {
		this.forca = forca + Dado.calculcarAtaque();
		//tipoAtaque.add(tipo);
		this.tipo = tipo;
	}
	
	public void incluiTipo(Tipo tipo) {
		//tipoAtaque.add(tipo);
		this.tipo = tipo;
	}
	
	public void aumentaForca(int forcaAdicional) {
		forca += forcaAdicional;
	}
	
	public int getForca() {
		return forca;
	}
	
	public boolean temTipo(Tipo tipo) {
		return this.tipo.equals(tipo);
	}
}