package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class EstadoDormidoQuemadoAlgomon implements Estado {
	Algomon algomon;
	int turnos;
	
	public EstadoDormidoQuemadoAlgomon(Algomon actual){
		algomon = actual;
		if (actual.estaDormido()){
			
		}
	}
	
	@Override
	public boolean estaDormido(){
		return true;
	}

	public void atacar(Ataque ataque, Algomon enemigo)	throws AtaqueNoDisponibleException {
		turnos++;
		if (turnos == 3) {
			algomon.quemar();
		}
//		throw new AtaqueNoDisponibleException();
	}

	@Override
	public boolean estaQuemado() {
		return true;
	}
}
