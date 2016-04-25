package cbcc.mago;

public class Main {
	
	boolean x;
	
	public static void main(){
		Wizard wiz = new Wizard();
		Sorcerer sorc = new Sorcerer();
		Ranger rang = new Ranger();
		
		wiz.atacar();
		wiz.defender();
		sorc.atacar();
		sorc.defender();
		rang.atacar();
		rang.defender();
	}
}
