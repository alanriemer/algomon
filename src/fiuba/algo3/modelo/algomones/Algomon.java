package fiuba.algo3.modelo.algomones;

import java.util.ArrayList; 
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueNormal;
import fiuba.algo3.modelo.estadoAlgomones.Estado;
import fiuba.algo3.modelo.estadoAlgomones.EstadoNormal;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public abstract class Algomon {
	protected String nombre;
	protected int puntosVida;
	protected int puntosVidaActuales; 
	protected Estado estado = new EstadoNormal(this);
	protected HashMap<String,Ataque> ataques = new HashMap<String,Ataque>();
	
	public Algomon(){
		ataques.put("Ataque rapido",new AtaqueNormal(10,16));
	}	
	
	public String getNombre(){
		return nombre;
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

		
	public void normalizar(){
		this.estado = new EstadoNormal(this);
	}
	

	public List<String> ataquesDisponibles() {
		return new ArrayList<String>(this.ataques.keySet());

	}


	public void restaurarAtaques(int cantidad) {
		for(Map.Entry<String, Ataque> datos : ataques.entrySet()){
			datos.getValue().restaurarAtaque(cantidad);
		}
	}
	
	public int cantidadAtaquesDisponibles(String ataque) {
		return ataques.get(ataque).cantidadDisponible();
	}


	public void nuevoEstado(Estado nuevoEstado) {
		this.estado = nuevoEstado;
	}


	public Estado estado() {
		return this.estado;
	}

}
