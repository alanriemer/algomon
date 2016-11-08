package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Charmander;
import fiuba.algo3.modelo.Rattata;
import fiuba.algo3.modelo.Squirtle;

public class SquirtleTest {
	
	@Test
	public void test01SquirtleRealizaBurbujaContraOtroSquirtleYHace5deDanio(){
		Squirtle unSquirtle = new Squirtle();
		Squirtle otroSquirtle = new Squirtle();
		
		int vida = otroSquirtle.getHealthPoints();
		unSquirtle.atacaConBurbujaAlEnemigo(otroSquirtle);
		
		assertEquals(otroSquirtle.getHealthPoints(),vida-5);
	}
	
	@Test
	public void test02SquirtleRealizaCanionDeAguaContraOtroSquirtleYHace10deDanio(){
		Squirtle unSquirtle = new Squirtle();
		Squirtle otroSquirtle = new Squirtle();
		
		int vida = otroSquirtle.getHealthPoints();
		unSquirtle.atacaConCanionDeAguaAlEnemigo(otroSquirtle);
		
		assertEquals(otroSquirtle.getHealthPoints(),vida-10);
	}
	
	@Test
	public void test03SquirtleRealizaAtaqueRapidoContraOtroSquirtleYHace10deDanio(){
		Squirtle unSquirtle = new Squirtle();
		Squirtle otroSquirtle = new Squirtle();
		
		int vida = otroSquirtle.getHealthPoints();
		unSquirtle.atacaConAtaqueRapidoAlEnemigo(otroSquirtle);
		
		assertEquals(otroSquirtle.getHealthPoints(),vida-10);
	}
	
	@Test
	public void test04SquirtleRealizaBurbujaContraCharmanderYHace20deDanio(){
		Squirtle unSquirtle = new Squirtle();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getHealthPoints();
		unSquirtle.atacaConBurbujaAlEnemigo(unCharmander);
		
		assertEquals(unCharmander.getHealthPoints(),vida-20);
	}
	
	@Test
	public void test05SquirtleRealizaCanionDeAguaContraCharmanderYHace40deDanio(){
		Squirtle unSquirtle = new Squirtle();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getHealthPoints();
		unSquirtle.atacaConCanionDeAguaAlEnemigo(unCharmander);
		
		assertEquals(unCharmander.getHealthPoints(),vida-40);
	}
	
	@Test
	public void test06SquirtleRealizaAtaqueRapidoContraCharmanderYHace10deDanio(){
		Squirtle unSquirtle = new Squirtle();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getHealthPoints();
		unSquirtle.atacaConAtaqueRapidoAlEnemigo(unCharmander);		
		
		assertEquals(unCharmander.getHealthPoints(),vida-10);
	}
	
	@Test
	public void test07SquirtleRealizaBurbujaContraBulbasaurYHace5deDanio(){
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getHealthPoints();
		unSquirtle.atacaConBurbujaAlEnemigo(unBulbasaur);
		
		assertEquals(unBulbasaur.getHealthPoints(),vida-5);
	}
	
	@Test
	public void test08SquirtleRealizaCanionDeAguaContraBulbasaurYHace10deDanio(){
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getHealthPoints();
		unSquirtle.atacaConCanionDeAguaAlEnemigo(unBulbasaur);
		
		assertEquals(unBulbasaur.getHealthPoints(),vida-10);
	}
	
	@Test
	public void test09SquirtleRealizaAtaqueRapidoContraBulbasaurYHace10deDanio(){
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getHealthPoints();
		unSquirtle.atacaConAtaqueRapidoAlEnemigo(unBulbasaur);
		
		assertEquals(unBulbasaur.getHealthPoints(),vida-10);
	}	
	
	@Test
	public void test10SquirtleRealizaBurbujaContraRattataYHace10deDanio(){
		Squirtle unSquirtle = new Squirtle();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getHealthPoints();
		unSquirtle.atacaConBurbujaAlEnemigo(unRattata);
		
		assertEquals(unRattata.getHealthPoints(),vida-10);
	}
	
	@Test
	public void test11SquirtleRealizaCanionDeAguaContraRattataYHace20deDanio(){
		Squirtle unSquirtle = new Squirtle();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getHealthPoints();
		unSquirtle.atacaConCanionDeAguaAlEnemigo(unRattata);
		
		assertEquals(unRattata.getHealthPoints(),vida-20);
	}
	
	@Test
	public void test12SquirtleRealizaAtaqueRapidoContraRattataYHace10deDanio(){
		Squirtle unSquirtle = new Squirtle();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getHealthPoints();
		unSquirtle.atacaConAtaqueRapidoAlEnemigo(unRattata);
		
		assertEquals(unRattata.getHealthPoints(),vida-10);
	}
}
