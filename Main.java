package cbcc.mago;

public class Main {
	
	boolean x;
	
	public static void main(){
		Mago mago = new Mago();
		Guerreiro guerreiro = new Guerreiro();
		
		mago.atacar();
		mago.defender();
		guerreiro.atacar();
		guerreiro.defender();
	}
}
