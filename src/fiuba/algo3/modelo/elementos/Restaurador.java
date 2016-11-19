package fiuba.algo3.modelo.elementos;

import fiuba.algo3.modelo.algomones.Algomon;

public class Restaurador implements Elemento {

	@Override
	public void utilizar(Algomon pokemon) {
		pokemon.normalizar();
	}

}
