package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

import fiuba.algo3.modelo.algomones.Algomon;
import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.elementos.ContenedorElementos;
import fiuba.algo3.modelo.elementos.Elemento;
import fiuba.algo3.modelo.excepciones.AlgomonInvalidoException;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;


public class Jugador {
	List<Algomon> misAlgomones;
	ContenedorElementos contenedorDeElementos;
	Algomon activo;
	private String nombre;
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
	public List<Ataque> ataquesDisponibles() {
		return this.algomonActual().ataquesDisponibles();
	}
	public void atacarCon(String ataque, Algomon enemigo) throws AtaqueNoDisponibleException {
		this.algomonActual().atacarCon(ataque, enemigo);

	}
	public void usarElemento(Elemento elemento) {
		this.algomonActual().aplicarElemento(elemento);
	}
	public Elemento sacarPocion() {
		return contenedorDeElementos.sacarPocion();
	}
	public Elemento sacarSuperPocion() {
		return contenedorDeElementos.sacarSuperPocion();
	}
	public void cambiarAlgomon(Algomon algomon) throws AlgomonInvalidoException {
		if (!this.misAlgomones.contains(algomon)){
			throw new AlgomonInvalidoException();
		}
		this.activo = algomon;

	}
	public Elemento sacarRestaurador() {
		return contenedorDeElementos.sacarRestaurador();
	}
	public Elemento sacarVitamina() {
		return contenedorDeElementos.sacarVitamina();
	}
	public String setNombre(String nombre) {
		return this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public List<String> elementosDisponibles() {
		List<String> elementos = new ArrayList<String>();
		elementos.add("Pocion");
		elementos.add("SuperPocion");
		elementos.add("Vitamina");
		elementos.add("Restaurador");
		return elementos;
	}
	public boolean eligioTodosLosAlgomon() {
		return this.misAlgomones.size() == 3;
	}
}
