package fiuba.algo3.modelo.estadoAlgomones;

import fiuba.algo3.modelo.algomones.Algomon;
import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.elementos.Elemento;
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
		ataque.atacar(enemigo);
		this.efecto();
	}

	@Override
	public void aplicarElemento(Elemento elemento) {
		elemento.utilizar(algomon);
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

	@Override
	public int turnos() {
		return 0;
	}

	@Override
	public void dormir() {
		this.algomon.nuevoEstado(new EstadoDormidoQuemado(this.algomon));
	}

	@Override
	public void quemar() {
		this.algomon.nuevoEstado(new EstadoQuemado(this.algomon));
	}

	@Override
	public void despertar() {
		this.algomon.nuevoEstado(new EstadoQuemado(this.algomon));
	}

	@Override
	public boolean estaMuerto() {
		return false;
	}


}
