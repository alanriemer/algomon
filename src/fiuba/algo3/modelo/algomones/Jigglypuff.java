package fiuba.algo3.modelo.algomones;

import java.io.File;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueAgua;
import fiuba.algo3.modelo.ataques.AtaqueNormal;

public class Jigglypuff extends Algomon{
	public Jigglypuff(){
		nombre = "Jigglypuff";
		imagen = new File("src/resources/Jigglypuff_XY.gif");
		puntosVida = 130;
		puntosVidaActuales = 130;
		Ataque burbuja = new AtaqueAgua(10,15, "Burbuja");
		Ataque canto = new AtaqueNormal(0,6, "Canto");
		canto.puedeDormir();
		ataques.put("Burbuja",burbuja);
		ataques.put("Canto",canto);

	}

	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarNormal();
	}


}
