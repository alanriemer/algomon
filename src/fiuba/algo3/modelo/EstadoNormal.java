package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class EstadoNormal implements Estado{
	
	Algomon algomon;
	
	public EstadoNormal(Algomon actual){
		algomon = actual;
	}

	public void atacar(Ataque ataque, Algomon enemigo) throws AtaqueNoDisponibleException {
		int danioEnemigo = enemigo.recibirAtaque(ataque);
		if (ataque.getNombre() == "ChupaVidas"){
			algomon.aumentarPuntosDeVidaActuales((int)Math.floor(danioEnemigo*0.3));
		}
	}
	public boolean estaDormido(){
		return false;
	}
	
	public boolean estaQuemado(){
		return false;
	}

	public boolean estaDormidoQuemado() {
		return false;
	}
}
