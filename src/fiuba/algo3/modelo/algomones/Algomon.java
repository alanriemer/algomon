package fiuba.algo3.modelo.algomones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueNormal;
import fiuba.algo3.modelo.estadoAlgomones.Estado;
import fiuba.algo3.modelo.estadoAlgomones.EstadoDormido;
import fiuba.algo3.modelo.estadoAlgomones.EstadoDormidoQuemado;
import fiuba.algo3.modelo.estadoAlgomones.EstadoNormal;
import fiuba.algo3.modelo.estadoAlgomones.EstadoQuemado;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public abstract class Algomon {
	protected int puntosVida;
	protected int puntosVidaActuales; 
	protected Estado estado = new EstadoNormal(this);
	protected HashMap<String,Ataque> ataques = new HashMap<String,Ataque>();
	
	public Algomon(){
		ataques.put("Ataque rapido",new AtaqueNormal(10,16));
	}	
	

	public void aumentarPuntosDeVidaActuales(int puntos){
		if(this.puntosVidaActuales + puntos > puntosVida)
			this.puntosVidaActuales = puntosVida;
		else this.puntosVidaActuales += puntos;
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
	
	public void atacarCon(String ataque,Algomon enemigo) throws AtaqueNoDisponibleException{
		if (!ataques.get(ataque).sePuedeUsarAtaque()){
			throw new AtaqueNoDisponibleException();
		}
		estado.atacar(ataques.get(ataque), enemigo);
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
	public boolean estaDormidoQuemado() {
		return estado.estaDormidoQuemado();
	}

	public boolean estaDormido(){
		return estado.estaDormido();
	}
	
	public boolean estaQuemado(){
		return estado.estaQuemado();
	}

	public List<String> ataquesDisponibles() {
		return new ArrayList<String>(this.ataques.keySet());

	}

	public int turnos() {
		return estado.turnos();
	}

	public void restaurarAtaques(int cantidad) {
		for(Map.Entry<String, Ataque> datos : ataques.entrySet()){
			datos.getValue().restaurarAtaque(cantidad);
		}
	}
	
	public int cantidadAtaquesDisponibles(String ataque) {
		return ataques.get(ataque).cantidadDisponible();
	}

}
