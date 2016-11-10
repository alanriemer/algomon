package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class EstadoNormalAlgomon extends EstadoAlgomon{
	
	public EstadoNormalAlgomon(Algomon poke) {
		super(poke);
	}

	public void Canto(Ataque unAtaque) throws AtaqueNoDisponibleException{
		pokemon.recibirAtaque(unAtaque);
		pokemon.estadoEfimero(new EstadoDormidoAlgomon(pokemon));
	}
	
	public boolean estaDormido(){
		return false;
	}
}
