package fiuba.algo3.tests;
import static org.junit.Assert.*;
import org.junit.Test;
import fiuba.algo3.modelo.Bulbasaur;
import fiuba.algo3.modelo.Chansey;
import fiuba.algo3.modelo.Charmander;
import fiuba.algo3.modelo.Jigglypuff;
import fiuba.algo3.modelo.Rattata;
import fiuba.algo3.modelo.Squirtle;
import fiuba.algo3.modelo.excepciones.AtaqueNoDisponibleException;
public class AtaquesSimplesTest {
	@Test
	public void test01SquirtleAtacaConBurbujaYCanionACharmander() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Charmander unCharmander = new Charmander();
		int vidaCharmander = unCharmander.getPuntosVida();
		unSquirtle.atacarConBurbuja(unCharmander);
		int vidaCharmanderBurbuja = unCharmander.getPuntosVida();
		unSquirtle.atacarConCanionDeAgua(unCharmander);		
		assertEquals(vidaCharmander-vidaCharmanderBurbuja,20);
		assertEquals(unCharmander.getPuntosVida(),110);
	}
	
	@Test
	public void test02SquirtleAtacaConBurbujaYCanionABulbasaur() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Bulbasaur unBulbasaur= new Bulbasaur();
		int vidaBulbasaur = unBulbasaur.getPuntosVida();
		unSquirtle.atacarConBurbuja(unBulbasaur);
		int vidaBulbasaurBurbuja = unBulbasaur.getPuntosVida();
		unSquirtle.atacarConCanionDeAgua(unBulbasaur);		
		assertEquals(vidaBulbasaur-vidaBulbasaurBurbuja,5);
		assertEquals(unBulbasaur.getPuntosVida(),125);
	}
	
	@Test
	public void test03SquirtleAtacaConBurbujaYCanionADemasCriaturas() throws AtaqueNoDisponibleException{
		int danioBurbuja = 0;
		int danioCanion = 0;
		
		Squirtle unSquirtle = new Squirtle();
		Chansey unChansey= new Chansey();
		int vidaChansey = unChansey.getPuntosVida();
		
		unSquirtle.atacarConBurbuja(unChansey);
		danioBurbuja = vidaChansey - unChansey.getPuntosVida();
		unSquirtle.atacarConCanionDeAgua(unChansey);	
		danioCanion = vidaChansey + danioBurbuja - unChansey.getPuntosVida();
		
		Rattata unRattata= new Rattata();
		int vidaRattata = unRattata.getPuntosVida();
		
		unSquirtle.atacarConBurbuja(unRattata);
		danioBurbuja = danioBurbuja + (vidaRattata - unRattata.getPuntosVida());
		unSquirtle.atacarConCanionDeAgua(unRattata);	
		danioCanion = (vidaRattata + danioBurbuja - unRattata.getPuntosVida());
		
		Jigglypuff unJigglypuff= new Jigglypuff();
		int vidaJigglypuff = unJigglypuff.getPuntosVida();
		
		unSquirtle.atacarConBurbuja(unJigglypuff);
		danioBurbuja = danioBurbuja + (vidaJigglypuff - unJigglypuff.getPuntosVida());
		unSquirtle.atacarConCanionDeAgua(unJigglypuff);	
		danioCanion = (vidaJigglypuff + danioBurbuja - unJigglypuff.getPuntosVida());
		
		assertEquals(danioBurbuja,30);
		assertEquals(danioCanion,60);
	}
	
	@Test
	public void test04BulbasaurYChanseyAtacanConLatigoCepaASquirtle() throws AtaqueNoDisponibleException{
		Squirtle unSquirtle = new Squirtle();
		Chansey unChansey= new Chansey();
		Bulbasaur unBulbasaur= new Bulbasaur();
		int vidaSquirtle = unSquirtle.getPuntosVida();
		
		unBulbasaur.atacarConLatigoCepa(unSquirtle);
		int danioBulba = vidaSquirtle - unSquirtle.getPuntosVida();
		
		unChansey.atacarConLatigoCepa(unSquirtle);
		
		int danioChansey = vidaSquirtle - danioBulba - unSquirtle.getPuntosVida();
		
		assertEquals(danioBulba,30);
		assertEquals(danioChansey,30);		
	}
	
	@Test
	public void test05BulbasaurYChanseyAtacanConLatigoCepaACharmander() throws AtaqueNoDisponibleException{
		Chansey unChansey= new Chansey();
		Bulbasaur unBulbasaur= new Bulbasaur();
		Charmander unCharmander = new Charmander();		
		int vidaCharmander = unCharmander.getPuntosVida();
		
		unBulbasaur.atacarConLatigoCepa(unCharmander);
		int danioBulba = vidaCharmander - unCharmander.getPuntosVida();
		
		unChansey.atacarConLatigoCepa(unCharmander);
		
		int danioChansey = vidaCharmander - danioBulba - unCharmander.getPuntosVida();
		assertEquals(danioBulba,7);
		assertEquals(danioChansey,7);	
		
	}
	
	@Test
	public void test06BulbasaurYChanseyAtacanConLatigoCepaADemasCriaturas() throws AtaqueNoDisponibleException{
		Chansey unChansey= new Chansey();
		Bulbasaur unBulbasaur= new Bulbasaur();
		
		Rattata unRattata = new Rattata();		
		int vidaRattata = unRattata.getPuntosVida();
		
		unBulbasaur.atacarConLatigoCepa(unRattata);
		int danioBulba = vidaRattata - unRattata.getPuntosVida();
		unChansey.atacarConLatigoCepa(unRattata);
		
		int danioChansey = vidaRattata - danioBulba - unRattata.getPuntosVida();
		assertEquals(danioBulba,15);
		assertEquals(danioChansey,15);		
	}
	
	@Test
	public void test07CharmanderAtacaConBrasasABulbasaur() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Bulbasaur unBulbasaur= new Bulbasaur();
		
		int vidaBulbasaur = unBulbasaur.getPuntosVida();
		unCharmander.atacarConBrasas(unBulbasaur);
		int danioCharmander = vidaBulbasaur - unBulbasaur.getPuntosVida();
		assertEquals(danioCharmander,32);
	}
	
	@Test
	public void test08CharmanderAtacaConBrasasASquirtle() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle= new Squirtle();
		
		int vidaSquirtle = unSquirtle.getPuntosVida();
		unCharmander.atacarConBrasas(unSquirtle);
		int danioCharmander = vidaSquirtle - unSquirtle.getPuntosVida();
		assertEquals(danioCharmander,8);		
	}
	
	@Test
	public void test09CharmanderAtacaConBrasasADemasCriaturas() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Rattata unRattata = new Rattata();		
		int vidaRattata = unRattata.getPuntosVida();
		
		unCharmander.atacarConBrasas(unRattata);
		int danioCharmander = vidaRattata - unRattata.getPuntosVida();
		assertEquals(danioCharmander,16);			
	}
	
	@Test
	public void test10AlgomonesAtacanConAtaqueRapido() throws AtaqueNoDisponibleException{
		Charmander unCharmander = new Charmander();
		Squirtle unSquirtle= new Squirtle();
		
		int vidaSquirtle = unSquirtle.getPuntosVida();
		unCharmander.atacarConAtaqueRapido(unSquirtle);
		int danioCharmander = vidaSquirtle - unSquirtle.getPuntosVida();
		assertEquals(danioCharmander,10);		
	}
	
}