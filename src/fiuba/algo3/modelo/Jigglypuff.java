package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

public class Jigglypuff extends Algomon{
	public Jigglypuff(){
		puntosVida = 130;
		tipo = Tipo.Planta;
		puntosVida = 140;
		Ataque latigoCepa = new Ataque(15,10, Tipo.Planta);
		moveSet.put("Latigo Cepa",latigoCepa);
		weakAndStr.put(Tipo.Agua, 0.5);
		weakAndStr.put(Tipo.Fuego, 2.0);
		weakAndStr.put(Tipo.Planta, 0.5);
		weakAndStr.put(Tipo.Normal, 1.0);		
	}

}
