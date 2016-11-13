package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public interface Estado {
	public abstract void atacar(Ataque ataque, Algomon enemigo) throws AtaqueNoDisponibleException;
	public abstract boolean estaDormido();
	public abstract boolean estaQuemado();
	public abstract boolean estaDormidoQuemado();
	public abstract int turnos();
}
