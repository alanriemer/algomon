package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

public class Charmander extends Algomon{
	public Charmander(){
		tipo = Tipo.Fuego;
		puntosVida = 170;
		Ataque ataque1 = new Ataque(16,10,Tipo.Fuego);
		moveSet.put("Brasas",ataque1);
		Ataque ataque2 = new Ataque(2,4,Tipo.Fuego);
		moveSet.put("Fogonazo",ataque2);
		weakAndStr.put(Tipo.Agua, 2.0);
		weakAndStr.put(Tipo.Fuego, 0.5);
		weakAndStr.put(Tipo.Planta, 0.5);
		weakAndStr.put(Tipo.Normal, 1.0);
	}
	
	public void atacaConBrasasAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get("Brasas"), this);;
	}
	
	public void atacaConFogonazoAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get("Fogonazo"), this);;
	}
}
