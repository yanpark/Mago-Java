package cbcc.mago;

import java.util.Random;

public final class Ranger extends Guerreiro {
	
	public Ranger(){}
	
	public Ranger(String nome, int level){
		this.forca += 30;
	    this.hp += 20;
	}
	
	EntrandoEmBatalha lutar;
	Random rand;
	Inimigo m2;

	public void atacar(){
		
		System.out.printf(" %s atacou o inimigo\n\n", nome);;
		sucesso = rand.nextBoolean();
		if(sucesso){
			System.out.printf("Ataque bem sucedido!");
			if(forca<=m2.def_esp_ini){
				dano = (m2.def_esp_ini/(m2.def_esp_ini-forca))/2;
			}
			else if(forca>m2.def_esp_ini){
				dano = (forca-m2.def_esp_ini)*2;
			}
			m2.hp_ini -= dano;
			if(m2.hp_ini <= 0){
				dano += m2.hp_ini;
				System.out.printf("-%d de dano no inimigo\n", dano);
				m2.hp_ini = 0;
				System.out.printf("HP do inimigo: %d\n\n",m2.hp_ini);
				System.out.printf("Inimigo derrotado!\n\n");
			}
			else{
				System.out.printf("-%d de dano no inimigo\n", dano);
			}
		}
		else{
			System.out.printf("O inimigo se esquivou do ataque!\n\n");
		}
	}
	
	public void defender(){
		
		System.out.printf(" %s armou a defesa\n\n", nome);
		sucesso = rand.nextBoolean();
		if(sucesso){
			System.out.printf("Defesa bem sucedida!\n");
		}
		else{
			System.out.printf(" %s sofreu dano!", nome);
			if(m2.forca_ini<=defesa){
				dano = (defesa/(defesa-m2.forca_ini))/2;
			}
			else if(m2.forca_ini>defesa){
				dano = (m2.forca_ini-defesa)*2;
			}
			hp -= dano;
			if(hp > 0){
				System.out.printf("-%d HP\n", dano);
			}
			else{
				dano += hp;
				System.out.printf("-%d HP\n", dano); 
				System.out.printf("%s foi derrotado!\nFim de jogo!\n\n", nome);
				hp = 0;
			}
		}
		System.out.printf("HP de %s: %d\n",nome, hp);
		System.out.printf("HP do inimigo: %d\n\n", m2.hp_ini);
	}
}