package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public abstract class EstadoAlgomon {

	Algomon pokemon;
	
	public EstadoAlgomon(Algomon poke){
		pokemon = poke;
	}
	
	public abstract void Canto(Ataque unAtaque) throws AtaqueNoDisponibleException;
	public abstract boolean estaDormido();

}
