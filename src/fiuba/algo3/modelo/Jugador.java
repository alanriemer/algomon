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
	Algomon activo;
	public Jugador(){
		this.misAlgomones = new ArrayList<Algomon>();
		this.contenedorDeElementos = new ContenedorElementos();
	}
	public void agregarAlgomon(Algomon algomon) {
		this.misAlgomones.add(algomon);
		activo = misAlgomones.get(0);
	}
	public Algomon algomonActual() {
		return this.activo;
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
	public void usarElemento(Elemento elemento) {
		elemento.utilizar(this.algomonActual());
	}
	public Elemento sacarPocion() {
		return contenedorDeElementos.sacarPocion();
	}
	public Elemento sacarSuperPocion() {
		return contenedorDeElementos.sacarSuperPocion();
	}
}
