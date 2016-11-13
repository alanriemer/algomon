package fiuba.algo3.modelo;

import java.util.HashMap;
import java.util.Set;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueNormal;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public abstract class Algomon {
	protected int puntosVida;
	protected int puntosVidaActuales; 
	protected Estado estado = new EstadoNormal(this);
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

	public void dormir(){
		this.estado = (this.estaQuemado())?
			new EstadoDormidoQuemado(this): new EstadoDormido(this);
	}
	public void quemar(){
		this.estado = (this.estaDormido())?
			new EstadoDormidoQuemado(this): new EstadoQuemado(this);
	}
	public void despertar() {
		this.estado = (this.estaDormidoQuemado())? 
			new EstadoQuemado(this): new EstadoNormal(this);
	}	
	public void normalizar(){
		this.estado = new EstadoNormal(this);
	}
	private boolean estaDormidoQuemado() {
		return estado.estaDormidoQuemado();
	}

	public boolean estaDormido(){
		return estado.estaDormido();
	}
	
	public boolean estaQuemado(){
		return estado.estaQuemado();
	}

	public Set<String> ataquesDisponibles() {
		return this.ataques.keySet();
	}


}
