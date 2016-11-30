package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fiuba.algo3.modelo.algomones.Algomon;
import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.TipoAtaque;
import fiuba.algo3.modelo.elementos.ContenedorElementos;
import fiuba.algo3.modelo.elementos.Elemento;
import fiuba.algo3.modelo.excepciones.AlgomonInvalidoException;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;
import fiuba.algo3.modelo.excepciones.ElementoNoDisponibleException;


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
	public void atacarCon(TipoAtaque ataque, Algomon enemigo) throws AtaqueNoDisponibleException {
		this.algomonActual().atacarCon(ataque, enemigo);

	}
	public void usarElemento(Elemento elemento) {
		this.algomonActual().aplicarElemento(elemento);
	}
	public Elemento sacarPocion() throws ElementoNoDisponibleException {
		return contenedorDeElementos.sacarPocion();
	}
	public Elemento sacarSuperPocion() throws ElementoNoDisponibleException {
		return contenedorDeElementos.sacarSuperPocion();
	}
	public void cambiarAlgomon(Algomon algomon) throws AlgomonInvalidoException {
		if (!this.misAlgomones.contains(algomon) || algomon.getPuntosVidaActuales() == 0){
			throw new AlgomonInvalidoException();
		}
		this.activo = algomon;

	}
	public Elemento sacarRestaurador() throws ElementoNoDisponibleException {
		return contenedorDeElementos.sacarRestaurador();
	}
	public Elemento sacarVitamina() throws ElementoNoDisponibleException {
		return contenedorDeElementos.sacarVitamina();
	}
	public String setNombre(String nombre) {
		return this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public HashMap<String, Integer> cantElementos() {
		HashMap<String, Integer> cantElementos = new HashMap<String, Integer>();
		cantElementos.put("Pocion", this.contenedorDeElementos.cantPocion());
		cantElementos.put("SuperPocion", this.contenedorDeElementos.cantSuperPocion());
		cantElementos.put("Vitamina", this.contenedorDeElementos.cantVitamina());
		cantElementos.put("Restaurador", this.contenedorDeElementos.cantRestaurador());
		return cantElementos;
	}
	public boolean eligioTodosLosAlgomon() {
		return this.misAlgomones.size() == 3;
	}
	public boolean algomonesMuertos() {
		boolean todosMuertos = true;
		for (Algomon algomon : this.misAlgomones) {
			if (!algomon.estaMuerto()){
				todosMuertos = false;
			}
		}
		return todosMuertos;
	}
}
