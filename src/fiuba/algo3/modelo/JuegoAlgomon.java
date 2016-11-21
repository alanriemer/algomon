package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

import fiuba.algo3.modelo.algomones.Algomon;

public class JuegoAlgomon {
	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador jugadorActual;

	public JuegoAlgomon(){
		jugador1 = new Jugador();
		jugador2 = new Jugador();
		jugadorActual = this.sortearTurnoInicial();
	}

	private void siguienteTurno(){
		jugadorActual = (jugadorActual == jugador1)? jugador2:jugador1;
	}
	private Jugador sortearTurnoInicial(){
		List<Jugador> jugadores = new ArrayList<Jugador>();
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		return jugadores.get((int)Math.random() * jugadores.size());
	}
	public void atacar(){
		//LoQueDebeHacer.
		this.siguienteTurno();
	}
	public void cambiarAlgomon(){
		this.algomonesDisponibles();
		this.siguienteTurno();

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

