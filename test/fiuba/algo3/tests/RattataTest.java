package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Rattata;

public class RattataTest {

	@Test
	public void test01RattataAtacaConFogonazoContaBalbasurYHace4DeDanio(){
		Rattata unRattata = new Rattata();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unRattata.atacarConFogonazo(unBulbasaur);
		assertEquals(unBulbasaur.getPuntosVida(),vida-4);
	}
	
	@Test
	public void test02RattataAtacaConBurbujaContraBalbasurYHace5deDanio(){
		Rattata unRattata = new Rattata();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unRattata.atacarConBurbuja(unBulbasaur);
		assertEquals(unBulbasaur.getPuntosVida(),vida-5);
	}
	
	
	@Test
	public void test03RattataAtacaConAtaqueRapidoContraCharmanderYHace10deDanio(){
		Rattata unRattata = new Rattata();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unRattata.atacarConAtaqueRapido(unBulbasaur);
		assertEquals(unBulbasaur.getPuntosVida(),vida-10);
	}
	
	
}
