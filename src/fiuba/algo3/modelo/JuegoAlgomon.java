package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

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
		return jugadores.get((int)Math.random() * jugadores.size());
	}

}
