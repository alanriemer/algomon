package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueAgua;
import fiuba.algo3.modelo.ataques.AtaqueNormal;

public class Jigglypuff extends Algomon{
	public Jigglypuff(){
		puntosVida = 130;
		puntosVidaActuales = 130;
		Ataque burbuja = new AtaqueAgua(10,15);
		Ataque canto = new AtaqueNormal(0,6);
		canto.puedeDormir();
		ataques.put("Burbuja",burbuja);
		ataques.put("Canto",canto);
	
	}

	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarNormal();
	}
}
