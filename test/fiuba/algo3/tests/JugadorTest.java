package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.Algomon;
import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Charmander;
import fiuba.algo3.modelo.Jugador;
import fiuba.algo3.modelo.Squirtle;

public class JugadorTest {
	@Test
	public void test01agregarAlgomonesYelPrimeroEselActualDelJugador(){
		Jugador jugador = new Jugador();
		Algomon unCharmander = new Charmander();
		Algomon unBulbasaur = new Bulbasaur();
		Algomon unSquirtle = new Squirtle();
		jugador.agregarAlgomon(unCharmander);
		jugador.agregarAlgomon(unBulbasaur);
		jugador.agregarAlgomon(unSquirtle);
		assertEquals(jugador.pokemonActual(),unCharmander);
	}

	public void test02agregarAlgomonesYelPrimeroEsElActualDelJugador(){
		Jugador jugador = new Jugador();
		Algomon unCharmander = new Charmander();
		Algomon unBulbasaur = new Bulbasaur();
		Algomon unSquirtle = new Squirtle();
		jugador.agregarAlgomon(unBulbasaur);
		jugador.agregarAlgomon(unCharmander);
		jugador.agregarAlgomon(unSquirtle);
		assertEquals(jugador.pokemonActual(),unBulbasaur);
	}	
}
