package fiuba.algo3.modelo.estadoAlgomones;

import fiuba.algo3.modelo.algomones.Algomon;
import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.elementos.Elemento;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class EstadoDormidoQuemado implements Estado {
	Algomon algomon;
	int turnos;
	
	public EstadoDormidoQuemado(Algomon actual){
		algomon = actual;
		if (actual.estaDormido()){
			turnos = actual.turnosEstadoActual();
		}else turnos = 0;
	}
	
	private void efecto() {
		this.algomon.recibirDanio((int)Math.floor(this.algomon.getPuntosVida()*0.1));
	}
	
	public void atacar(Ataque ataque, Algomon enemigo) throws AtaqueNoDisponibleException {
		this.efecto();
		this.verificarSiTieneQueDespertar();
	}
	
	@Override
	public void aplicarElemento(Elemento elemento) {
		elemento.utilizar(algomon);
		this.efecto();
		this.verificarSiTieneQueDespertar();
	}
	
	public void verificarSiTieneQueDespertar(){
		turnos++;
		if (turnos == 3) {
			algomon.despertar();
		}
		
	}

	@Override
	public boolean estaQuemado() {
		return true;
	}

	@Override
	public boolean estaDormidoQuemado() {
		return true;
	}
	
	@Override
	public boolean estaDormido(){
		return true;
	}

	@Override
	public int turnos() {
		return turnos;
	}

	@Override
	public void dormir() {
		this.algomon.nuevoEstado(new EstadoDormidoQuemado(this.algomon));
	}

	@Override
	public void quemar() {
		this.algomon.nuevoEstado(new EstadoDormidoQuemado(this.algomon));
	}

	@Override
	public void despertar() {
		this.algomon.nuevoEstado(new EstadoQuemado(this.algomon));
	}

}
