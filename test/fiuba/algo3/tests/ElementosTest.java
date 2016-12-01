package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import fiuba.algo3.modelo.Jugador;
import fiuba.algo3.modelo.algomones.Charmander;
import fiuba.algo3.modelo.algomones.Jigglypuff;
import fiuba.algo3.modelo.algomones.Squirtle;
import fiuba.algo3.modelo.ataques.TipoAtaque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;
import fiuba.algo3.modelo.excepciones.ElementoNoDisponibleException;

public class ElementosTest {

	@Test
	public void test01ChamanderEstaDebilitado20puntosYseCura20PuntosDeVidaConUnaPocion() throws AtaqueNoDisponibleException, ElementoNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle = new Squirtle();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unCharmander);
		int vida = unCharmander.getPuntosVidaActuales();
		unSquirtle.atacarCon(TipoAtaque.Burbuja,unCharmander);
		unJugador.usarElemento(unJugador.sacarPocion());
		assertEquals(unCharmander.getPuntosVidaActuales(),vida);
	}

	@Test
	public void test02ChamanderEstaDebilitado40puntosYseCura40PuntosDeVidaConUnaSuperPocion() throws AtaqueNoDisponibleException, ElementoNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle = new Squirtle();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unCharmander);
		int vida = unCharmander.getPuntosVidaActuales();
		unSquirtle.atacarCon(TipoAtaque.Burbuja,unCharmander);
		unSquirtle.atacarCon(TipoAtaque.Burbuja,unCharmander);
		unJugador.usarElemento(unJugador.sacarSuperPocion());
		assertEquals(unCharmander.getPuntosVidaActuales(),vida);
	}

	@Test
	public void test03ChamanderEstaDebilitado60puntosYseCura60PuntosDeVidaConUnaSuperPocionYunaPocion() throws AtaqueNoDisponibleException, ElementoNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle = new Squirtle();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unCharmander);
		int vida = unCharmander.getPuntosVidaActuales();
		unSquirtle.atacarCon(TipoAtaque.Burbuja,unCharmander);
		unSquirtle.atacarCon(TipoAtaque.Burbuja,unCharmander);
		unSquirtle.atacarCon(TipoAtaque.Burbuja,unCharmander);
		unJugador.usarElemento(unJugador.sacarSuperPocion());
		unJugador.usarElemento(unJugador.sacarPocion());
		assertEquals(unCharmander.getPuntosVidaActuales(),vida);
	}


	@Test
	public void test04ChamanderEstaDebilitado40puntosYseCura20PuntosDeVidaConUnaPocion() throws AtaqueNoDisponibleException, ElementoNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle = new Squirtle();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unCharmander);
		int vida = unCharmander.getPuntosVidaActuales();
		unSquirtle.atacarCon(TipoAtaque.Burbuja,unCharmander);
		unSquirtle.atacarCon(TipoAtaque.Burbuja,unCharmander);
		unJugador.usarElemento(unJugador.sacarPocion());
		assertEquals(unCharmander.getPuntosVidaActuales(),vida-20);
	}

	@Test
	public void test05ChamanderEstaDormidoYvuelveAestadoNormalConUnRestaurador() throws AtaqueNoDisponibleException, ElementoNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unCharmander);
		unJigglypuff.atacarCon(TipoAtaque.Canto,unCharmander);
		unJugador.usarElemento(unJugador.sacarRestaurador());
		assertEquals(unCharmander.estaDormido(), false);
	}

	@Test
	public void test06JigglypuffEstaQuemadoYvuelveAestadoNormalConUnRestaurador() throws AtaqueNoDisponibleException, ElementoNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unJigglypuff);
		unCharmander.atacarCon(TipoAtaque.Fogonazo,unJigglypuff);
		unJugador.usarElemento(unJugador.sacarRestaurador());
		assertEquals(unJigglypuff.estaQuemado(), false);
	}

	@Test
	public void test07JigglypuffEstaQuemadoYDormidoYvuelveAestadoNormalConUnRestaurador() throws AtaqueNoDisponibleException, ElementoNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jigglypuff otroJigglypuff = new Jigglypuff();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unJigglypuff);
		unCharmander.atacarCon(TipoAtaque.Fogonazo,unJigglypuff);
		otroJigglypuff.atacarCon(TipoAtaque.Canto, unJigglypuff);
		unJugador.usarElemento(unJugador.sacarRestaurador());
		assertEquals(unJigglypuff.estaDormidoQuemado(), false);
	}

	@Test
	public void test08JigglypuffUsa2VecesCantoyUsandoUnaVitaminaRestauraLos2AtaquesCanto() throws AtaqueNoDisponibleException, ElementoNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unJigglypuff);
		unJigglypuff.atacarCon(TipoAtaque.Canto, unCharmander);
		unJigglypuff.atacarCon(TipoAtaque.Canto, unCharmander);
		unJugador.usarElemento(unJugador.sacarVitamina());
		assertEquals(unJigglypuff.cantidadAtaquesDisponibles(TipoAtaque.Canto), 6);
	}

	@Test
	public void test09igglypuffUsaCantoyUsandoUnaVitaminaRestaura1AtaqueCantoYaQueNoPuedePasarElMaximo() throws AtaqueNoDisponibleException, ElementoNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unJigglypuff);
		unJigglypuff.atacarCon(TipoAtaque.Canto, unCharmander);
		unJugador.usarElemento(unJugador.sacarVitamina());
		assertEquals(unJigglypuff.cantidadAtaquesDisponibles(TipoAtaque.Canto), 6);
	}

	@Test
	public void test10CharmanderSeQuedaSinFogonazoYRestaura2UsandoVitamina() throws AtaqueNoDisponibleException, ElementoNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unCharmander);
		unCharmander.atacarCon(TipoAtaque.Fogonazo, unJigglypuff);
		unCharmander.atacarCon(TipoAtaque.Fogonazo, unJigglypuff);
		unCharmander.atacarCon(TipoAtaque.Fogonazo, unJigglypuff);
		unCharmander.atacarCon(TipoAtaque.Fogonazo, unJigglypuff);
		unJugador.usarElemento(unJugador.sacarVitamina());
		assertEquals(unCharmander.cantidadAtaquesDisponibles(TipoAtaque.Fogonazo), 2);
	}

	@Test
	public void test11CharmanderUsa2FogonazosYAtaquesRapidosYSeRestauranUsandoVitamina() throws AtaqueNoDisponibleException, ElementoNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unCharmander);
		unCharmander.atacarCon(TipoAtaque.Fogonazo, unJigglypuff);
		unCharmander.atacarCon(TipoAtaque.Fogonazo, unJigglypuff);
		unCharmander.atacarCon(TipoAtaque.AtaqueRapido, unJigglypuff);
		unCharmander.atacarCon(TipoAtaque.AtaqueRapido, unJigglypuff);
		unJugador.usarElemento(unJugador.sacarVitamina());
		assertEquals(unCharmander.cantidadAtaquesDisponibles(TipoAtaque.Fogonazo), 4);
		assertEquals(unCharmander.cantidadAtaquesDisponibles(TipoAtaque.AtaqueRapido), 16);
	}

	@Test
	public void test12CharmanderNoUsoAtaquesYUsaVitamina() throws AtaqueNoDisponibleException, ElementoNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unCharmander);
		unJugador.usarElemento(unJugador.sacarVitamina());
		assertEquals(unCharmander.cantidadAtaquesDisponibles(TipoAtaque.Fogonazo), 4);
	}
	
	@Test(expected = ElementoNoDisponibleException.class) 
	public void test13tiraExcepcionCuandoNoLeQuedanItemsDisponiblesDeUnTipo() throws AtaqueNoDisponibleException, ElementoNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Jugador unJugador = new Jugador();
		unJugador.agregarAlgomon(unSquirtle);
		unJugador.usarElemento(unJugador.sacarSuperPocion());
		unJugador.usarElemento(unJugador.sacarSuperPocion());
		unJugador.usarElemento(unJugador.sacarSuperPocion());
		unJugador.usarElemento(unJugador.sacarSuperPocion());
		unJugador.usarElemento(unJugador.sacarSuperPocion());
		unJugador.usarElemento(unJugador.sacarSuperPocion());
		unJugador.usarElemento(unJugador.sacarSuperPocion());
	}
}
