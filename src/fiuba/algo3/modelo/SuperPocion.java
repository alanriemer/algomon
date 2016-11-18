package fiuba.algo3.modelo;

public class SuperPocion implements Elemento {

	@Override
	public void utilizar(Algomon pokemon) {
		pokemon.aumentarPuntosDeVidaActuales(40);
	}

}
