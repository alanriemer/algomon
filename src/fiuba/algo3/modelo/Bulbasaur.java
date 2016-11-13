package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaquePlanta;

public class Bulbasaur extends Algomon{
	public Bulbasaur(){
		puntosVida = 140;
		puntosVidaActuales = 140;
		Ataque latigoCepa = new AtaquePlanta("Latigo Cepa",15,10);
		Ataque chupaVidas = new AtaquePlanta("chupaVidas",15,8);
		ataques.put("Latigo Cepa",latigoCepa);
		ataques.put("ChupaVidas",chupaVidas);
		
	}
	
	public void aumentarPuntosDeVidaActuales(int puntos){
		if(this.puntosVidaActuales + puntos > puntosVida)
			this.puntosVidaActuales = puntosVida;
		else this.puntosVidaActuales += puntos;
	}
	 

	@Override
	public int calcularDanio(Ataque unAtaque) {
		return unAtaque.atacarPlanta();
	}
}
