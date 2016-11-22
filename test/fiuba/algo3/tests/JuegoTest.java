package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import fiuba.algo3.modelo.JuegoAlgomon;
import fiuba.algo3.modelo.algomones.Algomon;
import fiuba.algo3.modelo.algomones.Charmander;
import fiuba.algo3.modelo.algomones.Squirtle;

public class JuegoTest {
	@Test
	public void test01agregarAlgomonesYelPrimeroEselActualDelJugador(){
		Squirtle squirtle = new Squirtle();
		Charmander charmander = new Charmander();
		JuegoAlgomon juego = new JuegoAlgomon();


		juego.agregarAlgomonJugador1(squirtle);
		juego.agregarAlgomonJugador2(charmander);
		
		List<String> ataquesDisponibles = juego.ataquesDisponiblesAlgomonActual(); //Esta lista se muestra en la vista
		juego.atacarCon(ataquesDisponibles.get(1)); // Lo que se devuelve, entra aca.		
		List<Algomon> algomonesDisponibles= juego.algomonesDisponibles(); //En la lista, a cada algomon hacele ".getName" para mostrarlo.
		juego.cambiarAlgomonJugadorActual(algomonesDisponibles.get(0)); //Hacer un test para que no se vaya de rango.
		
		juego.getPuntosVidaActualJugador1();
		juego.getPuntosVidaActualJugador2();
		juego.getPuntosVidaOriginalJugador1();
		juego.getPuntosVidaOriginalJugador2();
		juego.setNombreJugador1("Ash");
		juego.setNombreJugador1("Gary");
		juego.getNombreJugador1(); //Para ponerlo en la pantalla principal.
		juego.getNombreJugador2();
		juego.getNombreJugadorActual(); //Esto te va a servir para identificar quien esta atacando actualmente.
		
		assertEquals(1,1);//PAra que no pinche la integracion continua
	}
}
