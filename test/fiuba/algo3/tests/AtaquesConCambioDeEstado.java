package fiuba.algo3.tests;

import static org.junit.Assert.*;


import org.junit.Test;

import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Charmander;
import fiuba.algo3.modelo.Jigglypuff;
//import fiuba.algo3.modelo.Jigglypuff;
import fiuba.algo3.modelo.Rattata;
import fiuba.algo3.modelo.Squirtle;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class AtaquesConCambioDeEstado {
	
	@Test
	public void test01JigglypuffyChanseyAtacannConCantoYAlgomonAtacadoNoPuedeAtacarPor3turnos() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff= new Jigglypuff();
		Charmander unCharmander = new Charmander();	
		unJigglypuff.atacarCon("Canto",unCharmander);
		unCharmander.atacarCon("Ataque rapido",unJigglypuff);
		assertEquals(unJigglypuff.getPuntosVida(), unJigglypuff.getPuntosVidaActuales());
	}
	
	@Test
	public void test02bulbasaurAtacaConChupavidasACharmanderyLeQuita30PuntosYNOGanaPuntosDeVidaPorqueEstaAlMaximo() throws AtaqueNoDisponibleException {
		Bulbasaur unBulbasaur= new Bulbasaur();
		Charmander unCharmander = new Charmander();
		int vidaCharmander = unCharmander.getPuntosVidaActuales();
		int vidaBulbasaur = unBulbasaur.getPuntosVidaActuales();
		unBulbasaur.atacarCon("ChupaVidas",unCharmander);
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vidaBulbasaur);//Este test está mal en el TP.
		assertEquals(unCharmander.getPuntosVidaActuales(),vidaCharmander -7);
	}
	
	@Test	
	public void test03bulbasaurAtacadoPorSquirtleConAtaqueRapidoYRecibe10DeDanioDespuesAtacaConChupavidasASquirtleYLeQuita30PuntosYGana9PuntosDeVida() throws AtaqueNoDisponibleException {
		Bulbasaur unBulbasaur = new Bulbasaur();
		Squirtle unSquirtle = new Squirtle();
		
		int vidaSquirtle = unSquirtle.getPuntosVidaActuales();
		int vidaBulbasaur = unBulbasaur.getPuntosVidaActuales();
		unSquirtle.atacarCon("Ataque rapido",unBulbasaur);
		unBulbasaur.atacarCon("ChupaVidas",unSquirtle);
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vidaBulbasaur -1);//Este test está mal en el TP.
		assertEquals(unSquirtle.getPuntosVidaActuales(),vidaSquirtle -30);
	}	
	
	@Test
	public void test04bulbasaurAtacaConChupavidasAOtrosAlgomonesYLesQuita15PuntosDeVidayAumenta4PuntosDeVida() throws AtaqueNoDisponibleException {
		Bulbasaur unBulbasaur= new Bulbasaur();
		Rattata unRattata = new Rattata();
		
		int vidaRattata = unRattata.getPuntosVidaActuales();
		unRattata.atacarCon("Ataque rapido",unBulbasaur);
		int vidaBulbasaur = unBulbasaur.getPuntosVidaActuales();
		unBulbasaur.atacarCon("ChupaVidas",unRattata);
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vidaBulbasaur + 4);
		assertEquals(unRattata.getPuntosVidaActuales(),vidaRattata -15);		
	}
	

	@Test
	public void test05JigglypuffyChanseyAtacannConCantoYAlgomonAtacadoNoPuedeAtacarPor3turnos() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff= new Jigglypuff();
		Bulbasaur unBulbasaur = new Bulbasaur();	
		unJigglypuff.atacarCon("Canto",unBulbasaur);
		unBulbasaur.atacarCon("Ataque rapido",unJigglypuff);
		assertEquals(unJigglypuff.getPuntosVida(), unJigglypuff.getPuntosVidaActuales());
	}
	
	public void test06JigglypuffyChanseyAtacannConCantoYAlgomonLuegoSeRecupera() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff= new Jigglypuff();
		Bulbasaur unBulbasaur = new Bulbasaur();	
		unJigglypuff.atacarCon("Canto",unBulbasaur);
		int vidaJigglypuff = unJigglypuff.getPuntosVidaActuales();
		unBulbasaur.atacarCon("Ataque rapido",unJigglypuff);
		unBulbasaur.despertar();
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vidaJigglypuff + 10);
	}	
	
	@Test
	public void test07JigglypuffAtacannConCantoYDespuesEsQuemadoYQuedaEnEstadoDormidoQuemado() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff= new Jigglypuff();
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();
		unJigglypuff.atacarCon("Canto",unBulbasaur);
		unBulbasaur.atacarCon("Ataque rapido",unJigglypuff);
		unCharmander.atacarCon("Fogonazo", unBulbasaur);
		assertEquals(unBulbasaur.estaDormidoQuemado(), true);
	}
	
	
	@Test
	public void test08JigglypuffAtacannConCantoYBulbasaurPasaUnTurnoDespuesEsQuemadoYLeFaltan2TurnosParaQueDormidoTermine() throws AtaqueNoDisponibleException{
		Jigglypuff unJigglypuff= new Jigglypuff();
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();
		unJigglypuff.atacarCon("Canto",unBulbasaur);
		unBulbasaur.atacarCon("Ataque rapido",unJigglypuff);
		unCharmander.atacarCon("Fogonazo", unBulbasaur);
		unBulbasaur.atacarCon("Ataque rapido",unJigglypuff);
		unBulbasaur.atacarCon("Ataque rapido",unJigglypuff);
		
		assertEquals(unBulbasaur.estaDormido(), false);
	}

}
