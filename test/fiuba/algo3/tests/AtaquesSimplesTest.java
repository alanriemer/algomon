package fiuba.algo3.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import fiuba.algo3.modelo.*;

public class AtaquesSimplesTest {

	@Test
	public void test01SquirtleAtacaConBurbujaYCanionACharmander(){
		Squirtle unSquirtle = new Squirtle();
		Charmander unCharmander = new Charmander();
		int vidaCharmander = unCharmander.getHealthPoints();
		unSquirtle.atacarConBurbuja(unCharmander);
		int vidaCharmanderBurbuja = unCharmander.getHealthPoints();
		unSquirtle.atacarConCanionDeAgua(unCharmander);		
		assertEquals(vidaCharmander-vidaCharmanderBurbuja,20);
		assertEquals(unCharmander.getHealthPoints(),110);
	}
	
	@Test
	public void test02SquirtleAtacaConBurbujaYCanionABulbasaur(){
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur= new Bulbasaur();
		int vidaBulbasaur = unBulbasaur.getHealthPoints();
		unSquirtle.atacarConBurbuja(unBulbasaur);
		int vidaBulbasaurBurbuja = unBulbasaur.getHealthPoints();
		unSquirtle.atacarConCanionDeAgua(unBulbasaur);		
		assertEquals(vidaBulbasaur-vidaBulbasaurBurbuja,5);
		assertEquals(unBulbasaur.getHealthPoints(),125);
	}
	
	@Test
	public void test03SquirtleAtacaConBurbujaYCanionADemasCriaturas(){
		int danioBurbuja = 0;
		int danioCanion = 0;
		
		Squirtle unSquirtle = new Squirtle();
		Chansey unChansey= new Chansey();
		int vidaChansey = unChansey.getHealthPoints();
		
		unSquirtle.atacarConBurbuja(unChansey);
		danioBurbuja = vidaChansey - unChansey.getHealthPoints();
		unSquirtle.atacarConCanionDeAgua(unChansey);	
		danioCanion = vidaChansey + danioBurbuja - unChansey.getHealthPoints();
		
		Rattata unRattata= new Rattata();
		int vidaRattata = unRattata.getHealthPoints();
		
		unSquirtle.atacarConBurbuja(unRattata);
		danioBurbuja = danioBurbuja + (vidaRattata - unRattata.getHealthPoints());
		unSquirtle.atacarConCanionDeAgua(unRattata);	
		danioCanion = (vidaRattata + danioBurbuja - unRattata.getHealthPoints());
		
		Jigglypuff unJigglypuff= new Jigglypuff();
		int vidaJigglypuff = unJigglypuff.getHealthPoints();
		
		unSquirtle.atacarConBurbuja(unJigglypuff);
		danioBurbuja = danioBurbuja + (vidaJigglypuff - unJigglypuff.getHealthPoints());
		unSquirtle.atacarConCanionDeAgua(unJigglypuff);	
		danioCanion = (vidaJigglypuff + danioBurbuja - unJigglypuff.getHealthPoints());
		
		assertEquals(danioBurbuja,30);
		assertEquals(danioCanion,60);
	}
	
	@Test
	public void test04BulbasaurYChanseyAtacanConLatigoCepaASquirtle(){
		Squirtle unSquirtle = new Squirtle();
		Chansey unChansey= new Chansey();
		Bulbasaur unBulbasaur= new Bulbasaur();
		int vidaSquirtle = unSquirtle.getHealthPoints();
		
		unBulbasaur.atacarConLatigoCepa(unSquirtle);
		int danioBulba = vidaSquirtle - unSquirtle.getHealthPoints();
		
		unChansey.atacarConLatigoCepa(unSquirtle);
		
		int danioChansey = vidaSquirtle - danioBulba - unSquirtle.getHealthPoints();
		
		assertEquals(danioBulba,30);
		assertEquals(danioChansey,30);		
	}
	
	@Test
	public void test05BulbasaurYChanseyAtacanConLatigoCepaACharmander(){

		Chansey unChansey= new Chansey();
		Bulbasaur unBulbasaur= new Bulbasaur();
		Charmander unCharmander = new Charmander();		
		int vidaCharmander = unCharmander.getHealthPoints();
		
		unBulbasaur.atacarConLatigoCepa(unCharmander);
		int danioBulba = vidaCharmander - unCharmander.getHealthPoints();
		
		unChansey.atacarConLatigoCepa(unCharmander);
		
		int danioChansey = vidaCharmander - danioBulba - unCharmander.getHealthPoints();

		assertEquals(danioBulba,7);
		assertEquals(danioChansey,7);	
		
	}
	
	@Test
	public void test06BulbasaurYChanseyAtacanConLatigoCepaADemasCriaturas(){

		Chansey unChansey= new Chansey();
		Bulbasaur unBulbasaur= new Bulbasaur();
		
		Rattata unRattata = new Rattata();		
		int vidaRattata = unRattata.getHealthPoints();
		
		unBulbasaur.atacarConLatigoCepa(unRattata);
		int danioBulba = vidaRattata - unRattata.getHealthPoints();
		unChansey.atacarConLatigoCepa(unRattata);
		
		int danioChansey = vidaRattata - danioBulba - unRattata.getHealthPoints();

		assertEquals(danioBulba,15);
		assertEquals(danioChansey,15);		
	}
	
	@Test
	public void test07CharmanderAtacaConBrasasABulbasaur(){
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur= new Bulbasaur();
		
		int vidaBulbasaur = unBulbasaur.getHealthPoints();
		unCharmander.atacarConBrasas(unBulbasaur);
		int danioCharmander = vidaBulbasaur - unBulbasaur.getHealthPoints();
		assertEquals(danioCharmander,32);
	}
	
	@Test
	public void test08CharmanderAtacaConBrasasASquirtle(){
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle= new Squirtle();
		
		int vidaSquirtle = unSquirtle.getHealthPoints();
		unCharmander.atacarConBrasas(unSquirtle);
		int danioCharmander = vidaSquirtle - unSquirtle.getHealthPoints();
		assertEquals(danioCharmander,8);		
	}
	
	@Test
	public void test09CharmanderAtacaConBrasasADemasCriaturas(){
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();		
		int vidaRattata = unRattata.getHealthPoints();
		
		unCharmander.atacarConBrasas(unRattata);
		int danioCharmander = vidaRattata - unRattata.getHealthPoints();
		assertEquals(danioCharmander,16);			
	}
	
	@Test
	public void test10AlgomonesAtacanConAtaqueRapido(){
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle= new Squirtle();
		
		int vidaSquirtle = unSquirtle.getHealthPoints();
		unCharmander.atacarConAtaqueRapido(unSquirtle);
		int danioCharmander = vidaSquirtle - unSquirtle.getHealthPoints();
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
