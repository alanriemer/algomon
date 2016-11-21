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
		assertEquals(unCharmander.estado().estaDormido(), false);
	}
	
	@Test
	public void test06JigglypuffEstaQuemadoYvuelveAestadoNormalConUnRestaurador() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unJigglypuff);
		unCharmander.atacarCon("Fogonazo",unJigglypuff);
		unJugador.usarElemento(unJugador.sacarRestaurador());
		assertEquals(unJigglypuff.estado().estaQuemado(), false);
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
		assertEquals(unJigglypuff.estado().estaDormidoQuemado(), false);
	}

	@Test
	public void test08JigglypuffUsa2VecesCantoyUsandoUnaVitaminaRestauraLos2AtaquesCanto() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unJigglypuff);
		unJigglypuff.atacarCon("Canto", unCharmander);
		unJigglypuff.atacarCon("Canto", unCharmander);
		unJugador.usarElemento(unJugador.sacarVitamina());
		assertEquals(unJigglypuff.cantidadAtaquesDisponibles("Canto"), 6);
	}

	@Test
	public void test09igglypuffUsaCantoyUsandoUnaVitaminaRestaura1AtaqueCantoYaQueNoPuedePasarElMaximo() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unJigglypuff);
		unJigglypuff.atacarCon("Canto", unCharmander);
		unJugador.usarElemento(unJugador.sacarVitamina());
		assertEquals(unJigglypuff.cantidadAtaquesDisponibles("Canto"), 6);
	}

	@Test
	public void test10CharmanderSeQuedaSinFogonazoYRestaura2UsandoVitamina() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unCharmander);
		unCharmander.atacarCon("Fogonazo", unJigglypuff);
		unCharmander.atacarCon("Fogonazo", unJigglypuff);
		unCharmander.atacarCon("Fogonazo", unJigglypuff);
		unCharmander.atacarCon("Fogonazo", unJigglypuff);
		unJugador.usarElemento(unJugador.sacarVitamina());
		assertEquals(unCharmander.cantidadAtaquesDisponibles("Fogonazo"), 2);
	}
	
	@Test
	public void test11CharmanderUsa2FogonazosYAtaquesRapidosYSeRestauranUsandoVitamina() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unCharmander);
		unCharmander.atacarCon("Fogonazo", unJigglypuff);
		unCharmander.atacarCon("Fogonazo", unJigglypuff);
		unCharmander.atacarCon("Ataque rapido", unJigglypuff);
		unCharmander.atacarCon("Ataque rapido", unJigglypuff);
		unJugador.usarElemento(unJugador.sacarVitamina());
		assertEquals(unCharmander.cantidadAtaquesDisponibles("Fogonazo"), 4);
		assertEquals(unCharmander.cantidadAtaquesDisponibles("Ataque rapido"), 16);
	}
	
	@Test
	public void test12CharmanderNoUsoAtaquesYUsaVitamina() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unCharmander);
		unJugador.usarElemento(unJugador.sacarVitamina());
		assertEquals(unCharmander.cantidadAtaquesDisponibles("Fogonazo"), 4);
	}
}
