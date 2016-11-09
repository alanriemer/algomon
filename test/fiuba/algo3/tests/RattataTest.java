package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Rattata;

public class RattataTest {

	@Test
	public void test01RattataAtacaConFogonazoContaBalbasurYHace2DeDanioPorqueNoSeAplicaLaBonificacion(){
		Rattata unRattata = new Rattata();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unRattata.atacaConFogonazoAlEnemigo(unBulbasaur);
		assertEquals(unBulbasaur.getPuntosVida(),vida-2);
	}
	
	@Test
	public void test02RattataAtacaConBurbujaContraBalbasurYHace10deDanio(){
		Rattata unRattata = new Rattata();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unRattata.atacaConBurbujaAlEnemigo(unBulbasaur);
		assertEquals(unBulbasaur.getPuntosVida(),vida-10);
	}
	
	
	@Test
	public void test03RattataAtacaConAtaqueRapidoContraCharmanderYHace10deDanio(){
		Rattata unRattata = new Rattata();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unRattata.atacaConAtaqueRapidoAlEnemigo(unBulbasaur);
		assertEquals(unBulbasaur.getPuntosVida(),vida-10);
	}
	
	
}
