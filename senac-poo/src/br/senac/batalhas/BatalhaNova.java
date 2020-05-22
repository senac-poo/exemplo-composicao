package br.senac.batalhas;

import br.senac.jogo.combatentes.Combatente;

public class BatalhaNova {

	protected Combatente c1;
	protected Combatente c2;
	
	public BatalhaNova(Combatente inimigo1, Combatente inimigo2) {
		this.c1 = inimigo1;
		this.c2 = inimigo2;
	}
	
	public Combatente lutar() throws InterruptedException {
		while(batalhaContinua()) {
			Ataque ataque1 = c1.atacar();
			//System.out.println("Será desferido um ataque de " + String.valueOf(ataque) + " pontos em " + inimigo1.getNome());
			c2.recebeAtaque(ataque1);
			
			if(batalhaContinua()) {
				Ataque ataque2 = c2.atacar();
				//System.out.println("Será desferido um ataque de " + String.valueOf(ataque) + " pontos em " + inimigo2.getNome());
				c1.recebeAtaque(ataque2);
			}
			
			//System.out.println("Energia dos combatentes:");
			//System.out.println(inimigo1.getNome() + ": " + String.valueOf(inimigo1.getVida()));
			//System.out.println(inimigo2.getNome() + ": " + String.valueOf(inimigo2.getVida()));
			
			Thread.sleep(500);
			//System.out.println("\n");
		}
		
		return retonarVencedor();
	}
	
	protected boolean batalhaContinua() {
		return c1.estaVivo() && c2.estaVivo();
	}
	
	
	protected Combatente retonarVencedor() {
		return (c1.estaVivo() ? c1 : c2);
	}
}
