package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

import fiuba.algo3.modelo.algomones.Algomon;
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
	private void cambiarEnemigo(){
		this.enemigoActual = (enemigoActual == jugador1)? jugador2:jugador1;
	}
	public void atacarCon(String ataque){
		try {
			this.jugadorActual.atacarCon(ataque, this.enemigoActual.algomonActual());
		} catch (AtaqueNoDisponibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.siguienteTurno();
	}
	public void cambiarAlgomon(String algomones){
		this.algomonesDisponibles();
		this.siguienteTurno();

	}
	public List<String> ataquesDisponiblesAlgomonActual(){
		return jugadorActual.ataquesDisponibles();
	}
	private List<Algomon> algomonesDisponibles() {
		return this.jugadorActual.getAlgomones();
	}

	public void aplicarElemento(){
		//LoQueDebeHacer.
		this.siguienteTurno();
	}
	
	public Jugador getJugador1(){
		return jugador1;
	}
	
	public Jugador getJugador2(){
		return jugador2;
	}
}

