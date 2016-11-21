package fiuba.algo3.modelo.ataques;

import fiuba.algo3.modelo.algomones.Algomon;

public class efectoDormir implements Efecto{

	@Override
	public void aplicarEfecto(Algomon enemigo) {
		enemigo.estado().dormir();
	}


}
