package fiuba.algo3.modelo;

public class EstadoQuemadoAlgomon implements EstadosPersistentes {

	Algomon pokemon;
	
	public EstadoQuemadoAlgomon(Algomon poke){
		this.pokemon = poke;
	}
	
	public boolean estaQuemado() {
		return true;
	}

	public void efecto() {
		this.pokemon.recibirDanio((int)Math.floor(this.pokemon.getPuntosVida()*0.1));
	}

}
