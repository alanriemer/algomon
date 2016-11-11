package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaquePlanta;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class Chansey extends Algomon {
	public Chansey (){
		puntosVida = 130;
		puntosVidaActuales = 130;
		Ataque latigoCepa = new AtaquePlanta(15,10);
		ataques.put("Latigo Cepa",latigoCepa);	
	}

	public void atacarConLatigoCepa(Algomon enemigo) throws AtaqueNoDisponibleException {
		enemigo.recibirAtaque(ataques.get("Latigo Cepa"));
	}
	

	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarNormal();
	}
}
