package fiuba.algo3.modelo.elementos;

import fiuba.algo3.modelo.algomones.Algomon;

public class Pocion implements Elemento {
	@Override
	public void utilizar(Algomon pokemon) {
		pokemon.aumentarPuntosDeVidaActuales(20);
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

}
