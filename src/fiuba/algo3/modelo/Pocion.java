package fiuba.algo3.modelo;

public class Pocion implements Elemento {

	@Override
	public void utilizar(Algomon pokemon) {
		pokemon.aumentarPuntosDeVidaActuales(20);
	}

}
