package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Squirtle;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;
import fiuba.algo3.modelo.Rattata;
import fiuba.algo3.modelo.Charmander;

public class CharmanderTest {
	
	@Test
	public void test01CharmanderRealizaBrasasContraOtroCharmanderYHace8deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Charmander otroCharmander = new Charmander();
		
		int vida = otroCharmander.getPuntosVidaActuales();
		unCharmander.atacarConBrasas(otroCharmander);
		
		assertEquals(otroCharmander.getPuntosVidaActuales(),vida-8);
	}
	
	@Test
	public void test02CharmanderRealizaBrasasContraSquirtleYHace8deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVidaActuales();
		unCharmander.atacarConBrasas(unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVidaActuales(),vida-8);
	}
	
	@Test
	public void test03CharmanderRealizaBrasasContraBulbasaurYHace32deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unCharmander.atacarConBrasas(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-32);
	}
	
	@Test
	public void test04CharmanderRealizaAtaqueRapidoContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unCharmander.atacarConAtaqueRapido(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test05CharmanderRealizaAtaqueRapidoContraSquirtleYHace10deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVidaActuales();
		unCharmander.atacarConAtaqueRapido(unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test06CharmanderRealizaAtaqueRapidoContraOtroCharmanderYHace10deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Charmander otroCharmander = new Charmander();
		
		int vida = otroCharmander.getPuntosVidaActuales();
		unCharmander.atacarConAtaqueRapido(otroCharmander);
		
		assertEquals(otroCharmander.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test07CharmanderRealizaAtaqueRapidoContraRattataYHace10deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVidaActuales();
		unCharmander.atacarConAtaqueRapido(unRattata);
		
		assertEquals(unRattata.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test08CharmanderRealizaBrasasContraRattataYHace16deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVidaActuales();
		unCharmander.atacarConBrasas(unRattata);
		
		assertEquals(unRattata.getPuntosVidaActuales(),vida-16);
	}
	
	@Test
	public void test09CharmanderRealizaFogonazoContraRattataYHace2deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVidaActuales();
		unCharmander.atacarConFogonazo(unRattata);
		
		assertEquals(unRattata.getPuntosVidaActuales(),vida-2);
	}
	
	@Test
	public void test10CharmanderRealizaFogonazoContraBulbasaurYHace2deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unCharmander.atacarConFogonazo(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-4);
	}
	
	@Test
	public void test11CharmanderRealizaAtaqueRapidoContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unCharmander.atacarConAtaqueRapido(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-10);
	}
	
	@Test
	public void test12CharmanderRealizaFogonazoContraBulbasaurYQuedaQuemado() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		unCharmander.atacarConFogonazo(unBulbasaur);
		
		assertEquals(unBulbasaur.estaQuemado(), true);
	}
	

	@Test (expected = AtaqueNoDisponibleException.class)	
	public void test13CharmanderRealizaFogonazoSeLeAgotaYLanzaExcepcion() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVidaActuales();
		unCharmander.atacarConFogonazo(unBulbasaur);
		unCharmander.atacarConFogonazo(unBulbasaur);
		unCharmander.atacarConFogonazo(unBulbasaur);
		unCharmander.atacarConFogonazo(unBulbasaur);
		unCharmander.atacarConFogonazo(unBulbasaur);
		assertEquals(unBulbasaur.getPuntosVidaActuales(),vida-16); //Resta sólo los 4 primeros ataques
		
	}	
	
	@Test
	public void test14CharmanderAtacaAUnAlgomonPorMasDeSuVidaYElAlgomonAtacadoQuedaEn0() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		unCharmander.atacarConBrasas(unBulbasaur);
		unCharmander.atacarConBrasas(unBulbasaur);
		unCharmander.atacarConBrasas(unBulbasaur);
		unCharmander.atacarConBrasas(unBulbasaur);
		unCharmander.atacarConBrasas(unBulbasaur);		
		assertEquals(unBulbasaur.getPuntosVidaActuales(), 0);
	}
}
