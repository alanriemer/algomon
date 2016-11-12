package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Chansey;
import fiuba.algo3.modelo.Charmander;
import fiuba.algo3.modelo.Squirtle;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;

public class ChanseyTest {
	
	@Test
	public void test01ChanseyRealizaLatigoCepaContraOtroChanseyYHace15deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Chansey otroChansey = new Chansey();
		
		int vida = otroChansey.getPuntosVidaActuales();
		unChansey.atacarConLatigoCepa(otroChansey);
		
		assertEquals(otroChansey.getPuntosVidaActuales(),vida-15);
	}
	
	@Test
	public void test02ChanseyRealizaLatigoCepaContraSquirtleYHace30deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVidaActuales();
		unChansey.atacarConLatigoCepa(unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVidaActuales(),vida-30);
	}
	
	@Test
	public void test03ChanseyRealizaLatigoCepaContraCharmanderYHace7deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVidaActuales();
		unChansey.atacarConLatigoCepa(unCharmander);
		
		assertEquals(unCharmander.getPuntosVidaActuales(),vida-7);
	}
	
	@Test
	public void test04ChanseyRealizaLatigoCepaContraBulbasaurYHace7deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unChansey.atacarConLatigoCepa(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-7);
	}
	
	@Test
	public void test05ChanseyRealizaAtaqueRapidoContraOtroChanseyYHace10deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Chansey otroChansey = new Chansey();
		
		int vida = otroChansey.getPuntosVidaActuales();
		unChansey.atacarConAtaqueRapido(otroChansey);
		
		assertEquals(otroChansey.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test06ChanseyRealizaAtaqueRapidoContraSquirtleYHace10deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVidaActuales();
		unChansey.atacarConAtaqueRapido(unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test07ChanseyRealizaAtaqueRapidoContraCharmanderYHace10deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVidaActuales();
		unChansey.atacarConAtaqueRapido(unCharmander);
		
		assertEquals(unCharmander.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test08ChanseyRealizaAtaqueRapidoContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unChansey.atacarConAtaqueRapido(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test09ChanseyRealizaCantoContraBulbasaurYLoDuerme() throws AtaqueNoDisponibleException{
		Chansey unChansey = new Chansey();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unChansey.atacarConCanto(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida);
		assertEquals(unBulbasaur.estaDormido(), true);
	}

}
