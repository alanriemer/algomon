package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

public class Bulbasaur extends Algomon{
	public Bulbasaur(){
		healthPoints = 140;
		tipo = Tipo.Planta;
		Ataque ataque1 = new Ataque("Latigo Cepa",15,10,Tipo.Planta);
		moveSet.put("Latigo Cepa",ataque1);
		weakAndStr.put(Tipo.Agua, 0.5);
		weakAndStr.put(Tipo.Fuego, 2.0);
		weakAndStr.put(Tipo.Planta, 0.5);
		weakAndStr.put(Tipo.Normal, 1.0);
	}
	
	public void atacaConLatigoCepaAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get("Latigo Cepa"));
	}
}
