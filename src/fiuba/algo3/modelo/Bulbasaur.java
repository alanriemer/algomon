package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

public class Bulbasaur extends Algomon{
	public Bulbasaur(){
		healthPoints = 140;
		tipo = Tipo.Planta;
		Ataque ataque1 = new Ataque("Latigo Cepa",15,10,Tipo.Planta);
		moveSet.put(1,ataque1);
	}
	
	public void atacaConLatigoCepaAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get(1));
	}
}
