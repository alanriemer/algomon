package fiuba.algo3.modelo;

import java.util.HashMap;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueNormal;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public abstract class Algomon {
	protected int puntosVida; 
	protected EstadoAlgomon estadoEfimero = new EstadoNormalAlgomon(this);
	protected EstadoAlgomon estadoPersistente = new EstadoNormalAlgomon(this);
	protected HashMap<String,Ataque> ataques = new HashMap<String,Ataque>();
	
	public Algomon(){
		Ataque ataqueRapido = new AtaqueNormal(10,16);
		ataques.put("Ataque rapido",ataqueRapido);
	}
	
	
	public abstract int recibirAtaque(Ataque unAtaque);
	
	public int getPuntosVida(){
		return puntosVida;
	}
	

	public void recibirDanio(int danio){
		if(danio > puntosVida)
			puntosVida = 0;
		puntosVida -= danio;
	}
		
	
	public void atacarConAtaqueRapido(Algomon enemigo) throws AtaqueNoDisponibleException{
		enemigo.recibirAtaque(ataques.get("Ataque rapido"));
	}
	
	
	public void nuevoEstadoEfimero(EstadoAlgomon nuevoEstado){
		estadoEfimero = nuevoEstado;
	}
	
	public boolean estaDormido(){
		return estadoEfimero.estaDormido();
	}
}
