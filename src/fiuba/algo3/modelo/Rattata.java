package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

public class Rattata extends Algomon{
	public Rattata(){
		tipo = Tipo.Normal;
		healthPoints = 170;
		Ataque ataque1 = new Ataque(2,4,Tipo.Fuego);
		moveSet.put("Fogonazo",ataque1);
		weakAndStr.put(Tipo.Agua, 1.0);
		weakAndStr.put(Tipo.Fuego, 1.0);
		weakAndStr.put(Tipo.Planta, 1.0);
		weakAndStr.put(Tipo.Normal, 1.0);
	}
	
	
	public void atacaConFogonazoAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get("Fogonazo"), this);
	}
}
