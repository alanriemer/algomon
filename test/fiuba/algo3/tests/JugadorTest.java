package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import  java.util.List;


import org.junit.Test;

import fiuba.algo3.modelo.Jugador;
import fiuba.algo3.modelo.algomones.Algomon;
import fiuba.algo3.modelo.algomones.Bulbasaur;
import fiuba.algo3.modelo.algomones.Charmander;
import fiuba.algo3.modelo.algomones.Squirtle;
import fiuba.algo3.modelo.ataques.Ataque;
import fiuba.algo3.modelo.ataques.TipoAtaque;
import fiuba.algo3.modelo.excepciones.AlgomonInvalidoException;
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
		List<Ataque> ataquesDisponibles= jugador1.ataquesDisponibles();
		TipoAtaque ataqueAUtilizar = ataquesDisponibles.get(0).getNombre();
		jugador1.atacarCon(ataqueAUtilizar,jugador2.algomonActual());

	}
	@Test
	public void test04JugadorCambiaAlgomonActivo() throws AtaqueNoDisponibleException, AlgomonInvalidoException{
		Jugador unJugador = new Jugador();
		Algomon unBulbasaur = new Bulbasaur();
		Algomon unCharmander = new Charmander();
		Algomon unSquirtle = new Squirtle();
		unJugador.agregarAlgomon(unBulbasaur);
		unJugador.agregarAlgomon(unCharmander);
		unJugador.agregarAlgomon(unSquirtle);
		List<Algomon>  algomonesVivos = unJugador.getAlgomones();
		Algomon algomonElegido = algomonesVivos.get(1);
		unJugador.cambiarAlgomon(algomonElegido);
		assertEquals(unJugador.algomonActual(),unCharmander);
	}
	
	@Test(expected = AlgomonInvalidoException.class) 
	public void test05TiraExcepcionCuandoQuieroUsarUnAlgomonQueNoTengo() throws AlgomonInvalidoException{
		Squirtle unSquirtle = new Squirtle();
		Squirtle otroSquirtle = new Squirtle();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unSquirtle);
		unJugador.cambiarAlgomon(otroSquirtle);
	}
	
	public void test06JugadorTieneTodosLosAlgomonesMuertos() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unSquirtle);
		Bulbasaur unBulbasaur = new Bulbasaur();
		Jugador otroJugador = new Jugador();
		otroJugador.agregarAlgomon(unBulbasaur);
		otroJugador.atacarCon(TipoAtaque.LatigoCepa, unSquirtle);
		otroJugador.atacarCon(TipoAtaque.LatigoCepa, unSquirtle);
		otroJugador.atacarCon(TipoAtaque.LatigoCepa, unSquirtle);
		otroJugador.atacarCon(TipoAtaque.LatigoCepa, unSquirtle);
		otroJugador.atacarCon(TipoAtaque.LatigoCepa, unSquirtle);
		otroJugador.atacarCon(TipoAtaque.LatigoCepa, unSquirtle);
		otroJugador.atacarCon(TipoAtaque.LatigoCepa, unSquirtle);
		assertEquals(unJugador.algomonesMuertos(),true);
	}

}
