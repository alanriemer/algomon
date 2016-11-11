package fiuba.algo3.modelo;



public abstract class EstadoAlgomon {

	Algomon pokemon;
	
	public EstadoAlgomon(Algomon poke){
		pokemon = poke;
	}
	
	
	
	public abstract boolean estaDormido();

}
