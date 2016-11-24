package fiuba.algo3.modelo.algomones;

import java.io.File;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaquePlanta;

public class Bulbasaur extends Algomon{
	public Bulbasaur(){
		nombre = "Bulbasaur";
		imagen = new File("src/resources/Bulbasaur_XY.gif");
		puntosVida = 140;
		puntosVidaActuales = 140;
		Ataque latigoCepa = new AtaquePlanta(15,10, "Latigo Cepa");
		Ataque chupaVidas = new AtaquePlanta(15,8, "ChupaVidas");
		chupaVidas.puedeChuparVida(chupaVidas, this);
		ataques.put("Latigo Cepa",latigoCepa);
		ataques.put("ChupaVidas",chupaVidas);

	}

	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarPlanta();
	}
}
