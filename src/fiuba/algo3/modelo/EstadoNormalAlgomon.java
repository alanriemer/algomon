package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class EstadoNormalAlgomon extends EstadoAlgomon{
	public void atacar(Ataque ataque, Algomon enemigo) throws AtaqueNoDisponibleException {
		enemigo.recibirAtaque(ataque);
	}
}
