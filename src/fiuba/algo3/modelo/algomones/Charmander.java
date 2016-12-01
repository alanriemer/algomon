package fiuba.algo3.modelo.algomones;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueFuego;
import fiuba.algo3.modelo.ataques.TipoAtaque;

public class Charmander extends Algomon{
	public Charmander(){
		nombre = "Charmander";
		imagen = "/resources/Charmander_XY.gif";
		puntosVida = 170;
		puntosVidaActuales = 170;
		Ataque brasas = new AtaqueFuego(16,10, TipoAtaque.Brasas);
		Ataque fogonazo = new AtaqueFuego(2,4, TipoAtaque.Fogonazo);
		fogonazo.puedeQuemar();
		ataques.put(TipoAtaque.Brasas,brasas);
		ataques.put(TipoAtaque.Fogonazo,fogonazo);

	}
	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarFuego();
	}

}
