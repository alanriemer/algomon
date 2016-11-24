package fiuba.algo3.modelo.algomones;

import java.io.File;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueAgua;
import fiuba.algo3.modelo.ataques.AtaqueFuego;

public class Rattata extends Algomon{
	public Rattata(){
		nombre = "Rattata";
		imagen = new File("src/resources/Rattata_XY.gif");
		puntosVida = 170;
		puntosVidaActuales = 170;
		Ataque fogonazo = new AtaqueFuego(2,4, "Fogonazo");
		Ataque burbuja = new AtaqueAgua(10,15, "Burbuja");
		ataques.put("Fogonazo",fogonazo);
		ataques.put("Burbuja",burbuja);

	}

	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarNormal();
	}

}
