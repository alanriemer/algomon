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
		
		int vida = otroBulbasaur.getPuntosVida();
		unBulbasaur.atacaConLatigoCepaAlEnemigo(otroBulbasaur);
		
		assertEquals(otroBulbasaur.getPuntosVida(),vida-7);
	}
	
	@Test
	public void test02BulbasaurRealizaAtaqueRapidoContraOtroBulbasaurYHace10deDanio(){
		Bulbasaur unBulbasaur = new Bulbasaur();
		Bulbasaur otroBulbasaur = new Bulbasaur();
		
		int vida = otroBulbasaur.getPuntosVida();
		unBulbasaur.atacaConAtaqueRapidoAlEnemigo(otroBulbasaur);
		
		assertEquals(otroBulbasaur.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test03BulbasaurRealizaLatigoCepaContraSquirtleYHace30deDanio(){
		Bulbasaur unBulbasaur = new Bulbasaur();
		Squirtle otroSquirtle = new Squirtle();
		
		int vida = otroSquirtle.getPuntosVida();
		unBulbasaur.atacaConLatigoCepaAlEnemigo(otroSquirtle);
		
		assertEquals(otroSquirtle.getPuntosVida(),vida-30);
	}
	
	@Test
	public void test04BulbasaurRealizaAtaqueRapidoContraSquirtleYHace10deDanio(){
		Bulbasaur unBulbasaur = new Bulbasaur();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVida();
		unBulbasaur.atacaConAtaqueRapidoAlEnemigo(unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test05BulbasaurRealizaLatigoCepaContraCharmanderYHace7deDanio(){
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVida();
		unBulbasaur.atacaConLatigoCepaAlEnemigo(unCharmander);
		
		assertEquals(unCharmander.getPuntosVida(),vida-7);
	}
	
	@Test
	public void test06BulbasaurRealizaAtaqueRapidoContraCharmanderYHace10deDanio(){
		Bulbasaur unBulbasaur = new Bulbasaur();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVida();
		unBulbasaur.atacaConAtaqueRapidoAlEnemigo(unCharmander);
		
		assertEquals(unCharmander.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test07BulbasaurRealizaLatigoCepaContraRattataYHace15deDanio(){
		Bulbasaur unBulbasaur = new Bulbasaur();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVida();
		unBulbasaur.atacaConLatigoCepaAlEnemigo(unRattata);
		
		assertEquals(unRattata.getPuntosVida(),vida-15);
	}
	
	@Test
	public void test08BulbasaurRealizaAtaqueRapidoContraRattataYHace10deDanio(){
		Bulbasaur unBulbasaur = new Bulbasaur();
		Rattata unRattata = new Rattata();
		
		int vida = unRattata.getPuntosVida();
		unBulbasaur.atacaConAtaqueRapidoAlEnemigo(unRattata);
		
		assertEquals(unRattata.getPuntosVida(),vida-10);
	}
}
