package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import fiuba.algo3.modelo.JuegoAlgomon;
import fiuba.algo3.modelo.algomones.Charmander;
import fiuba.algo3.modelo.algomones.Squirtle;

public class JuegoTest {
	@Test
	public void test01agregarAlgomonesYelPrimeroEselActualDelJugador(){
		Squirtle squirtle = new Squirtle();
		Charmander charmander = new Charmander();
		JuegoAlgomon juego = new JuegoAlgomon();
		juego.getJugador1().agregarAlgomon(squirtle);
		juego.getJugador2().agregarAlgomon(charmander); //Esto lo precargamos en el controlador
		
		
		List<String> ataquesDisponibles = juego.ataquesDisponiblesAlgomonActual(); //Esta lista se muestra en la vista
		juego.atacarCon(ataquesDisponibles.get(1)); // Lo que se devuelve, entra acá
		
		juego.atacarCon(ataquesDisponibles.get(1)); // Lo que se devuelve, entra acá
		
		juego.getJugador1().algomonActual().getPuntosVidaActuales(); //Mostrar la vida del algomon actua de Jugador 1.
		juego.getJugador2().algomonActual().getPuntosVidaActuales(); //Mostrar la vida del algomon actua de Jugador 1.
	}
}
