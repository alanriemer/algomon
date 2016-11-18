package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import  java.util.List;


import org.junit.Test;

import fiuba.algo3.modelo.Jugador;
import fiuba.algo3.modelo.algomones.Algomon;
import fiuba.algo3.modelo.algomones.Bulbasaur;
import fiuba.algo3.modelo.algomones.Charmander;
import fiuba.algo3.modelo.algomones.Squirtle;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

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
	@Test
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
	@Test
	public void test03JugadorEligeAtaque() throws AtaqueNoDisponibleException{
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		Algomon unBulbasaur = new Bulbasaur();
		Algomon unCharmander = new Charmander();
		jugador1.agregarAlgomon(unBulbasaur);
		jugador2.agregarAlgomon(unCharmander);
		List<String> ataquesDisponibles= jugador1.ataquesDisponibles();
		String ataqueAUtilizar = ataquesDisponibles.get(0);
		jugador1.atacarCon(ataqueAUtilizar,jugador2.algomonActual());
		
	}
}
