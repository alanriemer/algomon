package fiuba.algo3.modelo.algomones;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaquePlanta;
import fiuba.algo3.modelo.ataques.TipoAtaque;

public class Bulbasaur extends Algomon{
	public Bulbasaur(){
		nombre = "Bulbasaur";
		imagen = "/resources/Bulbasaur_XY.gif";
		puntosVida = 140;
		puntosVidaActuales = 140;
		Ataque latigoCepa = new AtaquePlanta(15,10, TipoAtaque.LatigoCepa);
		Ataque chupaVidas = new AtaquePlanta(15,8, TipoAtaque.ChupaVidas);
		chupaVidas.puedeChuparVida(chupaVidas, this);
		ataques.put(TipoAtaque.LatigoCepa,latigoCepa);
		ataques.put(TipoAtaque.ChupaVidas,chupaVidas);

	}

	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarPlanta();
	}
}
