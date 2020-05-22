package br.senac.batalhas;

import java.util.Random;

public class Dado {
	static int ultimoValor;
	
	protected static int calculcarAtaque() {
		Random rand = new Random();
		ultimoValor = rand.nextInt(10);
		return ultimoValor;
	}
}
