package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class EstadoQuemadoAlgomon implements Estado {

	Algomon pokemon;
	
	public EstadoQuemadoAlgomon(Algomon poke){
		this.pokemon = poke;
	}
	
	public boolean estaQuemado() {
		return true;
	}

	private void efecto() {
		this.pokemon.recibirDanio((int)Math.floor(this.pokemon.getPuntosVida()*0.1));
	}
	
	public void atacar(Ataque ataque, Algomon enemigo)	throws AtaqueNoDisponibleException {
		enemigo.recibirAtaque(ataque);
		this.efecto();
	}

	@Override
	public boolean estaDormido() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean estaDormidoQuemado() {
		// TODO Auto-generated method stub
		return false;
	}

}
