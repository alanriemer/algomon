package fiuba.algo3.modelo.ataques;

import fiuba.algo3.modelo.algomones.Algomon;

public class efectoChupaVidas implements Efecto {

	Ataque unAtaque;
	Algomon atacante;
	
	public efectoChupaVidas(Ataque ataque, Algomon algomon){
		unAtaque = ataque;
		atacante = algomon;
	}
	
	@Override
	public void aplicarEfecto(Algomon pokemon) {
		int danioEnemigo = pokemon.calcularDanio(unAtaque);
		atacante.aumentarPuntosDeVidaActuales((int)Math.floor(danioEnemigo*0.3));
	}

	

}
