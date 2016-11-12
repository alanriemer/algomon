package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public interface EstadosEfimeros {

	
	public abstract boolean estaDormido();

	public abstract void atacar(Ataque ataque, Algomon enemigo) throws AtaqueNoDisponibleException;

	
}
