package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;


public class Jugador {
	List<Algomon> misAlgomones;
	public Jugador(){
		this.misAlgomones = new ArrayList<Algomon>();
	}
	public void agregarAlgomon(Algomon algomon) {
		this.misAlgomones.add(algomon);
		
	}

	public Algomon pokemonActual() {
		return misAlgomones.get(0);
	}

}
