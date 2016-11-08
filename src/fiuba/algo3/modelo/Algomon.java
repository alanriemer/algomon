package fiuba.algo3.modelo;

import java.util.HashMap;

import fiuba.algo3.modelo.ataques.Ataque;

public abstract class Algomon {
	protected int healthPoints; //Test rodrigo segundo test
	protected Tipo tipo;
	protected HashMap<String,Ataque> moveSet = new HashMap<String,Ataque>();
	protected HashMap<Tipo,Double> weakAndStr = new HashMap<Tipo,Double>();
	
	public int getHealthPoints(){
		return healthPoints;
	}
	
	public void hacerDanio(int dmg){
		healthPoints -= dmg;
	}
	
	public void atacaConAtaqueRapidoAlEnemigo(Algomon enemigo){
		Ataque ataqueRapido = new Ataque("Ataque Rapido",10,16,Tipo.Normal);
		enemigo.recibirAtaque(ataqueRapido);
	}
	
	public void recibirAtaque(Ataque unAtaque){
		unAtaque.usarAtaque(this);
	}
}
