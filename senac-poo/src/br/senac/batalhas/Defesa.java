package br.senac.batalhas;

import java.util.HashSet;
import java.util.Set;

public class Defesa {
	//Set<Tipo> tipoDefesa = new HashSet<Tipo>();
	Tipo tipo;
	int defesa;
	
	public Defesa(Tipo tipo, int defesa) {
		this.defesa = defesa + Dado.calculcarAtaque();
		//tipoDefesa.add(tipo);
		this.tipo = tipo;
	}
	
	public void incluiTipo(Tipo tipo) {
		//tipoDefesa.add(tipo);
		this.tipo = tipo;
	}
	
	public void aumentaDefesa(int defesaAdicional) {
		defesa += defesaAdicional;
	}
	
	public int getForca() {
		return defesa;
	}
	
	public int defende(Ataque ataque) {
	    double valorAtaque = 0;

	    if(ataque.temTipo(Tipo.FOGO) && tipo == Tipo.GELO){
	      valorAtaque = ataque.getForca()*1.1 - defesa;
	    } else if(ataque.temTipo(Tipo.GELO) && tipo == Tipo.FOGO){
	      valorAtaque = ataque.getForca() - defesa*1.1;
	    } else {
	      valorAtaque = ataque.getForca() - defesa;
	    }

	    if(valorAtaque > 0) {
	      return (int)valorAtaque;
	    } else {
	      return 0;
	    }
	}
}