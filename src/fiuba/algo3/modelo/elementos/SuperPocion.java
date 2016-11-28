package fiuba.algo3.modelo.elementos;

import fiuba.algo3.modelo.algomones.Algomon;

public class SuperPocion implements Elemento {

	@Override
	public void utilizar(Algomon pokemon) {
		pokemon.aumentarPuntosDeVidaActuales(40);
	}

}
