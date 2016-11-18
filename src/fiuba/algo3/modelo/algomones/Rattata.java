package fiuba.algo3.modelo.algomones;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueAgua;
import fiuba.algo3.modelo.ataques.AtaqueFuego;

public class Rattata extends Algomon{
	public Rattata(){
		puntosVida = 170;
		puntosVidaActuales = 170;
		Ataque fogonazo = new AtaqueFuego(2,4);
		Ataque burbuja = new AtaqueAgua(10,15);
		ataques.put("Fogonazo",fogonazo);
		ataques.put("Burbuja",burbuja);
	
	}

	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarNormal();
	}
	
}
