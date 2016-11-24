package fiuba.algo3.modelo.algomones;

import java.io.File;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueNormal;
import fiuba.algo3.modelo.ataques.AtaquePlanta;

public class Chansey extends Algomon {
	public Chansey (){
		nombre = "Chansey";
		imagen = new File("src/resources/Chansey_XY.gif");
		puntosVida = 130;
		puntosVidaActuales = 130;
		Ataque latigoCepa = new AtaquePlanta(15,10,"Latigo Cepa");
		Ataque canto = new AtaqueNormal(0,6, "Canto");
		canto.puedeDormir();
		ataques.put("Latigo Cepa",latigoCepa);
		ataques.put("Canto",canto);
	}

	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarNormal();
	}
}
