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

}
