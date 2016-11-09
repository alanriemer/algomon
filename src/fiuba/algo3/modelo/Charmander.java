package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

public class Charmander extends Algomon{
	public Charmander(){
		tipo = Tipo.Fuego;
		puntosVida = 170;
		Ataque brasas = new Ataque(16,10,Tipo.Fuego);
		moveSet.put("Brasas",brasas);
		Ataque fogonazo = new Ataque(2,4,Tipo.Fuego);
		moveSet.put("Fogonazo",fogonazo);
		weakAndStr.put(Tipo.Agua, 2.0);
		weakAndStr.put(Tipo.Fuego, 0.5);
		weakAndStr.put(Tipo.Planta, 0.5);
		weakAndStr.put(Tipo.Normal, 1.0);
	}
	
	public void atacaConBrasasAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get("Brasas"));
	}
	
	public void atacaConFogonazoAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get("Fogonazo"));
	}
}
