package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueNormal;
import fiuba.algo3.modelo.ataques.AtaquePlanta;

public class Chansey extends Algomon {
	public Chansey (){
		puntosVida = 130;
		puntosVidaActuales = 130;
		Ataque latigoCepa = new AtaquePlanta("Latigo Cepa",15,10);
		Ataque canto = new AtaqueNormal("Canto",0,6);
		ataques.put("Latigo Cepa",latigoCepa);
		ataques.put("Canto",canto);
	}
	
	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarNormal();
	}
}
