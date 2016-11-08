package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.Bulbasaur;

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
}
