package cbcc.mago;

import java.util.Random;

public class Guerreiro extends Personagem {
	
	public Guerreiro(){}
	
	protected int forca;
	
	public Guerreiro(String nome, int level){
		this.nome = nome;
		this.level = level;
		this.forca = 157+level*3;
	}
	
	EntrandoEmBatalha lutar;
	Random rand;
	Inimigo m2;
	
	public void batalhar(){
		
		do{
			System.out.printf(" entrou em batalha\n\n");
			System.out.printf("1. Atacar\n");
			System.out.printf("0. Defender\n\n");
			System.out.printf("Escolha uma das opcoes acima: ");
			System.out.write(opcao);
			switch(opcao){
				case 0: defender();
	                    break;
				case 1: atacar();
	                    if(hp>0 && m2.hp_ini>0){
	                        defender();
	                    }
	                    break;
				default: System.out.printf("\n\nOpcao invalida.\n\n");
	                    break;
			}
			
		}
		while((hp>0 && m2.hp_ini>0) && (opcao==0 || opcao==1));
	}
	
	public void atacar(){
	}
	
	public void defender(){
	}
}
