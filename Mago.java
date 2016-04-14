package cbcc.mago;

public class Mago extends Personagem{
	
	public Mago(){}
	
	protected int magia;
	protected int mana;
	protected int contEspecial;
	protected int auxHP;
	
	public Mago(String nome, int level){
		this.nome = nome;
		this.level = level;
		this.magia = 145+level*3;
	    this.mana = 290+level*10;
	    this.contEspecial = 0;
	}
	
	EntrandoEmBatalha lutar;
	Inimigo m1;
	
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
	                    if(hp>0 && m1.hp_ini>0){
	                        defender();
	                    }
	                    break;
				default: System.out.printf("\n\nOpcao invalida.\n\n");
	                    break;
			}
			
		}
		while((hp>0 && m1.hp_ini>0) && (opcao==0 || opcao==1));
	}
	
	public void atacar(){
		
		System.out.printf(" %s atacou o inimigo\n-20 Mana\n\n", nome);
		mana -= 20;
		sucesso = rand.nextBoolean();
		if(mana>0){
			if(sucesso){
				System.out.printf("Ataque bem sucedido!\n");
				if(magia<=m1.hp_ini){
					dano = (m1.def_esp_ini/(m1.def_esp_ini-magia))/2;
				}
				else if(magia>m1.def_esp_ini){
					dano = (magia-m1.def_esp_ini)*2;
				}
				m1.hp_ini -= dano;
				if(m1.hp_ini <= 0){
					dano += m1.hp_ini;
					System.out.printf("-%d de dano no inimigo\n\n", dano);
					m1.hp_ini = 0;
					System.out.printf("HP do inimigo: %d\n", m1.hp_ini);
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
		else{
			System.out.printf("Mana esgotada! %s nao pode atacar!\n\n", nome);
		}
	}
	
	public void atacar(boolean sucesso){
	}
	
	public void defender(){
		
		System.out.printf(" %s armou a defesa\n\n", nome);
		sucesso = rand.nextBoolean();
		if(sucesso){
			System.out.printf("Defesa bem sucedida!\n");
			System.out.printf("+10 Mana\n");
			mana += 10;
		}
		else{
			System.out.printf(" %s sofreu dano!", nome);
			if(m1.forca_ini<=defesa){
				dano = (defesa/(defesa-m1.forca_ini))/2;
			}
			else if(m1.forca_ini>defesa){
				dano = (m1.forca_ini-defesa)*2;
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
		System.out.printf("Mana de %s: %d", nome, mana);
		System.out.printf("HP do inimigo: %d\n\n", m1.hp_ini);
	}
}
