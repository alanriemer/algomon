package fiuba.algo3.modelo.algomones;

import fiuba.algo3.modelo.ataques.Ataque;

import fiuba.algo3.modelo.ataques.AtaqueFuego;

public class Charmander extends Algomon{
	public Charmander(){
		puntosVida = 170;
		puntosVidaActuales = 170;
		Ataque brasas = new AtaqueFuego(16,10);
		Ataque fogonazo = new AtaqueFuego(2,4);
		fogonazo.puedeQuemar();
		ataques.put("Brasas",brasas);
		ataques.put("Fogonazo",fogonazo);

	}
	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarFuego();
	}
	
}
