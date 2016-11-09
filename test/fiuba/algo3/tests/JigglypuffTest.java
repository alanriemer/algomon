package fiuba.algo3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Jigglypuff;
import fiuba.algo3.modelo.Charmander;
import fiuba.algo3.modelo.Squirtle;

public class JigglypuffTest {
	
	@Test
	public void test01JigglypuffRealizaBurbujaContraOtroJigglypuffYHace10deDanio(){
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jigglypuff otroJigglypuff = new Jigglypuff();
		
		int vida = otroJigglypuff.getPuntosVida();
		unJigglypuff.atacarConBurbuja(otroJigglypuff);
		
		assertEquals(otroJigglypuff.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test02JigglypuffRealizaBurbujaContraSquirtleYHace5deDanio(){
		Jigglypuff unJigglypuff = new Jigglypuff();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVida();
		unJigglypuff.atacarConBurbuja(unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVida(),vida-5);
	}
	
	@Test
	public void test03JigglypuffRealizaBurbujaContraCharmanderYHace20deDanio(){
		Jigglypuff unJigglypuff = new Jigglypuff();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVida();
		unJigglypuff.atacarConBurbuja(unCharmander);
		
		assertEquals(unCharmander.getPuntosVida(),vida-20);
	}
	
	@Test
	public void test04JigglypuffRealizaBurbujaContraBulbasaurYHace5deDanio(){
		Jigglypuff unJigglypuff = new Jigglypuff();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unJigglypuff.atacarConBurbuja(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVida(),vida-5);
	}
	
	@Test
	public void test05JigglypuffRealizaAtaqueRapidoContraOtroJigglypuffYHace10deDanio(){
		Jigglypuff unJigglypuff = new Jigglypuff();
		Jigglypuff otroJigglypuff = new Jigglypuff();
		
		int vida = otroJigglypuff.getPuntosVida();
		unJigglypuff.atacarConAtaqueRapido(otroJigglypuff);
		
		assertEquals(otroJigglypuff.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test06JigglypuffRealizaAtaqueRapidoContraSquirtleYHace10deDanio(){
		Jigglypuff unJigglypuff = new Jigglypuff();
		Squirtle unSquirtle = new Squirtle();
		
		int vida = unSquirtle.getPuntosVida();
		unJigglypuff.atacarConAtaqueRapido(unSquirtle);
		
		assertEquals(unSquirtle.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test07JigglypuffRealizaAtaqueRapidoContraCharmanderYHace10deDanio(){
		Jigglypuff unJigglypuff = new Jigglypuff();
		Charmander unCharmander = new Charmander();
		
		int vida = unCharmander.getPuntosVida();
		unJigglypuff.atacarConAtaqueRapido(unCharmander);
		
		assertEquals(unCharmander.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test08JigglypuffRealizaAtaqueRapidoContraBulbasaurYHace10deDanio(){
		Jigglypuff unJigglypuff = new Jigglypuff();
		Bulbasaur unBulbasaur = new Bulbasaur();
		
		int vida = unBulbasaur.getPuntosVida();
		unJigglypuff.atacarConAtaqueRapido(unBulbasaur);
		
		assertEquals(unBulbasaur.getPuntosVida(),vida-10);
	}
	
	@Test
	public void test09JigglypuffRealizaCantoContraBulbasaurYLoDuerme(){
	}

}
