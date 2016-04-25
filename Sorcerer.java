package cbcc.mago;

import java.util.Random;

public final class Sorcerer extends Mago {
	
	public Sorcerer(){}
	
	public Sorcerer(String nome, int level){
		this.hp += 10;
	    this.magia += 30;
	    this.auxHP = hp;
	}
	
	EntrandoEmBatalha lutar;
	Random rand;
	Inimigo m2;
}
