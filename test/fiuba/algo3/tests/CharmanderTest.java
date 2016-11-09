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
		
		int vida = otroCharmander.getPuntosVida();
		unCharmander.atacarConBrasas(otroCharmander);
		
		assertEquals(otroCharmander.getPuntosVida(),vida-8);
	}
	
	@Test
	public void test02CharmanderRealizaBrasasContraSquirtleYHace8deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVida();
		unCharmander.atacarConBrasas(unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVida(),vida-8);
	}
	
	@Test
	public void test03CharmanderRealizaBrasasContraBulbasaurYHace32deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unCharmander.atacarConBrasas(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVida(),vida-32);
	}
	
	@Test
	public void test04CharmanderRealizaAtaqueRapidoContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unCharmander.atacarConAtaqueRapido(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test05CharmanderRealizaAtaqueRapidoContraSquirtleYHace10deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVida();
		unCharmander.atacarConAtaqueRapido(unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test06CharmanderRealizaAtaqueRapidoContraOtroCharmanderYHace10deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Charmander otroCharmander = new Charmander();
		
		int vida = otroCharmander.getPuntosVida();
		unCharmander.atacarConAtaqueRapido(otroCharmander);
		
		assertEquals(otroCharmander.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test07CharmanderRealizaAtaqueRapidoContraRattataYHace10deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVida();
		unCharmander.atacarConAtaqueRapido(unRattata);
		
		assertEquals(unRattata.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test08CharmanderRealizaBrasasContraRattataYHace16deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVida();
		unCharmander.atacarConBrasas(unRattata);
		
		assertEquals(unRattata.getPuntosVida(),vida-16);
	}
	
	@Test
	public void test09CharmanderRealizaFogonazoContraRattataYHace2deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVida();
		unCharmander.atacarConFogonazo(unRattata);
		
		assertEquals(unRattata.getPuntosVida(),vida-2);
	}
	
	@Test
	public void test10CharmanderRealizaFogonazoContraBulbasaurYHace2deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unCharmander.atacarConFogonazo(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVida(),vida-4);
	}
	
	@Test
	public void test11CharmanderRealizaAtaqueRapidoContraBulbasaurYHace10deDanio() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unCharmander.atacarConAtaqueRapido(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVida(),vida-10);
	}
	
	@Test (expected = AtaqueNoDisponibleException.class)	
	public void test12CharmanderRealizaFogonazoSeLeAgotaYLanzaExcepcion() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unCharmander.atacarConFogonazo(unBulbasaur);
		unCharmander.atacarConFogonazo(unBulbasaur);
		unCharmander.atacarConFogonazo(unBulbasaur);
		unCharmander.atacarConFogonazo(unBulbasaur);
		unCharmander.atacarConFogonazo(unBulbasaur);
		assertEquals(unBulbasaur.getPuntosVida(),vida-16); //Resta sólo los 4 primeros ataques
		
	}	
}
