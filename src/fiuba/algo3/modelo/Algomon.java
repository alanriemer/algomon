package fiuba.algo3.modelo;

import java.util.HashMap;

import fiuba.algo3.modelo.ataques.Ataque;

public abstract class Algomon {
	protected int healthPoints; 
	protected Tipo tipo;
	protected HashMap<String,Ataque> moveSet = new HashMap<String,Ataque>();
	protected HashMap<Tipo,Double> weakAndStr = new HashMap<Tipo,Double>();
	
	public Algomon(){
		Ataque ataque1 = new Ataque(10,16, Tipo.Normal);
		moveSet.put("Ataque rapido",ataque1);
	}
	
	public int getHealthPoints(){
		return healthPoints;
	}
	
	public void hacerDanio(int dmg){
		healthPoints -= dmg;
	}
	
	public void atacaConAtaqueRapidoAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get("Ataque rapido"), this);
	}
	
	public void recibirAtaque(Ataque unAtaque, Algomon atacante){
		int danio;
		if(unAtaque.sePuedeUsarAtaque()){
			danio = unAtaque.usarAtaque();
			danio = (int) (danio * weakAndStr.get(atacante.coincideElTipo(unAtaque.tipoDeAtaque())));
			healthPoints = healthPoints - danio;
		}
	}
	
	public Tipo coincideElTipo(Tipo unTipo){
		if(tipo == unTipo)
			return tipo;
		return Tipo.Normal;
	}
	
	
}
