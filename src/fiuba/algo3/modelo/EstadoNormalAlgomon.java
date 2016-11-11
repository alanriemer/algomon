package fiuba.algo3.modelo;



public class EstadoNormalAlgomon implements EstadosEfimeros, EstadosPersistentes{
	
	Algomon pokemon;
	
	public EstadoNormalAlgomon(Algomon poke){
		pokemon = poke;
	}
	
	@Override
	public boolean estaDormido(){
		return false;
	}
	
	@Override
	public boolean estaQuemado(){
		return false;
	}



}
