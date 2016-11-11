package fiuba.algo3.modelo;

import java.util.HashMap;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueNormal;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public abstract class Algomon {
	protected int puntosVida; 
	protected EstadosEfimeros estadoEfimero = new EstadoNormalAlgomon(this);
	protected EstadosPersistentes estadoPersistente = new EstadoNormalAlgomon(this);
	protected HashMap<String,Ataque> ataques = new HashMap<String,Ataque>();
	
	public Algomon(){
		Ataque ataqueRapido = new AtaqueNormal(10,16);
		ataques.put("Ataque rapido",ataqueRapido);
	}
	
	
	public int recibirAtaque(Ataque unAtaque) {
		if(unAtaque.sePuedeUsarAtaque()){
			int danio = this.calcularDanio(unAtaque);
			this.recibirDanio(danio);
			return danio;
		}
		return 0;
	}
	
	public abstract int calcularDanio(Ataque unAtaque);
	
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
	
	
	public void nuevoEstadoEfimero(EstadosEfimeros nuevoEstado){
		this.estadoEfimero = nuevoEstado;
	}
	
	public void nuevoEstadoPersistente(EstadoQuemadoAlgomon nuevoEstado) {
		this.estadoPersistente = nuevoEstado;	
	}
	
	public boolean estaDormido(){
		return estadoEfimero.estaDormido();
	}
	
	public boolean estaQuemado(){
		return estadoPersistente.estaQuemado();
	}


}
