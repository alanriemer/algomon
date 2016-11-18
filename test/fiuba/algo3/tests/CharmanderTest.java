package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;
import fiuba.algo3.modelo.algomones.Bulbasaur;
import fiuba.algo3.modelo.algomones.Charmander;
import fiuba.algo3.modelo.algomones.Rattata;
import fiuba.algo3.modelo.algomones.Squirtle;

public class CharmanderTest {
	
	@Test
	public void test01CharmanderRealizaBrasasContraOtroCharmanderYHace8deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Charmander otroCharmander = new Charmander();
		
		int vida = otroCharmander.getPuntosVidaActuales();
		unCharmander.atacarCon("Brasas",otroCharmander);
		
		assertEquals(otroCharmander.getPuntosVidaActuales(),vida-8);
	}
	
	@Test
	public void test02CharmanderRealizaBrasasContraSquirtleYHace8deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVidaActuales();
		unCharmander.atacarCon("Brasas",unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVidaActuales(),vida-8);
	}
	
	@Test
	public void test03CharmanderRealizaBrasasContraBulbasaurYHace32deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unCharmander.atacarCon("Brasas",unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-32);
	}
	
	@Test
	public void test04CharmanderRealizaAtaqueRapidoContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unCharmander.atacarCon("Ataque rapido",unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test05CharmanderRealizaAtaqueRapidoContraSquirtleYHace10deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVidaActuales();
		unCharmander.atacarCon("Ataque rapido",unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test06CharmanderRealizaAtaqueRapidoContraOtroCharmanderYHace10deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Charmander otroCharmander = new Charmander();
		
		int vida = otroCharmander.getPuntosVidaActuales();
		unCharmander.atacarCon("Ataque rapido",otroCharmander);
		
		assertEquals(otroCharmander.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test07CharmanderRealizaAtaqueRapidoContraRattataYHace10deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVidaActuales();
		unCharmander.atacarCon("Ataque rapido",unRattata);
		
		assertEquals(unRattata.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test08CharmanderRealizaBrasasContraRattataYHace16deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVidaActuales();
		unCharmander.atacarCon("Brasas",unRattata);
		
		assertEquals(unRattata.getPuntosVidaActuales(),vida-16);
	}
	
	@Test
	public void test09CharmanderRealizaFogonazoContraRattataYHace2deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVidaActuales();
		unCharmander.atacarCon("Fogonazo",unRattata);
		
		assertEquals(unRattata.getPuntosVidaActuales(),vida-2);
	}
	
	@Test
	public void test10CharmanderRealizaFogonazoContraBulbasaurYHace2deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unCharmander.atacarCon("Fogonazo",unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-4);
	}
	
	@Test
	public void test11CharmanderRealizaAtaqueRapidoContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unCharmander.atacarCon("Ataque rapido",unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test12CharmanderRealizaFogonazoContraBulbasaurYQuedaQuemado() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		unCharmander.atacarCon("Fogonazo",unBulbasaur);
		
		assertEquals(unBulbasaur.estaQuemado(), true);
	}
	

	@Test (expected = AtaqueNoDisponibleException.class)	
	public void test13CharmanderRealizaFogonazoSeLeAgotaYLanzaExcepcion() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unCharmander.atacarCon("Fogonazo",unBulbasaur);
		unCharmander.atacarCon("Fogonazo",unBulbasaur);
		unCharmander.atacarCon("Fogonazo",unBulbasaur);
		unCharmander.atacarCon("Fogonazo",unBulbasaur);
		unCharmander.atacarCon("Fogonazo",unBulbasaur);
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-16); //Resta sólo los 4 primeros ataques
		
	}	
	
	@Test
	public void test14CharmanderAtacaAUnAlgomonPorMasDeSuVidaYElAlgomonAtacadoQuedaEn0() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		unCharmander.atacarCon("Brasas", unBulbasaur);
		unCharmander.atacarCon("Brasas", unBulbasaur);
		unCharmander.atacarCon("Brasas", unBulbasaur);
		unCharmander.atacarCon("Brasas", unBulbasaur);
		unCharmander.atacarCon("Brasas", unBulbasaur);
		assertEquals(unBulbasaur.getPuntosVidaActuales(), 0);
	}
}
