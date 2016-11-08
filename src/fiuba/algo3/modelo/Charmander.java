package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

public class Charmander extends Algomon{
	public Charmander(){
		healthPoints = 170;
		tipo = Tipo.Fuego;
		Ataque ataque1 = new Ataque("Brasas",16,10,Tipo.Fuego);
		moveSet.put(1,ataque1);
	}
	
	public void atacaConBrasasAlEnemigo(Algomon enemigo){
		moveSet.get(1).usarAtaque(this, enemigo);
	}
}
