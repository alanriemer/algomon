package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
}
