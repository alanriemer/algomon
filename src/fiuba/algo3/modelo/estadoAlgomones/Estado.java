package fiuba.algo3.modelo.estadoAlgomones;

import fiuba.algo3.modelo.algomones.Algomon;
import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public interface Estado {
	public abstract void atacar(Ataque ataque, Algomon enemigo) throws AtaqueNoDisponibleException;
	public abstract boolean estaDormido();
	public abstract boolean estaQuemado();
	public abstract boolean estaDormidoQuemado();
	public abstract int turnos();
	public abstract void dormir();
	public abstract void quemar();
	public abstract void despertar();
}
