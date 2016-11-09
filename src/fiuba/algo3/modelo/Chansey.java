package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;

public class Chansey extends Algomon {
	public Chansey (){
		puntosVida = 130;
		tipo = Tipo.Normal;
		Ataque latigoCepa = new Ataque(15,10, Tipo.Planta);
		moveSet.put("Latigo Cepa",latigoCepa);
		weakAndStr.put(Tipo.Agua, 1.0);
		weakAndStr.put(Tipo.Fuego, 1.0);
		weakAndStr.put(Tipo.Planta, 1.0);
		weakAndStr.put(Tipo.Normal, 1.0);		
	}

	public void atacarConLatigoCepa(Algomon enemigo) {
		enemigo.recibirAtaque(moveSet.get("Latigo Cepa"));
	}
}
