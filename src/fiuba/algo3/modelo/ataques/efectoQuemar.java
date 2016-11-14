package fiuba.algo3.modelo.ataques;

import fiuba.algo3.modelo.Algomon;

public class efectoQuemar implements Efecto {

	@Override
	public void aplicarEfecto(Algomon enemigo) {
		enemigo.quemar();
	}



}
