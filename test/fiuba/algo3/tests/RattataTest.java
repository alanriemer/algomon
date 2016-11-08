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
		
		int vida = unBulbasaur.getHealthPoints();
		unRattata.atacaConFogonazoAlEnemigo(unBulbasaur);
		assertEquals(unBulbasaur.getHealthPoints(),vida-2);
	}
	
	
	
}
