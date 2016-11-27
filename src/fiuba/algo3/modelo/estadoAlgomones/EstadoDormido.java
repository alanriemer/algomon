package fiuba.algo3.modelo.estadoAlgomones;

import fiuba.algo3.modelo.algomones.Algomon;
import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.elementos.Elemento;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class EstadoDormido implements Estado{

	Algomon algomon;
	int turnos;
	
	public EstadoDormido(Algomon actual){
		algomon = actual;
		if (actual.estaDormido()){
			turnos = actual.turnosEstadoActual();
		}else turnos = 0;
	}

	public boolean estaDormido(){
		return true;
	}

	public void atacar(Ataque ataque, Algomon enemigo)	throws AtaqueNoDisponibleException {
		this.verificarSiTieneQueDespertar();
	}
	
	@Override
	public void aplicarElemento(Elemento elemento) {
		elemento.utilizar(algomon);
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
		return false;
	}

	@Override
	public boolean estaDormidoQuemado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int turnos() {
		return turnos;
	}

	@Override
	public void dormir() {
		this.algomon.nuevoEstado(new EstadoDormido(this.algomon));
	}

	@Override
	public void quemar() {
		this.algomon.nuevoEstado(new EstadoDormidoQuemado(this.algomon));
	}

	@Override
	public void despertar() {
		this.algomon.nuevoEstado(new EstadoNormal(this.algomon));
	}


}
