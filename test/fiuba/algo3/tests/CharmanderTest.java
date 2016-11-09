package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Squirtle;
import fiuba.algo3.modelo.Rattata;
import fiuba.algo3.modelo.Charmander;

public class CharmanderTest {
	
	@Test
	public void test01CharmanderRealizaBrasasContraOtroCharmanderYHace8deDanio(){
		Charmander unCharmander = new Charmander();
		Charmander otroCharmander = new Charmander();
		
		int vida = otroCharmander.getPuntosVida();
		unCharmander.atacaConBrasasAlEnemigo(otroCharmander);
		
		assertEquals(otroCharmander.getPuntosVida(),vida-8);
	}
	
	@Test
	public void test02CharmanderRealizaBrasasContraSquirtleYHace8deDanio(){
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVida();
		unCharmander.atacaConBrasasAlEnemigo(unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVida(),vida-8);
	}
	
	@Test
	public void test03CharmanderRealizaBrasasContraBulbasaurYHace32deDanio(){
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unCharmander.atacaConBrasasAlEnemigo(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVida(),vida-32);
	}
	
	@Test
	public void test04CharmanderRealizaAtaqueRapidoContraBulbasaurYHace10deDanio(){
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unCharmander.atacaConAtaqueRapidoAlEnemigo(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test05CharmanderRealizaAtaqueRapidoContraSquirtleYHace10deDanio(){
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVida();
		unCharmander.atacaConAtaqueRapidoAlEnemigo(unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test06CharmanderRealizaAtaqueRapidoContraOtroCharmanderYHace10deDanio(){
		Charmander unCharmander = new Charmander();
		Charmander otroCharmander = new Charmander();
		
		int vida = otroCharmander.getPuntosVida();
		unCharmander.atacaConAtaqueRapidoAlEnemigo(otroCharmander);
		
		assertEquals(otroCharmander.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test07CharmanderRealizaAtaqueRapidoContraRattataYHace10deDanio(){
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVida();
		unCharmander.atacaConAtaqueRapidoAlEnemigo(unRattata);
		
		assertEquals(unRattata.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test08CharmanderRealizaBrasasContraRattataYHace16deDanio(){
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVida();
		unCharmander.atacaConBrasasAlEnemigo(unRattata);
		
		assertEquals(unRattata.getPuntosVida(),vida-16);
	}
	
	@Test
	public void test09CharmanderRealizaFogonazoContraRattataYHace2deDanio(){
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVida();
		unCharmander.atacaConFogonazoAlEnemigo(unRattata);
		
		assertEquals(unRattata.getPuntosVida(),vida-2);
	}
	
	@Test
	public void test10CharmanderRealizaFogonazoContraBulbasaurYHace2deDanio(){
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unCharmander.atacaConFogonazoAlEnemigo(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVida(),vida-4);
	}
}
