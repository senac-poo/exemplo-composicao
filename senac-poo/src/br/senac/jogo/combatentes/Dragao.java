package br.senac.jogo.combatentes;

import br.senac.batalhas.Arma;

public abstract class Dragao extends Combatente 
	implements ISerVoador {
	
	public Dragao() {
		super("Dragao", 5, 50);
	}
	
	public Dragao(String nome) {
		super(nome, 5, 50);
	}
	
	@Override
	public void recebeAtaqueAereo(int ataque) {
		if(!desviaVoador()) {
			super.recebeAtaque(ataque);
		}
	}
	
	public void equipaArma(Arma arma) {
		throw new RuntimeException("Dragao não pode ter arma");
	}
}
