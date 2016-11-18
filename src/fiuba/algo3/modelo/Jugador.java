package fiuba.algo3.modelo;

import java.util.ArrayList; 
import java.util.List;

import fiuba.algo3.modelo.algomones.Algomon;
import fiuba.algo3.modelo.elementos.ContenedorElementos;
import fiuba.algo3.modelo.elementos.Elemento;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;


public class Jugador {
	List<Algomon> misAlgomones;
	ContenedorElementos contenedorDeElementos;
	
	public Jugador(){
		this.misAlgomones = new ArrayList<Algomon>();
		this.contenedorDeElementos = new ContenedorElementos();
	}
	public void agregarAlgomon(Algomon algomon) {
		this.misAlgomones.add(algomon);	
	}
	public Algomon algomonActual() {
		return misAlgomones.get(0);
	}
	public List<Algomon> getAlgomones(){
		return misAlgomones;
	}
	public List<String> ataquesDisponibles() {
		return this.algomonActual().ataquesDisponibles();
	}
	public void atacarCon(String ataque, Algomon enemigo) throws AtaqueNoDisponibleException {
		this.algomonActual().atacarCon(ataque, enemigo);
		
	}
	public void usarElemento(Elemento elemento, Algomon pokemon) {
		elemento.utilizar(pokemon);
	}
	public Elemento sacarPocion() {
		return contenedorDeElementos.sacarPocion();
	}
	public Elemento sacarSuperPocion() {
		return contenedorDeElementos.sacarSuperPocion();
	}
}
