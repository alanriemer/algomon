package fiuba.algo3.modelo;

import java.util.HashMap;

import fiuba.algo3.modelo.ataques.Ataque;

public abstract class Algomon {
	int healthPoints;
	Tipo tipo;
	HashMap<Integer,Ataque> moveList = new HashMap<Integer,Ataque>();
	
	public int getHealthPoints(){
		return healthPoints;
	}
	
	public void hacerDanio(int dmg){
		healthPoints -= dmg;
	}
}
