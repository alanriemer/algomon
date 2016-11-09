package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public abstract class EstadoAlgomon {
	void atacar(Ataque ataque, Algomon enemigo) throws AtaqueNoDisponibleException {
	}
}
