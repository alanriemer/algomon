package fiuba.algo3.modelo.algomones;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueAgua;
import fiuba.algo3.modelo.ataques.AtaqueNormal;
import fiuba.algo3.modelo.ataques.TipoAtaque;

public class Jigglypuff extends Algomon{
	public Jigglypuff(){
		nombre = "Jigglypuff";
		imagen = "/resources/Jigglypuff_XY.gif";
		puntosVida = 130;
		puntosVidaActuales = 130;
		Ataque burbuja = new AtaqueAgua(10,15, TipoAtaque.Burbuja);
		Ataque canto = new AtaqueNormal(0,6, TipoAtaque.Canto);
		canto.puedeDormir();
		ataques.put(TipoAtaque.Burbuja,burbuja);
		ataques.put(TipoAtaque.Canto,canto);

	}

	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarNormal();
	}


}
