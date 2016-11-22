package fiuba.algo3.modelo.algomones;

import java.io.File;

import fiuba.algo3.modelo.ataques.Ataque;

import fiuba.algo3.modelo.ataques.AtaqueFuego;

public class Charmander extends Algomon{
	public Charmander(){
		nombre = "Charmander";
		imagen = new File("src/resources/Charmander_XY.gif");
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
