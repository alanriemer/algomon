package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

import fiuba.algo3.modelo.algomones.Algomon;
import fiuba.algo3.modelo.elementos.Elemento;
import fiuba.algo3.modelo.excepciones.AlgomonInvalidoException;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class JuegoAlgomon {
	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador jugadorActual;
	private Jugador enemigoActual;


	public JuegoAlgomon(){ //Lo recibimos por parametro inicialmente, despues lo cambiamos.
		this.jugador1 = new Jugador();
		this.jugador2 = new Jugador();
		this.cargarTurnos();
	}

	private void siguienteTurno(){
		this.jugadorActual = (jugadorActual == jugador1)? jugador2:jugador1;
		this.cambiarEnemigo();
	}
	private void cargarTurnos(){
		List<Jugador> jugadores = new ArrayList<Jugador>();
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		this.jugadorActual = jugador1;
		enemigoActual = jugador2;
//		this.jugadorActual =  jugadores.get((int)Math.random() * jugadores.size());
//		this.cambiarEnemigo();
	}
	public void atacarCon(String ataque)throws AtaqueNoDisponibleException{
		this.jugadorActual.atacarCon(ataque, this.enemigoActual.algomonActual());
		this.siguienteTurno();
	}

	private void cambiarEnemigo(){
		this.enemigoActual = (enemigoActual == jugador1)? jugador2:jugador1;
	}

	public void cambiarAlgomonJugadorActual(Algomon algomon){
		try {
			this.jugadorActual.cambiarAlgomon(algomon);
		} catch (AlgomonInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.siguienteTurno();
	}
	public List<String> ataquesDisponiblesAlgomonActual(){
		return jugadorActual.ataquesDisponibles();
	}
	public List<Algomon> algomonesDisponibles() {
		return this.jugadorActual.getAlgomones();
	}

	public void aplicarElemento(Elemento elemento){
		this.jugadorActual.usarElemento(elemento);
		this.siguienteTurno();
	}
	public List<Elemento> elementosDisponibles() {
		return this.jugadorActual.elementosDisponibles();
	}
	public Jugador getJugador1(){
		return jugador1;
	}

	public Jugador getJugador2(){
		return jugador2;
	}
	
	public Jugador getJugadorActual(){
		return jugadorActual;
	}


	public void agregarAlgomonJugador1(Algomon algomon) {
		this.jugador1.agregarAlgomon(algomon);

	}

	public void agregarAlgomonJugador2(Algomon algomon) {
		this.jugador2.agregarAlgomon(algomon);
	}

	public int getPuntosVidaActualJugador1() {
		return this.jugador1.algomonActual().getPuntosVidaActuales();
	}
	public int getPuntosVidaActualJugador2() {
		return this.jugador2.algomonActual().getPuntosVidaActuales();
	}

	public int getPuntosVidaOriginalJugador1() {
		return this.jugador1.algomonActual().getPuntosVida();
	}
	public int getPuntosVidaOriginalJugador2() {
		return this.jugador2.algomonActual().getPuntosVida();
	}

	public String getNombreJugadorActual() {
		return this.jugadorActual.getNombre();
	}
	public void setNombreJugador1(String nombre) {
		 this.jugador1.setNombre(nombre);
	}
	public void setNombreJugador2(String nombre) {
		 this.jugador2.setNombre(nombre);
	}
	public String getNombreJugador1() {
		 return this.jugador1.getNombre();
	}
	public String getNombreJugador2() {
		 return this.jugador2.getNombre();
	}

	public boolean faltaQueEligaAlgunaJugador() {
		if(this.jugador1.eligioTodosLosAlgomon() && this.jugador2.eligioTodosLosAlgomon())
			return false;
		return true;
	}

	public void jugadorActualYaEligio() {
		//HACE LO MISMO QUE SIGUIENTE TURNO PERO ES PUBLICO.
		this.jugadorActual = (jugadorActual == jugador1)? jugador2:jugador1;
		this.cambiarEnemigo();
	}



}

