package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import fiuba.algo3.modelo.Jugador;
import fiuba.algo3.modelo.algomones.Charmander;
import fiuba.algo3.modelo.algomones.Jigglypuff;
import fiuba.algo3.modelo.algomones.Squirtle;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class ElementosTest {

	@Test
	public void test01ChamanderEstaDebilitado20puntosYseCura20PuntosDeVidaConUnaPocion() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle = new Squirtle();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unCharmander);
		int vida = unCharmander.getPuntosVidaActuales();
		unSquirtle.atacarCon("Burbuja",unCharmander);
		unJugador.usarElemento(unJugador.sacarPocion());
		assertEquals(unCharmander.getPuntosVidaActuales(),vida);
	}

	@Test
	public void test02ChamanderEstaDebilitado40puntosYseCura40PuntosDeVidaConUnaSuperPocion() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle = new Squirtle();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unCharmander);
		int vida = unCharmander.getPuntosVidaActuales();
		unSquirtle.atacarCon("Burbuja",unCharmander);
		unSquirtle.atacarCon("Burbuja",unCharmander);
		unJugador.usarElemento(unJugador.sacarSuperPocion());
		assertEquals(unCharmander.getPuntosVidaActuales(),vida);
	}

	@Test
	public void test03ChamanderEstaDebilitado60puntosYseCura60PuntosDeVidaConUnaSuperPocionYunaPocion() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle = new Squirtle();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unCharmander);
		int vida = unCharmander.getPuntosVidaActuales();
		unSquirtle.atacarCon("Burbuja",unCharmander);
		unSquirtle.atacarCon("Burbuja",unCharmander);
		unSquirtle.atacarCon("Burbuja",unCharmander);
		unJugador.usarElemento(unJugador.sacarSuperPocion());
		unJugador.usarElemento(unJugador.sacarPocion());
		assertEquals(unCharmander.getPuntosVidaActuales(),vida);
	}


	@Test
	public void test04ChamanderEstaDebilitado40puntosYseCura20PuntosDeVidaConUnaPocion() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle = new Squirtle();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unCharmander);
		int vida = unCharmander.getPuntosVidaActuales();
		unSquirtle.atacarCon("Burbuja",unCharmander);
		unSquirtle.atacarCon("Burbuja",unCharmander);
		unJugador.usarElemento(unJugador.sacarPocion());
		assertEquals(unCharmander.getPuntosVidaActuales(),vida-20);
	}
	
	@Test
	public void test05ChamanderEstaDormidoYvuelveAestadoNormalConUnRestaurador() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unCharmander);
		unJigglypuff.atacarCon("Canto",unCharmander);
		unJugador.usarElemento(unJugador.sacarRestaurador());
		assertEquals(unCharmander.estaDormido(), false);
	}
	
	@Test
	public void test06JigglypuffEstaQuemadoYvuelveAestadoNormalConUnRestaurador() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unJigglypuff);
		unCharmander.atacarCon("Fogonazo",unJigglypuff);
		unJugador.usarElemento(unJugador.sacarRestaurador());
		assertEquals(unJigglypuff.estaQuemado(), false);
	}
	
	@Test
	public void test07JigglypuffEstaQuemadoYDormidoYvuelveAestadoNormalConUnRestaurador() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jigglypuff otroJigglypuff = new Jigglypuff();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unJigglypuff);
		unCharmander.atacarCon("Fogonazo",unJigglypuff);
		otroJigglypuff.atacarCon("Canto", unJigglypuff);
		unJugador.usarElemento(unJugador.sacarRestaurador());
		assertEquals(unJigglypuff.estaDormidoQuemado(), false);
	}

	@Test
	public void test08JigglypuffUsa2VecesCantoyUsandoUnaVitaminaRestauraLos2Ataques() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unJigglypuff);
		unJigglypuff.atacarCon("Canto", unCharmander);
		unJigglypuff.atacarCon("Canto", unCharmander);
		unJugador.usarElemento(unJugador.sacarVitamina());
		assertEquals(unJigglypuff.cantidadAtaquesDisponibles("Canto"), 6);
	}

}
