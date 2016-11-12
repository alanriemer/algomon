package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;



public class EstadoDormidoAlgomon implements Estado{

	Algomon algomon;
	
	public EstadoDormidoAlgomon(Algomon actual){
		algomon = actual;
	}

	public boolean estaDormido(){
		return true;
	}


	public void atacar(Ataque ataque, Algomon enemigo)	throws AtaqueNoDisponibleException {
		throw new AtaqueNoDisponibleException();
	}

	@Override
	public boolean estaQuemado() {
		// TODO Auto-generated method stub
		return false;
	}

}
