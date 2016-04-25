package cbcc.mago;

import java.util.Random;

public final class Wizard extends Mago {
	
	public Wizard(){}
	
	public Wizard(String nome, int level){
		this.hp += 10;
	    this.magia += 30;
	    this.auxHP = hp;
	}
	
	EntrandoEmBatalha lutar;
	Random rand;
	Inimigo m2;
}