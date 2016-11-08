package fiuba.algo3.modelo.ataques;

import fiuba.algo3.modelo.Algomon;
import fiuba.algo3.modelo.Tipo;

public abstract class Ataque {
	int potencia;
	int cantidad;
	Tipo tipo;
		
	public abstract void usarAtaque (Algomon unPokemon, Algomon enemigo);
}
