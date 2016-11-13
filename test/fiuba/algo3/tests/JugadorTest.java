package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import fiuba.algo3.modelo.Algomon;
import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Charmander;
import fiuba.algo3.modelo.Jugador;
import fiuba.algo3.modelo.Squirtle;
import fiuba.algo3.modelo.ataques.Ataque;

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
		assertEquals(jugador.algomonActual(),unCharmander);
	}

	public void test02agregarAlgomonesYelPrimeroEsElActualDelJugador(){
		Jugador jugador = new Jugador();
		Algomon unCharmander = new Charmander();
		Algomon unBulbasaur = new Bulbasaur();
		Algomon unSquirtle = new Squirtle();
		jugador.agregarAlgomon(unBulbasaur);
		jugador.agregarAlgomon(unCharmander);
		jugador.agregarAlgomon(unSquirtle);
		assertEquals(jugador.algomonActual(),unBulbasaur);
	}	
	/*
	public void test03JugadorEligeAtaque(){
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		Algomon unBulbasaur = new Bulbasaur();
		Algomon unCharmander = new Charmander();
		jugador1.agregarAlgomon(unBulbasaur);
		jugador2.agregarAlgomon(unCharmander);
		Iterable<String> ataquesDisponibles= jugador1.ataquesDisponibles();

		
	}*/
}
