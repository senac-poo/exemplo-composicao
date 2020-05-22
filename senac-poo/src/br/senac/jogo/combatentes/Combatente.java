package br.senac.jogo.combatentes;

import java.util.Random;

import br.senac.armaduras.Armadura;
import br.senac.armas.Arma;
import br.senac.batalhas.Ataque;
import br.senac.batalhas.Defesa;
import br.senac.batalhas.Tipo;
import br.senac.joias.Joia;

public abstract class Combatente {
	protected Random rand = new Random();
	protected int vida;
	protected int forca;
	protected int defesa ;
	protected Tipo tipo;
	protected String nome;
	Arma arma;
	Armadura armadura;
	Joia joia;
	
	public Combatente() {
		this.vida = 50 + rand.nextInt(50);
		this.forca = 5 + rand.nextInt(5);
		this.defesa = 5 + rand.nextInt(5);
		this.nome = "Combatente";
		this.tipo = Tipo.FORCA;
	}
	
	// construtor estatico
	public Combatente(String nome, int forcaMinima, int vidaMinima) {
		this.nome = nome;
		this.forca = forcaMinima + rand.nextInt(5);
		this.vida = vidaMinima + rand.nextInt(50);
		this.defesa = 5 + rand.nextInt(5);
		this.tipo = Tipo.FORCA;
	}
	
	public void equipaArma(Arma arma) {
		this.arma = arma;
	}
	
	public void equipaArmadura(Armadura armadura) {
		this.armadura = armadura;
	}	
	
	public void recebeAtaque(int forca) {
		if(forca > vida) {
			vida = 0;
		} else {
			System.out.println(this.nome + " recebeu ataque de " + String.valueOf(forca));
			vida -= forca;
		}
	}
	
	public void recebeAtaque(Ataque ataque) {
		Defesa defesa = new Defesa(this.tipo, this.defesa);
		int forca = defesa.defende(ataque);
		recebeAtaque(forca);
	}
	
	public Ataque atacar() {
		Ataque ataque = new Ataque(tipo, forca);
		
		if(arma != null) {
			arma.setAtaque(ataque);
		}
		
		return ataque;
	}
	
	public boolean estaMorto() {
		return this.vida == 0;
	}
	
	public boolean estaVivo() {
		return this.vida > 0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getVida() {
		return vida;
	}
}
