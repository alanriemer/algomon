package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class EstadoNormal implements Estado{
	
	Algomon algomon;
	
	public EstadoNormal(Algomon actual){
		algomon = actual;
	}
	
	public boolean estaDormido(){
		return false;
	}
	
	public boolean estaQuemado(){
		return false;
	}

	public void atacar(Ataque ataque, Algomon enemigo) throws AtaqueNoDisponibleException {
		enemigo.recibirAtaque(ataque);
	}

	@Override
	public boolean estaDormidoQuemado() {
		return false;
	}
}
