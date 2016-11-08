package fiuba.algo3.modelo;

import fiuba.algo3.modelo.ataques.Burbuja;

public class Squirtle extends Algomon{
	Burbuja ataque1 = new Burbuja();
	
	public Squirtle (){
		healthPoints = 150;
		tipo = Tipo.Agua;
	}
	
	public void atacaConBurbujaAlEnemigo(Algomon enemigo){
		ataque1.usarAtaque(this, enemigo);
	}
}
