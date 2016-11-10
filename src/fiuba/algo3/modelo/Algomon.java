package fiuba.algo3.modelo;

import java.util.HashMap;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public abstract class Algomon {
	protected int puntosVida; 
	protected Tipo tipo;
	protected EstadoAlgomon estado = new EstadoNormalAlgomon();
	protected HashMap<String,Ataque> moveSet = new HashMap<String,Ataque>();
	protected HashMap<Tipo,Double> weakAndStr = new HashMap<Tipo,Double>();
	
	public Algomon(){
		Ataque ataqueRapido = new Ataque(10,16, Tipo.Normal);
		moveSet.put("Ataque rapido",ataqueRapido);
	}
	
	public int getPuntosVida(){
		return puntosVida;
	}
	
	public void atacarConAtaqueRapido(Algomon enemigo) throws AtaqueNoDisponibleException{
		enemigo.recibirAtaque(moveSet.get("Ataque rapido"));
	}
	
	public int recibirAtaque(Ataque unAtaque) throws AtaqueNoDisponibleException{
		int danio;
		if(!unAtaque.sePuedeUsarAtaque()){
			throw new AtaqueNoDisponibleException();
		}
		danio = unAtaque.usarAtaque();
		danio = (int) (danio * weakAndStr.get(unAtaque.tipoDeAtaque()));
		puntosVida = puntosVida - danio;
		return danio;		
	}
	
	
	
}
