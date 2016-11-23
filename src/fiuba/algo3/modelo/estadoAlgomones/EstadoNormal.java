package fiuba.algo3.modelo.estadoAlgomones;

import fiuba.algo3.modelo.algomones.Algomon;
import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.elementos.Elemento;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class EstadoNormal implements Estado{
	
	Algomon algomon;
	
	public EstadoNormal(Algomon actual){
		algomon = actual;
	}

	public void atacar(Ataque ataque, Algomon enemigo) throws AtaqueNoDisponibleException {
		ataque.atacar(enemigo);
	}
	
	@Override
	public void aplicarElemento(Elemento elemento) {
		elemento.utilizar(algomon);
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

	@Override
	public int turnos() {
		return 0;
	}

	@Override
	public void dormir() {
		this.algomon.nuevoEstado(new EstadoDormido(this.algomon));
	}

	@Override
	public void quemar() {
		this.algomon.nuevoEstado(new EstadoQuemado(this.algomon));
	}

	@Override
	public void despertar() {
		this.algomon.nuevoEstado(new EstadoNormal(this.algomon));
	}
	
	


}
