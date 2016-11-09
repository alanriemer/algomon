package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

public class Rattata extends Algomon{
	public Rattata(){
		tipo = Tipo.Normal;
		puntosVida = 170;
		Ataque fogonazo = new Ataque(2,4,Tipo.Fuego);
		moveSet.put("Fogonazo",fogonazo);
		Ataque burbuja = new Ataque(10,15,Tipo.Agua);
		moveSet.put("Burbuja",burbuja);
		weakAndStr.put(Tipo.Agua, 1.0);
		weakAndStr.put(Tipo.Fuego, 1.0);
		weakAndStr.put(Tipo.Planta, 1.0);
		weakAndStr.put(Tipo.Normal, 1.0);
	}
	
	
	public void atacaConFogonazoAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get("Fogonazo"), this);
	}
	
	public void atacaConBurbujaAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get("Burbuja"), this);
	}
}
