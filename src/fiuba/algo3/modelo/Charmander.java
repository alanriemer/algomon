package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

public class Charmander extends Algomon{
	public Charmander(){
		healthPoints = 170;
		tipo = Tipo.Fuego;
		Ataque ataque1 = new Ataque("Brasas",16,10,Tipo.Fuego);
		moveSet.put("Brasas",ataque1);
		weakAndStr.put(Tipo.Agua, 2.0);
		weakAndStr.put(Tipo.Fuego, 0.5);
		weakAndStr.put(Tipo.Planta, 0.5);
		weakAndStr.put(Tipo.Normal, 1.0);
	}
	
	public void atacaConBrasasAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get("Brasas"));;
	}
}
