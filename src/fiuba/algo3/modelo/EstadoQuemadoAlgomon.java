package fiuba.algo3.modelo;

public class EstadoQuemadoAlgomon implements EstadosPersistentes {

	Algomon pokemon;
	
	public EstadoQuemadoAlgomon(Algomon poke){
		pokemon = poke;
	}
	
	@Override
	public boolean estaQuemado() {
		return true;
	}

	@Override
	public void efecto() {
		this.pokemon.recibirDanio((int)Math.floor(this.pokemon.getPuntosVida()*0.1));
	}

}
