package fiuba.algo3.modelo;



public class EstadoNormalAlgomon implements EstadosEfimeros, EstadosPersistentes{
	
	Algomon pokemon;
	
	public EstadoNormalAlgomon(Algomon poke){
		pokemon = poke;
	}
	
	public boolean estaDormido(){
		return false;
	}
	
	public boolean estaQuemado(){
		return false;
	}

	@Override
	public void efecto() {
	
	}



}
