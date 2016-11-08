package fiuba.algo3.modelo;

public abstract class Algomon {
	int healthPoints;
	Tipo tipo;
	
	public int getHealthPoints(){
		return healthPoints;
	}
	
	public void hacerDanio(int dmg){
		healthPoints -= dmg;
	}
}
