package br.senac.armas;

import br.senac.batalhas.Tipo;

public class Espada extends Arma {
	public Espada() {
		super();
		this.setNome("Espada de Metal");
		this.setTipo(Tipo.FORCA);
		this.setValorAtaque(3);
	}
}
