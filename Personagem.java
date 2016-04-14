package cbcc.mago;
import java.util.Scanner;
import java.util.Random;

public abstract class Personagem implements EntrandoEmBatalha{
	
	protected String nome;
	protected int hp;
	protected int level;
	protected int defesa;
	protected int defesaEspecial;
	protected String item;
	protected int opcao;
	protected int dano;
	protected boolean xp;
	protected boolean sucesso;
	protected int itemInventario;
	protected int cont;
	protected int quantItens;
	protected int aux;
	protected static int numeroDePersonagens = 0;
	protected String ptr_inventario;
	protected String nomeItens;
	
	Scanner ler = new Scanner(System.in);
	EntrandoEmBatalha lutar;
	Random rand;
	
	public Personagem(){}
	
	public Personagem(String nome, int level){
		this.nome = nome;
		this.level = level;
		this.hp = 195+level*5;
		this.defesa = 84+level;
		this.defesaEspecial = 115+level*2;
		this.quantItens = 40;
		this.aux = 0;
		this.itemInventario = 7;
		this.cont = 0;
	    numeroDePersonagens++;
	    
	    if(quantItens>0){
			nomeItens = new String();
			System.out.printf("Espaco de itens no inventario de %s: %d\n\n", nome, quantItens);
		}
		else{
	        quantItens = 0;
		}
	}
	
	public class Inimigo{
		public int hp_ini = 150;
	    public int forca_ini = 110;
	    public int def_esp_ini = 120;
	}
}
