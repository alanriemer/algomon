package fiuba.algo3.modelo.algomones;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaquePlanta;

public class Bulbasaur extends Algomon{
	public Bulbasaur(){
		nombre = "Bulbasaur";
		puntosVida = 140;
		puntosVidaActuales = 140;
		Ataque latigoCepa = new AtaquePlanta(15,10);
		Ataque chupaVidas = new AtaquePlanta(15,8);
		chupaVidas.puedeChuparVida(chupaVidas, this);
		ataques.put("Latigo Cepa",latigoCepa);
		ataques.put("ChupaVidas",chupaVidas);
		
	}
	 
	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarPlanta();
	}
}
