package fiuba.algo3.modelo;



public class EstadoDormidoAlgomon implements EstadosEfimeros{

	Algomon pokemon;
	
	public EstadoDormidoAlgomon(Algomon poke){
		pokemon = poke;
	}

	
	public boolean estaDormido(){
		return true;
	}




}
