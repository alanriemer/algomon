package fiuba.algo3.tests;

import static org.junit.Assert.*;


import org.junit.Test;

import fiuba.algo3.modelo.algomones.Bulbasaur;
import fiuba.algo3.modelo.algomones.Charmander;
import fiuba.algo3.modelo.algomones.Jigglypuff;
import fiuba.algo3.modelo.algomones.Rattata;
import fiuba.algo3.modelo.algomones.Squirtle;
import fiuba.algo3.modelo.ataques.TipoAtaque;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class AtaquesConCambioDeEstado {

	@Test
	public void test01JigglypuffyChanseyAtacannConCantoYAlgomonAtacadoNoPuedeAtacarPor3turnos() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff= new Jigglypuff();
		Charmander unCharmander = new Charmander();
		unJigglypuff.atacarCon(TipoAtaque.Canto,unCharmander);
		unCharmander.atacarCon(TipoAtaque.AtaqueRapido,unJigglypuff);
		assertEquals(unJigglypuff.getPuntosVida(), unJigglypuff.getPuntosVidaActuales());
	}

	@Test
	public void test02bulbasaurAtacaConChupavidasACharmanderyLeQuita30PuntosYNOGanaPuntosDeVidaPorqueEstaAlMaximo() throws AtaqueNoDisponibleException {
		Bulbasaur unBulbasaur= new Bulbasaur();
		Charmander unCharmander = new Charmander();
		int vidaCharmander = unCharmander.getPuntosVidaActuales();
		int vidaBulbasaur = unBulbasaur.getPuntosVidaActuales();
		unBulbasaur.atacarCon(TipoAtaque.ChupaVidas,unCharmander);
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vidaBulbasaur);//Este test está mal en el TP.
		assertEquals(unCharmander.getPuntosVidaActuales(),vidaCharmander -7);
	}

	@Test
	public void test03bulbasaurAtacadoPorSquirtleConAtaqueRapidoYRecibe10DeDanioDespuesAtacaConChupavidasASquirtleYLeQuita30PuntosYGana9PuntosDeVida() throws AtaqueNoDisponibleException {
		Bulbasaur unBulbasaur = new Bulbasaur();
		Squirtle unSquirtle = new Squirtle();

		int vidaSquirtle = unSquirtle.getPuntosVidaActuales();
		int vidaBulbasaur = unBulbasaur.getPuntosVidaActuales();
		unSquirtle.atacarCon(TipoAtaque.AtaqueRapido,unBulbasaur);
		unBulbasaur.atacarCon(TipoAtaque.ChupaVidas,unSquirtle);
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vidaBulbasaur -1);//Este test está mal en el TP.
		assertEquals(unSquirtle.getPuntosVidaActuales(),vidaSquirtle -30);
	}

	@Test
	public void test04bulbasaurAtacaConChupavidasAOtrosAlgomonesYLesQuita15PuntosDeVidayAumenta4PuntosDeVida() throws AtaqueNoDisponibleException {
		Bulbasaur unBulbasaur= new Bulbasaur();
		Rattata unRattata = new Rattata();

		int vidaRattata = unRattata.getPuntosVidaActuales();
		unRattata.atacarCon(TipoAtaque.AtaqueRapido,unBulbasaur);
		int vidaBulbasaur = unBulbasaur.getPuntosVidaActuales();
		unBulbasaur.atacarCon(TipoAtaque.ChupaVidas,unRattata);
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vidaBulbasaur + 4);
		assertEquals(unRattata.getPuntosVidaActuales(),vidaRattata -15);
	}


	@Test
	public void test05JigglypuffyChanseyAtacannConCantoYAlgomonAtacadoNoPuedeAtacarPor3turnos() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff= new Jigglypuff();
		Bulbasaur unBulbasaur = new Bulbasaur();
		unJigglypuff.atacarCon(TipoAtaque.Canto,unBulbasaur);
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unJigglypuff);
		assertEquals(unJigglypuff.getPuntosVida(), unJigglypuff.getPuntosVidaActuales());
	}

	public void test06JigglypuffyChanseyAtacannConCantoYAlgomonLuegoSeRecupera() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff= new Jigglypuff();
		Bulbasaur unBulbasaur = new Bulbasaur();
		unJigglypuff.atacarCon(TipoAtaque.Canto,unBulbasaur);
		int vidaJigglypuff = unJigglypuff.getPuntosVidaActuales();
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unJigglypuff);

		assertEquals(unBulbasaur.getPuntosVidaActuales(),vidaJigglypuff + 10);
	}

	@Test
	public void test07JigglypuffAtacannConCantoYDespuesEsQuemadoYQuedaEnEstadoDormidoQuemado() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff= new Jigglypuff();
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();
		unJigglypuff.atacarCon(TipoAtaque.Canto,unBulbasaur);
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unJigglypuff);
		unCharmander.atacarCon(TipoAtaque.Fogonazo, unBulbasaur);
		assertEquals(unBulbasaur.estaDormidoQuemado(), true);
	}


	@Test
	public void test08JigglypuffAtacannConCantoYBulbasaurPasaUnTurnoDespuesEsQuemadoYLeFaltan2TurnosParaQueDormidoTermine() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff= new Jigglypuff();
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();
		unJigglypuff.atacarCon(TipoAtaque.Canto,unBulbasaur);
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unJigglypuff);
		unCharmander.atacarCon(TipoAtaque.Fogonazo, unBulbasaur);
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unJigglypuff);
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unJigglypuff);

		assertEquals(unBulbasaur.estaDormido(), false);
	}


	@Test
	public void test08JigglypuffAtacannConCantoYBulbasaurPasaUnTurnoDespuesEsQuemadoYPierdeVidaDurante2TurnosPorQuemaduras() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff= new Jigglypuff();
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();
		int vidaBulbasaur = unBulbasaur.getPuntosVida();
		unJigglypuff.atacarCon(TipoAtaque.Canto,unBulbasaur);
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unJigglypuff);
		unCharmander.atacarCon(TipoAtaque.Fogonazo, unBulbasaur); //-4
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unJigglypuff); //-14 108
		unBulbasaur.atacarCon(TipoAtaque.AtaqueRapido,unJigglypuff);

		assertEquals(unBulbasaur.getPuntosVidaActuales() , vidaBulbasaur-32);
	}


	@Test
	public void test09BulbasaurEstaQuemadoYdormidoYvuelveArecibirCantoYquedaEnEstadoQuemadoDormido() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff= new Jigglypuff();
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();
		unJigglypuff.atacarCon(TipoAtaque.Canto,unBulbasaur);
		unCharmander.atacarCon(TipoAtaque.Fogonazo, unBulbasaur);
		unJigglypuff.atacarCon(TipoAtaque.Canto,unBulbasaur);
		assertEquals(unBulbasaur.estaDormidoQuemado(), true);
	}
}
