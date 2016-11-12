package fiuba.algo3.modelo;

import java.util.HashMap;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueNormal;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public abstract class Algomon {
	protected int puntosVida;
	protected int puntosVidaActuales; 
	protected Estado estado = new EstadoNormalAlgomon(this);
	protected HashMap<String,Ataque> ataques = new HashMap<String,Ataque>();
	
	public Algomon(){
		ataques.put("Ataque rapido",new AtaqueNormal(10,16));
	}	
	
	public int recibirAtaque(Ataque unAtaque) throws AtaqueNoDisponibleException {
		if (!unAtaque.sePuedeUsarAtaque()){
			throw new AtaqueNoDisponibleException();
		}
		int danio = this.calcularDanio(unAtaque);
		this.recibirDanio(danio);
		return danio;
	}
	
	public abstract int calcularDanio(Ataque unAtaque);
	
	public int getPuntosVida(){
		return puntosVida;
	}
	
	public int getPuntosVidaActuales(){
		return puntosVidaActuales;
	}
	
	public void recibirDanio(int danio){
		if(danio > puntosVidaActuales)
			puntosVidaActuales = 0;
		else puntosVidaActuales -= danio;
	}
	
	public void atacarConAtaqueRapido(Algomon enemigo) throws AtaqueNoDisponibleException{
		estado.atacar(ataques.get("Ataque rapido"), enemigo);
	}
	
	public void nuevoEstado(Estado nuevoEstado){
		this.estado = nuevoEstado;
	}	
	
	public boolean estaDormido(){
		return estado.estaDormido();
	}
	
	public boolean estaQuemado(){
		return estado.estaQuemado();
	}
}
