package fiuba.algo3.modelo;

import java.util.HashMap;

import fiuba.algo3.modelo.ataques.Ataque;

public abstract class Algomon {
	protected int puntosVida; 
	protected Tipo tipo;
	protected HashMap<String,Ataque> moveSet = new HashMap<String,Ataque>();
	protected HashMap<Tipo,Double> weakAndStr = new HashMap<Tipo,Double>();
	
	public Algomon(){
		Ataque ataqueRapido = new Ataque(10,16, Tipo.Normal);
		moveSet.put("Ataque rapido",ataqueRapido);
	}
	
	public int getPuntosVida(){
		return puntosVida;
	}
	
	public void hacerDanio(int dmg){
		puntosVida -= dmg;
	}
	
	public void atacaConAtaqueRapidoAlEnemigo(Algomon enemigo){
		enemigo.recibirAtaque(moveSet.get("Ataque rapido"), this);
	}
	
	public void recibirAtaque(Ataque unAtaque, Algomon atacante){
		int danio;
		if(unAtaque.sePuedeUsarAtaque()){
			danio = unAtaque.usarAtaque();
			danio = (int) (danio * weakAndStr.get(atacante.coincideElTipo(unAtaque.tipoDeAtaque())));
			puntosVida = puntosVida - danio;
		}
	}
	
	public Tipo coincideElTipo(Tipo unTipo){
		if(tipo == unTipo)
			return tipo;
		return Tipo.Normal;
	}
	
	
}
