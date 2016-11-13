package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class EstadoQuemado implements Estado {

	Algomon algomon;
	
	public EstadoQuemado(Algomon actual){
		this.algomon = actual;
	}
	
	private void efecto() {
		this.algomon.recibirDanio((int)Math.floor(this.algomon.getPuntosVida()*0.1));
	}
	
	public void atacar(Ataque ataque, Algomon enemigo)	throws AtaqueNoDisponibleException {
		int danioEnemigo = enemigo.recibirAtaque(ataque);
		if (ataque.getNombre() == "ChupaVidas"){
			algomon.aumentarPuntosDeVidaActuales((int)Math.floor(danioEnemigo*0.3));
		}
		this.efecto();
	}

	@Override
	public boolean estaDormido() {
		return false;
	}

	@Override
	public boolean estaDormidoQuemado() {
		return false;
	}
	public boolean estaQuemado() {
		return true;
	}
}
