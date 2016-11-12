package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;



public class EstadoDormidoAlgomon implements EstadosEfimeros{

	Algomon pokemon;
	
	public EstadoDormidoAlgomon(Algomon poke){
		pokemon = poke;
	}

	public boolean estaDormido(){
		return true;
	}


	public void atacar(Ataque ataque, Algomon enemigo)	throws AtaqueNoDisponibleException {
		throw new AtaqueNoDisponibleException();
	}

}
