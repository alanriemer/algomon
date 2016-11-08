package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

public class Charmander extends Algomon{
	public Charmander(){
		healthPoints = 170;
		tipo = Tipo.Fuego;
		Ataque ataque1 = new Ataque("Brasas",16,10,Tipo.Fuego);
		moveSet.put("Brasas",ataque1);
	}
	
	public void atacaConBrasasAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get("Brasas"));;
	}
}
