package br.senac.jogo;

import br.senac.jogo.combatentes.*;
import br.senac.jogo.combatentes.dragoes.*;
import br.senac.jogo.combatentes.humanos.Anjo;
import br.senac.batalhas.*;

public class Jogo {

	// Entidade => Representa alguma coisa
	// ** Têm muitos atributos
	// ** Métodos alteram/verificam os atributos
	// Serviço => Objeto que têm regras de negócio
	// ** Poucos atributos
	// ** Métodos complexos
	// Adaptador => Objeto que liga com infraestrutura de software
	
	public static void main(String[] args) throws InterruptedException {
		Combatente vencedor;
		
		// orc
		// dragao
		Combatente inimigo1 = new Orc();
		Combatente inimigo2 = new Anjo();
		System.out.println("Iniciando jogo com os inimigos:");
		System.out.println(inimigo1.getNome());
		System.out.println(inimigo2.getNome());
		System.out.println("\n");
	
		Batalha batalha = new Batalha(inimigo1, inimigo2);
		vencedor = batalha.lutar();
		System.out.println("Batalha normal => Vecendor: " + vencedor.getNome());
		
		System.out.println("Jogo finalizado!");
	}
}
