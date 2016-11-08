package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Charmander;
import fiuba.algo3.modelo.Rattata;
import fiuba.algo3.modelo.Squirtle;

public class BulbasaurTest {
	@Test
	public void test01BulbasaurRealizaLatigoCepaContraOtroBulbasaurYHace7deDanio(){
		Bulbasaur unBulbasaur = new Bulbasaur();
		Bulbasaur otroBulbasaur = new Bulbasaur();
		
		int vida = otroBulbasaur.getHealthPoints();
		unBulbasaur.atacaConLatigoCepaAlEnemigo(otroBulbasaur);
		
		assertEquals(otroBulbasaur.getHealthPoints(),vida-7);
	}
	
	@Test
	public void test02BulbasaurRealizaAtaqueRapidoContraOtroBulbasaurYHace10deDanio(){
		Bulbasaur unBulbasaur = new Bulbasaur();
		Bulbasaur otroBulbasaur = new Bulbasaur();
		
		int vida = otroBulbasaur.getHealthPoints();
		unBulbasaur.atacaConAtaqueRapidoAlEnemigo(otroBulbasaur);
		
		assertEquals(otroBulbasaur.getHealthPoints(),vida-10);
	}
	
	@Test
	public void test03BulbasaurRealizaLatigoCepaContraSquirtleYHace30deDanio(){
		Bulbasaur unBulbasaur = new Bulbasaur();
		Squirtle otroSquirtle = new Squirtle();
		
		int vida = otroSquirtle.getHealthPoints();
		unBulbasaur.atacaConLatigoCepaAlEnemigo(otroSquirtle);
		
		assertEquals(otroSquirtle.getHealthPoints(),vida-30);
	}
	
	@Test
	public void test04BulbasaurRealizaAtaqueRapidoContraSquirtleYHace10deDanio(){
		Bulbasaur unBulbasaur = new Bulbasaur();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getHealthPoints();
		unBulbasaur.atacaConAtaqueRapidoAlEnemigo(unSquirtle);
		
		assertEquals(unSquirtle.getHealthPoints(),vida-10);
	}
	
	@Test
	public void test05BulbasaurRealizaLatigoCepaContraCharmanderYHace7deDanio(){
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getHealthPoints();
		unBulbasaur.atacaConLatigoCepaAlEnemigo(unCharmander);
		
		assertEquals(unCharmander.getHealthPoints(),vida-7);
	}
	
	@Test
	public void test06BulbasaurRealizaAtaqueRapidoContraCharmanderYHace10deDanio(){
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getHealthPoints();
		unBulbasaur.atacaConAtaqueRapidoAlEnemigo(unCharmander);
		
		assertEquals(unCharmander.getHealthPoints(),vida-10);
	}
	
	@Test
	public void test07BulbasaurRealizaLatigoCepaContraRattataYHace15deDanio(){
		Bulbasaur unBulbasaur = new Bulbasaur();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getHealthPoints();
		unBulbasaur.atacaConLatigoCepaAlEnemigo(unRattata);
		
		assertEquals(unRattata.getHealthPoints(),vida-15);
	}
	
	@Test
	public void test08BulbasaurRealizaAtaqueRapidoContraRattataYHace10deDanio(){
		Bulbasaur unBulbasaur = new Bulbasaur();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getHealthPoints();
		unBulbasaur.atacaConAtaqueRapidoAlEnemigo(unRattata);
		
		assertEquals(unRattata.getHealthPoints(),vida-10);
	}
}
