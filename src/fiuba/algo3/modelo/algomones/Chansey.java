package fiuba.algo3.modelo.algomones;

import java.io.File;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueNormal;
import fiuba.algo3.modelo.ataques.AtaquePlanta;
import fiuba.algo3.modelo.ataques.TipoAtaque;

public class Chansey extends Algomon {
	public Chansey (){
		nombre = "Chansey";
		imagen = new File("resources/Chansey_XY.gif");
		puntosVida = 130;
		puntosVidaActuales = 130;
		Ataque latigoCepa = new AtaquePlanta(15,10,TipoAtaque.LatigoCepa);
		Ataque canto = new AtaqueNormal(0,6, TipoAtaque.Canto);
		canto.puedeDormir();
		ataques.put(TipoAtaque.LatigoCepa,latigoCepa);
		ataques.put(TipoAtaque.Canto,canto);
	}

	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarNormal();
	}
}
