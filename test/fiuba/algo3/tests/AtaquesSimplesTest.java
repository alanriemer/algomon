package fiuba.algo3.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.modelos.*;

public class AtaquesSimplesTest {

	@Test
	public void test01SquirtleAtacaConBurbujaYCanionACharmander(){
		Squirtle unSquirtle = new Squirtle();
		Charmander unCharmander = new Charmander();
		int vidaCharmander = unCharmander.getVida();
		unSquirtle.atacarConBurbuja(unCharmander);
		int vidaCharmanderBurbuja = unCharmander.getVida();
		unSquirtle.atacarConCanionDeAgua(unCharmander);		
		assertEquals(vidaCharmander-vidaCharmanderBurbuja,20);
		assertEquals(unCharmander.getVida(),110);
	}
	
	@Test
	public void test02SquirtleAtacaConBurbujaYCanionABulbasaur(){
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur= new Bulbasaur();
		int vidaBulbasaur = unBulbasaur.getVida();
		unSquirtle.atacarConBurbuja(unBulbasaur);
		int vidaBulbasaurBurbuja = unBulbasaur.getVida();
		unSquirtle.atacarConCanionDeAgua(unBulbasaur);		
		assertEquals(vidaBulbasaur-vidaBulbasaurBurbuja,5);
		assertEquals(unBulbasaur.getVida(),125);
	}
	
	@Test
	public void test03SquirtleAtacaConBurbujaYCanionADemasCriaturas(){
		int danioBurbuja = 0;
		int danioCanion = 0;
		
		Squirtle unSquirtle = new Squirtle();
		Chansey unChansey= new Chansey();
		int vidaChansey = unChansey.getVida();
		
		unSquirtle.atacarConBurbuja(unChansey);
		danioBurbuja = vidaChansey - unChansey.getVida();
		unSquirtle.atacarConCanionDeAgua(unChansey);	
		danioCanion = vidaChansey + danioBurbuja - unChansey.getVida();
		
		Rattata unRattata= new Rattata();
		int vidaRattata = unRattata.getVida();
		
		unSquirtle.atacarConBurbuja(unRattata);
		danioBurbuja = danioBurbuja + (vidaRattata - unRattata.getVida());
		unSquirtle.atacarConCanionDeAgua(unRattata);	
		danioCanion = (vidaRattata + danioBurbuja - unRattata.getVida());
		
		Jigglypuff unJigglypuff= new Jigglypuff();
		int vidaJigglypuff = unJigglypuff.getVida();
		
		unSquirtle.atacarConBurbuja(unJigglypuff);
		danioBurbuja = danioBurbuja + (vidaJigglypuff - unJigglypuff.getVida());
		unSquirtle.atacarConCanionDeAgua(unJigglypuff);	
		danioCanion = (vidaJigglypuff + danioBurbuja - unJigglypuff.getVida());
		
		assertEquals(danioBurbuja,30);
		assertEquals(danioCanion,60);
	}
	
	@Test
	public void test04BulbasaurYChanseyAtacanConLatigoCepaASquirtle(){
		Squirtle unSquirtle = new Squirtle();
		Chansey unChansey= new Chansey();
		Bulbasaur unBulbasaur= new Bulbasaur();
		int vidaSquirtle = unSquirtle.getVida();
		
		unBulbasaur.atacarConLatigoCepa(unSquirtle);
		int danioBulba = vidaSquirtle - unSquirtle.getVida();
		
		unChansey.atacarConLatigoCepa(unSquirtle);
		
		int danioChansey = vidaSquirtle - danioBulba - unSquirtle.getVida();
		
		assertEquals(danioBulba,30);
		assertEquals(danioChansey,30);		
	}
	
	@Test
	public void test05BulbasaurYChanseyAtacanConLatigoCepaACharmander(){

		Chansey unChansey= new Chansey();
		Bulbasaur unBulbasaur= new Bulbasaur();
		Charmander unCharmander = new Charmander();		
		int vidaCharmander = unCharmander.getVida();
		
		unBulbasaur.atacarConLatigoCepa(unCharmander);
		int danioBulba = vidaCharmander - unCharmander.getVida();
		
		unChansey.atacarConLatigoCepa(unCharmander);
		
		int danioChansey = vidaCharmander - danioBulba - unCharmander.getVida();

		assertEquals(danioBulba,7);
		assertEquals(danioChansey,7);	
		
	}
	
	@Test
	public void test06BulbasaurYChanseyAtacanConLatigoCepaADemasCriaturas(){

		Chansey unChansey= new Chansey();
		Bulbasaur unBulbasaur= new Bulbasaur();
		
		Rattata unRattata = new Rattata();		
		int vidaRattata = unRattata.getVida();
		
		unBulbasaur.atacarConLatigoCepa(unRattata);
		int danioBulba = vidaRattata - unRattata.getVida();
		unChansey.atacarConLatigoCepa(unRattata);
		
		int danioChansey = vidaRattata - danioBulba - unRattata.getVida();

		assertEquals(danioBulba,15);
		assertEquals(danioChansey,15);		
	}
	
	@Test
	public void test07CharmanderAtacaConBrasasABulbasaur(){
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur= new Bulbasaur();
		
		int vidaBulbasaur = unBulbasaur.getVida();
		unCharmander.atacarConBrasas(unBulbasaur);
		int danioCharmander = vidaBulbasaur - unBulbasaur.getVida();
		assertEquals(danioCharmander,32);
	}
	
	@Test
	public void test08CharmanderAtacaConBrasasASquirtle(){
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle= new Squirtle();
		
		int vidaSquirtle = unSquirtle.getVida();
		unCharmander.atacarConBrasas(unSquirtle);
		int danioCharmander = vidaSquirtle - unSquirtle.getVida();
		assertEquals(danioCharmander,8);		
	}
	
	@Test
	public void test09CharmanderAtacaConBrasasADemasCriaturas(){
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();		
		int vidaRattata = unRattata.getVida();
		
		unCharmander.atacarConBrasas(unRattata);
		int danioCharmander = vidaRattata - unRattata.getVida();
		assertEquals(danioCharmander,16);			
	}
	
	@Test
	public void test10AlgomonesAtacanConAtaqueRapido(){
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle= new Squirtle();
		
		int vidaSquirtle = unSquirtle.getVida();
		unCharmander.atacarConAtaqueRapido(unSquirtle);
		int danioCharmander = vidaSquirtle - unSquirtle.getVida();
		assertEquals(danioCharmander,10);		
	}
	
	@Test
	public void test11AlgomonesAgotanCantidadDeAtaques(){
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle= new Squirtle();
		unCharmander.atacarConFogonazo(unSquirtle);
		unCharmander.atacarConFogonazo(unSquirtle);
		unCharmander.atacarConFogonazo(unSquirtle);
		assertTrue(unCharmander.atacarConFogonazo(unSquirtle));//En el 4to uso da True
		assertFalse(unCharmander.atacarConFogonazo(unSquirtle)); //y acá False, ya no lo puede usar.
	}

}
