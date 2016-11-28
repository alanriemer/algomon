package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.algomones.Bulbasaur;
import fiuba.algo3.modelo.algomones.Chansey;
import fiuba.algo3.modelo.algomones.Charmander;
import fiuba.algo3.modelo.ataques.TipoAtaque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class EstadoAlgomonTest {

	@Test
	public void test01BulbasaurNoEstaDormidoPeroSiQuemadoLuegoDeUnAtaqueFogonazo() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();

		unCharmander.atacarCon(TipoAtaque.Fogonazo,unBulbasaur);

		assertEquals(unBulbasaur.estaDormido(),false);
		assertEquals(unBulbasaur.estaQuemado(),true);
	}

	@Test
	public void test02BulbasaurEstaDormidoPeroNoQuemadoLuegoDeUnAtaqueCanto() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Chansey unChansey = new Chansey();

		unChansey.atacarCon(TipoAtaque.Canto,unBulbasaur);

		assertEquals(unBulbasaur.estaDormido(),true);
		assertEquals(unBulbasaur.estaQuemado(),false);
	}

	@Test
	public void test03BulbasaurEstaDormidoYQuemadoLuegoDeDosAtaques() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Chansey unChansey = new Chansey();
		Charmander unCharmander = new Charmander();

		unCharmander.atacarCon(TipoAtaque.Fogonazo,unBulbasaur);
		unChansey.atacarCon(TipoAtaque.Canto,unBulbasaur);

		assertEquals(unBulbasaur.estaDormido(),true);
		assertEquals(unBulbasaur.estaQuemado(),true);
	}

	@Test
	public void test04BulbasaurRealizaAtaqueRapidoEnEstadoQuemadoYRecibe14deDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();

		unCharmander.atacarCon(TipoAtaque.Fogonazo,unBulbasaur);
		int vida = unBulbasaur.getPuntosVidaActuales(); //vidaBulbasaur = 136
		unBulbasaur.atacarCon(TipoAtaque.LatigoCepa, unCharmander);

		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-14);
	}

	@Test
	public void test05BulbasaurNoEstaDormidoNiQuemadoLuegoDeUnAtaque() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Chansey unChansey = new Chansey();

		unChansey.atacarCon(TipoAtaque.AtaqueRapido, unBulbasaur);

		assertEquals(unBulbasaur.estaDormido(),false);
		assertEquals(unBulbasaur.estaQuemado(),false);
	}

	@Test
	public void test06BulbasaurNoHaceDanioPor3TurnosAlEstarDormido() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Chansey unChansey = new Chansey();

		unChansey.atacarCon(TipoAtaque.Canto,unBulbasaur);

		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido, unChansey);
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido, unChansey);
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido, unChansey);

		assertEquals(unBulbasaur.estaDormido(),false);
		assertEquals(unChansey.getPuntosVidaActuales(), 130);
	}

	@Test
	public void test07BulbasaurDespiertaDeEstarDormidoYRealizaAtaqueRapido() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Chansey unChansey = new Chansey();

		unChansey.atacarCon(TipoAtaque.Canto,unBulbasaur);
		//Ataques que realiza mientras duerme y no hacen daño
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unChansey);
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unChansey);
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unChansey);

		//Despierta y realiza ataque con daño
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unChansey);

		assertEquals(unBulbasaur.estaDormido(),false);
		assertEquals(unChansey.getPuntosVidaActuales(), 120);
	}

	@Test
	public void test08BulbasaurDuermeyLuegoPasaAQuemadoDormidoYLuegoPasaSoloAQuemado() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Chansey unChansey = new Chansey();
		Charmander unCharmander = new Charmander();

		unChansey.atacarCon(TipoAtaque.Canto,unBulbasaur);
		//Ataques que realiza mientras duerme y no hacen daño
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unChansey);
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unChansey);
		//Pasa a quemado dormido
		unCharmander.atacarCon(TipoAtaque.Fogonazo, unBulbasaur);
		assertEquals(unBulbasaur.estaDormidoQuemado(),true);
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unChansey);

		//Despierta y realiza ataque con daño
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unChansey);

		assertEquals(unBulbasaur.estaQuemado(),true);
		assertEquals(unBulbasaur.estaDormido(),false);
		assertEquals(unChansey.getPuntosVidaActuales(), 120);
	}

	@Test
	public void test09BulbasaurPasaAQuemadoDormidoYRecibeDanio() throws AtaqueNoDisponibleException{
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();
		Chansey unChansey = new Chansey();

		assertEquals(unBulbasaur.estaDormidoQuemado(),false);
		unChansey.atacarCon(TipoAtaque.Canto,unBulbasaur);
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unChansey);
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unChansey);
		unCharmander.atacarCon(TipoAtaque.Fogonazo, unBulbasaur);
		assertEquals(unBulbasaur.estaDormidoQuemado(),true);
		int vidaAntes = unBulbasaur.getPuntosVidaActuales();
		unBulbasaur.atacarCon(TipoAtaque.LatigoCepa,unChansey);
		assertEquals(unBulbasaur.estaDormidoQuemado(),false);
		int vidaDespues = unBulbasaur.getPuntosVidaActuales();
		//14 es el 10% de la vida de Bulbasaur (140)
		assertEquals(vidaDespues, vidaAntes-14);
	}
}
