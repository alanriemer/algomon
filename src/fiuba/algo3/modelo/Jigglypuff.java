package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

public class Jigglypuff extends Algomon{
	public Jigglypuff(){
		puntosVida = 130;
		tipo = Tipo.Normal;
		puntosVida = 140;
		Ataque latigoCepa = new Ataque(15,10, Tipo.Planta);
		moveSet.put("Latigo Cepa",latigoCepa);
		weakAndStr.put(Tipo.Agua, 1.0);
		weakAndStr.put(Tipo.Fuego, 1.0);
		weakAndStr.put(Tipo.Planta, 1.0);
		weakAndStr.put(Tipo.Normal, 1.0);		
	}

}
