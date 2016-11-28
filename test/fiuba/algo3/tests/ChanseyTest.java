package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.algomones.Bulbasaur;
import fiuba.algo3.modelo.algomones.Chansey;
import fiuba.algo3.modelo.algomones.Charmander;
import fiuba.algo3.modelo.algomones.Squirtle;
import fiuba.algo3.modelo.ataques.TipoAtaque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class ChanseyTest {

	@Test
	public void test01ChanseyRealizaLatigoCepaContraOtroChanseyYHace15deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Chansey otroChansey = new Chansey();

		int vida = otroChansey.getPuntosVidaActuales();
		unChansey.atacarCon(TipoAtaque.LatigoCepa,otroChansey);

		assertEquals(otroChansey.getPuntosVidaActuales(),vida-15);
	}

	@Test
	public void test02ChanseyRealizaLatigoCepaContraSquirtleYHace30deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Squirtle unSquirtle = new Squirtle();

		int vida = unSquirtle.getPuntosVidaActuales();
		unChansey.atacarCon(TipoAtaque.LatigoCepa,unSquirtle);

		assertEquals(unSquirtle.getPuntosVidaActuales(),vida-30);
	}

	@Test
	public void test03ChanseyRealizaLatigoCepaContraCharmanderYHace7deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Charmander unCharmander = new Charmander();

		int vida = unCharmander.getPuntosVidaActuales();
		unChansey.atacarCon(TipoAtaque.LatigoCepa,unCharmander);

		assertEquals(unCharmander.getPuntosVidaActuales(),vida-7);
	}

	@Test
	public void test04ChanseyRealizaLatigoCepaContraBulbasaurYHace7deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Bulbasaur unBulbasaur = new Bulbasaur();

		int vida = unBulbasaur.getPuntosVidaActuales();
		unChansey.atacarCon(TipoAtaque.LatigoCepa,unBulbasaur);

		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-7);
	}

	@Test
	public void test05ChanseyRealizaAtaqueRapidoContraOtroChanseyYHace10deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Chansey otroChansey = new Chansey();

		int vida = otroChansey.getPuntosVidaActuales();
		unChansey.atacarCon(TipoAtaque.AtaqueRapido,otroChansey);

		assertEquals(otroChansey.getPuntosVidaActuales(),vida-10);
	}

	@Test
	public void test06ChanseyRealizaAtaqueRapidoContraSquirtleYHace10deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Squirtle unSquirtle = new Squirtle();

		int vida = unSquirtle.getPuntosVidaActuales();
		unChansey.atacarCon(TipoAtaque.AtaqueRapido,unSquirtle);

		assertEquals(unSquirtle.getPuntosVidaActuales(),vida-10);
	}

	@Test
	public void test07ChanseyRealizaAtaqueRapidoContraCharmanderYHace10deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Charmander unCharmander = new Charmander();

		int vida = unCharmander.getPuntosVidaActuales();
		unChansey.atacarCon(TipoAtaque.AtaqueRapido,unCharmander);

		assertEquals(unCharmander.getPuntosVidaActuales(),vida-10);
	}

	@Test
	public void test08ChanseyRealizaAtaqueRapidoContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Bulbasaur unBulbasaur = new Bulbasaur();

		int vida = unBulbasaur.getPuntosVidaActuales();
		unChansey.atacarCon(TipoAtaque.AtaqueRapido,unBulbasaur);

		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-10);
	}

	@Test
	public void test09ChanseyRealizaCantoContraBulbasaurYLoDuerme() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Bulbasaur unBulbasaur = new Bulbasaur();

		int vida = unBulbasaur.getPuntosVidaActuales();
		unChansey.atacarCon(TipoAtaque.Canto,unBulbasaur);

		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida);
		assertEquals(unBulbasaur.estaDormido(), true);
	}

}
