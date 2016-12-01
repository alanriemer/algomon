package fiuba.algo3.modelo.algomones;

import java.io.File;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueAgua;
import fiuba.algo3.modelo.ataques.AtaqueFuego;
import fiuba.algo3.modelo.ataques.TipoAtaque;

public class Rattata extends Algomon{
	public Rattata(){
		nombre = "Rattata";
		imagen = new File("resources/Rattata_XY.gif");
		puntosVida = 170;
		puntosVidaActuales = 170;
		Ataque fogonazo = new AtaqueFuego(2,4, TipoAtaque.Fogonazo);
		Ataque burbuja = new AtaqueAgua(10,15, TipoAtaque.Burbuja);
		fogonazo.puedeQuemar();
		ataques.put(TipoAtaque.Fogonazo,fogonazo);
		ataques.put(TipoAtaque.Burbuja,burbuja);

	}

	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarNormal();
	}

}
