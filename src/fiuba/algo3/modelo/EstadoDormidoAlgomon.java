package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;



public class EstadoDormidoAlgomon implements Estado{

	Algomon algomon;
	int turnos;
	
	public EstadoDormidoAlgomon(Algomon actual){
		algomon = actual;
		turnos = 0;
	}

	public boolean estaDormido(){
		return true;
	}

	public void atacar(Ataque ataque, Algomon enemigo)	throws AtaqueNoDisponibleException {
		turnos++;
		if (turnos == 3) {
			algomon.despertar();
		}
//		throw new AtaqueNoDisponibleException();
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
}
