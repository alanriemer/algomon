package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;



public class EstadoNormalAlgomon implements Estado{
	
	Algomon algomon;
	
	public EstadoNormalAlgomon(Algomon actual){
		algomon = actual;
	}
	
	public boolean estaDormido(){
		return false;
	}
	
	public boolean estaQuemado(){
		return false;
	}

	public void efecto() {
	
	}

	public void atacar(Ataque ataque, Algomon enemigo) throws AtaqueNoDisponibleException {
		enemigo.recibirAtaque(ataque);
		
	}



}
