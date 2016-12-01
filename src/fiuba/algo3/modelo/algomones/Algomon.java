package fiuba.algo3.modelo.algomones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.AtaqueNormal;
import fiuba.algo3.modelo.ataques.TipoAtaque;
import fiuba.algo3.modelo.elementos.Elemento;
import fiuba.algo3.modelo.estadoAlgomones.Estado;
import fiuba.algo3.modelo.estadoAlgomones.EstadoMuerto;
import fiuba.algo3.modelo.estadoAlgomones.EstadoNormal;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public abstract class Algomon {
	protected String nombre;
	protected String imagen;
	protected int puntosVida;
	protected int puntosVidaActuales;
	protected Estado estado = new EstadoNormal(this);
	protected HashMap<TipoAtaque,Ataque> ataques = new HashMap<TipoAtaque,Ataque>();

	public Algomon(){
		ataques.put(TipoAtaque.AtaqueRapido,new AtaqueNormal(10,16, TipoAtaque.AtaqueRapido));
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
		if(danio >= puntosVidaActuales){
			puntosVidaActuales = 0;
			this.estado = new EstadoMuerto();
		}
		else puntosVidaActuales -= danio;
	}

	public void atacarCon(TipoAtaque ataque,Algomon enemigo) throws AtaqueNoDisponibleException{
		if (!this.ataques.get(ataque).sePuedeUsarAtaque()){
			throw new AtaqueNoDisponibleException();
		}
		estado.atacar(ataques.get(ataque), enemigo);
	}


	public void normalizar(){
		this.estado = new EstadoNormal(this);
	}


	public List<Ataque> ataquesDisponibles() {
		return new ArrayList<Ataque>(this.ataques.values());

	}


	public void restaurarAtaques(int cantidad) {
		for(Entry<TipoAtaque, Ataque> datos : ataques.entrySet()){
			datos.getValue().restaurarAtaque(cantidad);
		}
	}

	public int cantidadAtaquesDisponibles(TipoAtaque ataque) {
		return ataques.get(ataque).cantidadDisponible();
	}


	public void nuevoEstado(Estado nuevoEstado) {
		this.estado = nuevoEstado;
	}



	public String getImagen(){
		return this.imagen;
	}

	public void aplicarElemento(Elemento elemento) {
		estado.aplicarElemento(elemento);
	}

	public void dormir() {
		estado.dormir();
	}

	public void quemar() {
		estado.quemar();
	}

	public void despertar() {
		estado.despertar();
	}
	
	public Estado getEstado(){
		return estado;
	}
	
	public boolean estaDormido() {
		return estado.estaDormido();
	}

	public boolean estaQuemado() {
		return estado.estaQuemado();
	}

	public boolean estaDormidoQuemado() {
		return estado.estaDormidoQuemado();
	}

	public int turnosEstadoActual() {
		return estado.turnos();
	}

	public boolean estaMuerto() {
		return estado.estaMuerto();
	}
}
